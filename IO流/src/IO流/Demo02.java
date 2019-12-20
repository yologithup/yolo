package IO流;

import java.io.*;

/**
 * @author yolo
 * @date 2019/12/20-16:36
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        String path="E:\\java文件测试\\test.txt";
        File file=new File(path);
        InputStream is=new FileInputStream(file);
        /*
            int b;
            while ( (b=is.read())!=-1){//当is.read==-1时表示已经读到啦文件的尾部（是指文件已经读完，并不是指读到回车）
                System.out.println(b);    //此时的b时字节码，需要利用String的构造方法进行转化，转化为我们所认识的东西
            }
       */
        byte[]buf=new byte[1024];
        is.read(buf);//将该字节流中所有字节读入到字节数组buf中
        String str=new String(buf,"UTF-8");//利用String的构造方法进行转化，转化为我们所认识的东西
        System.out.println(str);
    }
}
