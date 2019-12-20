package 文件;

import java.io.IOException;

/**
 * @author yolo
 * @date 2019/12/20-13:12
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {

        /*
            //File的第一个构造方法
            File file=new File("E:\\java文件测试");//创建啦一个file对象-文件目录
            System.out.println(file.exists());//判断该目录是否存在
            System.out.println(file.isDirectory());//判断该目录下是否为文件夹

            //2.get相关操作
            System.out.println(file.getFreeSpace());//获取该目录所在盘符（例如E盘）的空闲空间
            System.out.println(file.getUsableSpace());//获取该目录所在盘符（例如E盘）的可用空间，一般情况下和空闲空间相等
            System.out.println(file.getTotalSpace());//获取该目录所在盘符（例如E盘）的总空间
            System.out.println(file.getAbsoluteFile());//获取该目录所在盘符（例如E盘）的绝对路径
            System.out.println(file.getParent());//获取该目录的上级路径（父路径）

            //3.判断该目录的三种权限----可读，可写，可执行
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.canExecute());

         */

        /*
           //File的第二个构造方法
            File file1=new File("E:\\java文件测试","text");//知识创建了一个对象，磁盘上是否已经创建好啦对应的文件需要根据自己的操作决定
            file1.createNewFile();//创建对象所对应的文件
            file1.delete();//删除文件
            file1.mkdir();//创建对象所对应的文件夹

            File file2=new File("\\java文件测试","1\\2\\2\\3\\test.txt");
            file2.mkdirs();//创建对象锁对应的文件夹，但会帮助你创建当前中间路径还未创建的文件
         */
    }
}
