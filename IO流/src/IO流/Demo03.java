package IO流;

import java.io.*;

/**
 * @author yolo
 * @date 2019/12/20-17:56
 * 将源文件的内容拷贝到目标文件
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {
        String path1="E:\\java文件测试\\test.txt";
        String path2="E:\\java文件测试\\目标文件.txt";
        //创建两个文件对象
        InputStream is=new FileInputStream(path1);
        OutputStream os=new FileOutputStream(path2);
        int b;
        while((b=is.read())!=-1){//从源文件读
            os.write(b);//写入目标文件
        }
    }
}
