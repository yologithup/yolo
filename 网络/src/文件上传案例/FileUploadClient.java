package 文件上传案例;

import java.io.*;
import java.net.Socket;

/**
 * @author yolo
 * @date 2019/12/22-22:37
 * 文件上传案例的客户端：读取本地文件，上传到服务器，读取服务器诙谐的数据
 *   明确：
 *      数据源：c:\\1.jpg
 *      目的地：服务器
 *   实现步骤：
 *      1.创建一个本地的字节输入流FileInputStream对象，构造方法中绑定要读取的数据源
 *      2.创建一个客户端Socket对象，构造发给发中绑定服务器IP地址和端口号
 *      3.使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
 *      4.使用本地输入流FileInputStream对象中的read方法，读取本地文件
 *      5.使用网络字节输出流OutputStream对象中的方法write（），把读取到的数据上传到服务器
 *      6.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
 *      7.使用网络字节输出流InputStream对象中的方法read（）读取服务器写回的数据
 *      8.释放资源（Socket，FileInputStream）
 *
 *
 *   注意：
 *      客户端，服务器与本地的交互使用本地字节流
 *      客户端和服务器之间的交互使用网络流
 */
public class FileUploadClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("E:\\比特科技\\C语言作业.zip");
        Socket socket=new Socket("127.0.0.1",8888);
        OutputStream os=socket.getOutputStream();
        int len=0;
        byte[]bytes=new byte[1024];
        while((len=fis.read())!=-1){
            os.write(bytes,0,len);
        }
        InputStream is = socket.getInputStream();
        while((len=is.read())!=-1){
            System.out.println(new String(bytes,0,len));
        }
        //释放资源
        fis.close();
        socket.close();
    }
}
