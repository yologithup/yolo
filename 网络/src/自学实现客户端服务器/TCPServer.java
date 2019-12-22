package 自学实现客户端服务器;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author yolo
 * @date 2019/12/22-21:53
 * TCP通信服务器端：接收客户端的请求，读取客户端发送的数据，给客户端做出回应
 * 表示服务器的类：
 *      java.net.ServerSocket
 *  构造方法：
 *      ServerSocket(int port):创建绑定到指定端口的服务器套接字
 *      服务器必须先明确一件事，必须知道是哪个客户端请求的服务器，所以可以使用accept方法获取客户端对象Socket
 *  成员方法：
 *     Socket accept()：侦听要连接到此套接字并接受它
 *
 *   实现步骤：
 *      1.创建服务器ServerSocket对象
 *      2.使用ServerSocket对象中的方法accept，获取服务器Socket对象
 *      3.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
 *      4.使用网络字节输出流InputStream对象中的方法read（），读取客户端写的数据
 *      5.使用Socket对象中的方法getOutputStream()获取网络字节输入流OutputStream对象
 *     ３.使用网络字节输出流OutputStream对象中的方法write（）给客户端回写数据
 *     ６.释放资源（Socket，ServerSocket）
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8888);
        Socket socket=serverSocket.accept();

        InputStream is=socket.getInputStream();
        byte[]bytes=new byte[1024];
        int len=is.read(bytes);
        String message=new String(bytes);
        System.out.println(message);

        OutputStream os=socket.getOutputStream();
        os.write("收到啦，谢谢".getBytes());

        //释放资源
        socket.close();
        serverSocket.close();
    }
}
