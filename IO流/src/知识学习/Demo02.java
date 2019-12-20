package 知识学习;

import java.io.File;

/**
 * @author yolo
 * @date 2019/12/20-14:59
 * 遍历一个目录下的所有文件--相当于树的遍历
 * 栈对应深度--递归--栈
 *
 */
public class Demo02 {
    public static void main(String[] args) {
        String path="E:\\比特科技";
        File file=new File(path);
        listDir(file);
    }

    public static void listDir(File dir) {
        File[]files=dir.listFiles();//返回一个文件数组，表示由该抽象路径名表示的目录中的文件。
        for (File file : files) {//遍历文件数组，判断数组中的每个元素时目录还是文件
            if(file.isDirectory()){
                listDir(file);// 是目录继续递归调用函数，
            }else {
                System.out.println(file.getAbsoluteFile());//是文件直接打印该文件所对应的绝对路径
            }
        }

    }
}
