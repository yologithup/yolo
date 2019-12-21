package 课堂学习;

import java.io.*;
import java.net.Socket;

/**
 * @author yolo
 * @date 2019/12/21-9:11
 * 输入流
 *  源不同：从哪读？
 *      文件/网络（网卡/TCP连接）/内存/标准输入
 *
 */
public class InputStreanDemo {
    public static void main(String[] args) throws IOException {
        System.out.println(从字节流中获得字符数据(获取一个输入流()));
    }
    private static InputStream 获取一个输入流() throws IOException {
        //1.从文件中获取
        /*
            InputStream inputStream=new FileInputStream("本地文件.txt");
            return inputStream;
         */
        //2.从网络读--①给网络发出请求->②
        /*
            Socket socket=new Socket("www.baidu.com",80);
            OutputStream outputStream=socket.getOutputStream();
            Writer writer=new OutputStreamWriter(outputStream,"UTF-8");
            PrintWriter printWriter=new PrintWriter(writer,false);
            printWriter.print("GET/HTTP/1.0\r\n\r\n");
            printWriter.flush();//刷新

            InputStream inputStream =socket.getInputStream();
            return inputStream;
         */

        //3.从内存中读取

            //InputStream inputStream=new FileInputStream("本地文件.txt");//可以利用以下的方法虚拟内存
            byte[]buf="郭小天\r\n郭大大\r\n".getBytes();
            InputStream inputStream=new ByteArrayInputStream(buf);
            return inputStream;

        //4.从标准输入读
    }
    private static String 从字节流中获得字符数据(InputStream is) throws IOException {
        //第一种：直接使用字节流，利用字节数组
        /*  ①当buf的大小小于字节流大小时，很麻烦
            ②精确控制字符比较复杂（例如按行打印）
            byte[]buf=new byte[1024];
            int len=is.read(buf);//将字节流中的内容全部读入字节数组，并返回字节长度
            String message=new String(buf,0,len,"UTF-8");
            return message;
         */
        //第二种：将字节流转换为Reader（字符流），再利用字符数组
            /*1.将Reader存到字符数组
            缺点：数组可能不够大
                Reader reader=new InputStreamReader(is,"UTF-8");
                char[]buf=new char[1024];
                int len=reader.read(buf);
                String message=new String(buf,0,len);
                return message;
             */
            /*2.遍历Reader，将Reader逐个读取并加入StringBuffer sb中直到流的末尾（-1）。
            避免了上一个的缺点
                StringBuffer sb=new StringBuffer();
                Reader reader=new InputStreamReader(is,"UTF-8");
                char[]buf=new char[1024];
                int len;
                while((len=reader.read(buf))!=-1){
                    sb.append(len);
                }
                return sb.toString();
             */
            //3.将Reader流转换为BufferedReader，可以利用它的BufferedReader.readLine()整行读方法
                Reader reader=new InputStreamReader(is,"UTF-8");
                BufferedReader bufferedReader=new BufferedReader(reader);//BufferedReader可以支持BufferedReader.readLine()整行读
                String line;
                StringBuilder sb=new StringBuilder();
                while((line=bufferedReader.readLine())!=null){
                    sb.append(line+"\r\n");
                }
                return sb.toString();

            //第三种：Scanner

    }

}
