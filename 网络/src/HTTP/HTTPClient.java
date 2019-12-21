package HTTP;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/12/21-15:42
 */
public class HTTPClient {
    public static void main(String[] args) throws IOException {
        String request="GET / HTTP/1.0\r\nHost: www.baidu.com\r\n\r\n";
        Socket socket=new Socket("www.baidu.com",80);

        socket.getOutputStream().write(request.getBytes("UTF-8"));

        byte[]bytes=new byte[4096];
        int len=socket.getInputStream().read(bytes);
        int index=-1;
        for (int i = 0; i < len-3; i++) {
            if (bytes[i] == '\r' && bytes[i+1] == '\n' && bytes[i+2] == '\r' && bytes[i+3] == '\n') {
                index = i;
                break;
            }
        }

        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(bytes,0,index+4);
        Scanner scanner=new Scanner(byteArrayInputStream,"UTF-8");



        String statusLine=scanner.nextLine();
        System.out.println("状态行："+statusLine);

        String line;
        int ContentLength=0;
        while(!(line=scanner.nextLine()).isEmpty()){
           String []kv=line.split(":");
           String key=kv[0].trim();
           String value=kv[1].trim();
            System.out.println("响应头："+key+"="+value);
            if(key.equalsIgnoreCase("Content-Length")){
                ContentLength=Integer.valueOf(value);
            }
        }
        System.out.println(ContentLength);
        int 已读=len-index-4;
        int 还应读=ContentLength-已读;
        byte[]body=new byte[ContentLength];
        System.arraycopy(bytes,index+4,body,0,已读);
        //int read(byte[] b, int off, int len):从该输入流读取最多 len字节的数据为字节数组。
        int 实际读了=socket.getInputStream().read(body,已读,还应读);
        System.out.println(已读);
        System.out.println(还应读);
        System.out.println(实际读了);

        //FileOutputStream(String name):创建文件输出流以指定的名称写入文件
        FileOutputStream fileOutputStream=new FileOutputStream("百度.html");
        fileOutputStream.write(body);
    }
}
