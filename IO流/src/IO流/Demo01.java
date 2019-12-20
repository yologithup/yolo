package IO流;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author yolo
 * @date 2019/12/20-15:56
 * 写入：
     * 流：最终为二进制，默认编码UTF-8
     * 输入字符串时，需要先将其转化为字节码
     * 1.先创建一个文件
     * 2.对文件进行读写操作
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        String path ="E:\\java文件测试";
        File file=new File(path,"test.txt");
        file.createNewFile();

        //OutputStream是一个接口，需要具体的实现类
        OutputStream os=new FileOutputStream(file);
        //1.写入字符
        os.write('a');
        os.write('b');
        os.write('c');
        //2.写入字符串--需要进行字符串到字节码数组的转换
        String str="我是中国人";
        byte[] buf = str.getBytes();//将文本文件转换为字节流
        os.write(buf);


    }
}
