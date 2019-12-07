package 自定义客户端服务器;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author yolo
 * @date 2019/12/7-10:02
 * 1.新建一个DatagramSocket
 *           protected  DatagramSocket(DatagramSocketImpl impl):
 *           使用指定的DatagramSocketImpl创建一个未绑定的数据报套接字。
 * 2.构造一个DatagramPacket用于接收长度的数据包length
 *    public DatagramPacket(byte[] buf,int length)
 *      length参数必须小于或等于buf.length 。
 *      参数
 *        buf - 用于保存传入数据报的缓冲区       length - 要读取的字节数。
 */
public class Severe {
    public static void main(String[] args) throws IOException {
        // 1. 新建一个 DatagramSocket
        DatagramSocket udpServerSocket = new DatagramSocket(9898);
        while (true) {
            byte[] receiveBuffer = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(
                    receiveBuffer,
                    receiveBuffer.length);
            // 2. 等着客户端来撩
            udpServerSocket.receive(receivePacket);
            InetAddress clientAddress = receivePacket.getAddress();
            System.out.printf("我从 %s:%d  收到了消息%n",
                    clientAddress.getHostAddress(),
                    receivePacket.getPort());
            System.out.printf("我一共收到了 %d 字节的数据%n", receivePacket.getLength());

            String message = new String(
                    receivePacket.getData(),
                    0,
                    receivePacket.getLength(),
                    "UTF-8");

            System.out.println(message);
        }

        //udpServerSocket.close();
    }
}
