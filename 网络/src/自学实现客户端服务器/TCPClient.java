package 自学实现客户端服务器;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author yolo
 * @date 2019/12/22-21:22
 * TCP 通信的客户端：向服务器发送连接请求，给服务器发送数据，读取服务器回写的数据
 * 表示客户端的类：
 *      java.net.Socket：该类实现客户端套接字（也称为“套接字”）。 套接字是两台机器之间通讯的端点。
 *      套接字：包含IP地址（确定计算机）和端口号（确定进程）的网络单位
 *   构造方法：Socket(String host, int port)：创建流套接字并将其连接到指定主机上的指定端口号。
 *      host - 主机名，或 null的环回地址。
 *      port - 端口号。
 *   成员方法：
 *      InputStream getInputStream()：返回此套接字的输入流。
 *          结果：用于从该套接字读取字节的输入流。
 *      OutputStream getOutputStream()：返回此套接字的输出流。
 *          结果：用于将字节写入此套接字的输出流。
 *      void close()：关闭此套接字。
 *
 * 实现步骤：
 *  １.创建一个客户端对象Socket，构造方法绑定服务器的IP地址和端口号
 *  ２.使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
 *  ３.使用网络字节输出流OutputStream对象中的方法write（）给服务器发送数据
 *  ４.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
 *  ５.使用网络字节输出流InputStream对象中的方法read（），读取服务器回写的数据
 *  ６.流使用完毕后调用close（）关闭Socket
 * 注意：
 *      １.客户端和服务器进行交互，必须使用Socket中提供的网络流，不能使用自己创建的流对象
 *      ２.当我们创建你客户端对象Socket时，就回去请求服务器和服务器进行三次握手建立连接通路
 *          如果服务器没有启动，就会抛出异常
 *          如果服务器已经启动，那么就可以进行交互
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",8888);//端口号要确保不被占用
        OutputStream os=socket.getOutputStream();
        os.write("你好服务器".getBytes());
        InputStream is=socket.getInputStream();

        byte[]bytes=new byte[1024];
        int len=is.read(bytes);
        String message=new String(bytes);
        System.out.println(message);
        socket.close();
    }
}
