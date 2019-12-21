package HTTP;

import java.io.IOException;
import java.net.Socket;

/**
 * @author yolo
 * @date 2019/12/21-15:07
 * 请求方法 路径 版本
 * 请求头：值
 * 。。。
 *
 */
public class SimpleHttpServer {
    public static void main(String[] args) throws IOException {
        String resquent="GET / HTTP/1.0\r\nHost: www.baidu.com\r\n\r\n";//请求格式
        Socket socket=new Socket("www.baidu.com",80);//创建套接字
        byte[]bytes=new byte[4096];
        int len=socket.getInputStream().read(bytes);
        String response=new String(bytes,0,len,"UTF-8");
        System.out.println(response);
    }
}
