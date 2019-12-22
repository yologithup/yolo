package 文件上传案例;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author yolo
 * @date 2019/12/22-22:59
 * 文件上传案例服务器：读取客户端上传的信息，保存到服务器硬盘，给客户端回写“上传成功
 *
 * 明确：
 *  数据源：客户端上传的文件
 *  目的地：服务器硬盘d:\\upload\\1.jpg
 *
 *  实现步骤：
 *     1.创建服务器ServerSocket对象
 *     2.使用ServerSocket对象中的方法accept，获取服务器Socket对象
 *     3.使用Socket对象中的方法getInputStream,获取网络字节输入流InputStream对象
 *     4.判断d:\\upload文件夹是否存在，不存在则建立
 *     5.创建一个本地字节输出流FileOutputStream对象，构造方法绑定要输出的目的地
 *     6.使用网络字节输入流InputStream对象中的read方法,读取客户端上传的文件
 *     7.使用本地字节输出流FileOutputStream对象中的write，把读取到的文件保存到服务器硬盘
 *     8.使用Socket对象中的方法getOutputStream()获取网络字节输入流OutputStream对象
 *     9.使用网络字节输出流OutputStream对象中的方法write（）,给客户端回写“上传成功”
 *     10.释放资源（FileOutputStream，ocket，ServerSocket）
 */
public class FileUploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();

        File file=new File("d:\\upload");
        if(!file.exists()){
            file.createNewFile();
        }

        FileOutputStream fos = new FileOutputStream(file + "\\c语言课件");

        byte[]bytes=new byte[1024];
        int len=0;
        while((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        OutputStream os = socket.getOutputStream();
        os.write("上传成功".getBytes());

        fos.close();
        serverSocket.close();
        socket.close();
    }
}
