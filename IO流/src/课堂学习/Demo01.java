package 课堂学习;

import java.io.File;
import java.io.IOException;

/**
 * @author yolo
 * @date 2019/11/29-18:35
 * 流的概念：
 * 1.如何从Input中把数据读到进程中
 * 2.如何把数据输出到Output去
 *
 * 程序设计中的分层问题
 *      继承实现
 *      操作系统
 *      界面-操作-数据存储
 *  数据源----->需要的的数据
 *      1.输入源可能有很多
 *      2.整个数据流上回右各种各样的加工厂（一个一个对象）
 *
 *  文件：
 *      定义：操作系统组织数据的一种方式
 *          ①硬盘上的文件80%
 *          ②硬盘，网络，屏幕
 *      Java中用来描述文件用的是：File
 *          相关操作（是否存在，目录。。。。）
 *  绝对路径：
 *      定义：从根目录开始的文件路径（根路径在不同系统上表现形式不一样）
 *  相对路径：
 *      定义：
 *          相对于进程的工作路径（Java不可再程序中修改工作路径，其他语言可以）
 *          程序启动时的路径（工作路径），只是一般情况下在项目的根路径下运行
 *          也就是你在哪启动Java代码，就是哪
 *      如何观察当前工作路径：System.getProperty("");
 *      回到上一级路径：cd..   .当前路径
 *  IO流
 *
 *
 *
 *
 */
public class Demo01 {

    public static void main(String[] args) throws IOException {
        /*1.创建指定路径文件对象
            ①创建指定路径文件对象
            ⑤同上，但可以指明父路径和子路径
         */

        File file=new File("D:\\ideacode\\测试目录");
        File file1=new File("D:\\ideacode\\测试目录","子目录");
        file.createNewFile();//创建文件文件时可能出现异常--受查异常
        //2.创建文件夹
        file1.mkdir();
        file1.mkdirs();//帮助创建当前中间不存在的路径
        /*
        查看当前文件的所有文件
        public static boolean isHidden(Path path) throws IOException告知文件是否被隐藏
         */
        File allFile=new File("D:\\ideacode\\测试目录");
        File[]files=allFile.listFiles();
        for (File file2 : files) {
            System.out.println(file2);
        }
        //常用方法
        /*
        public boolean exists() 测试指定路径中文件或者目录是否存在
        public boolean canExecute()测试应用程序是否可以执行此抽象路径名表示的文件
        public boolean isDirectory() 判定一个文件是目录
        public boolean isFile() 判定是否是文件
        public boolean delete() 删除文件
        public boolean createNewFile() throws IOException 创建一个新的文件
        public static File[] listRoots()列出可用的文件系统根
        public boolean renameTo(File dest)重命名由此抽象路径名表示的文件
        public boolean isDirectory()测试此抽象路径名表示的文件是否为目录
         */
        System.out.println(file.exists());
        System.out.println(file.isDirectory());

        System.out.println(file.isFile());
        System.out.println(file.delete());
        file.deleteOnExit();//在JVM退出时删除文件
    }
}
