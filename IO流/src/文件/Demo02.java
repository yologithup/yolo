package 文件;

import java.io.File;

/**
 * @author yolo
 * @date 2019/12/20-14:59
 * 遍历一个目录下的所有文件--相当于树的遍历
 * 分析：
 *  类似于树的深度遍历
 *  1.listFiles：返回一个数组，表示该路径名表示的目录中的文件
 *  2.遍历数组，判断是否为文件
 *      ①是文件直接打印
 *      ②是目录，继续递归调用
 */
public class Demo02 {
    public static void main(String[] args) {
        String path="E:\\比特科技";
        File file=new File(path);
        listDir(file);
    }

    private static void listDir(File dir) {
        File[]files=dir.listFiles();//返回一个文件数组，表示由该抽象路径名表示的目录中的文件。
        for (File file : files) {//遍历文件数组
            if(file.isDirectory()){//判断数组中的每个元素是否为目录
                listDir(file);// 是目录继续递归调用函数，
            }else {
                System.out.println(file.getAbsoluteFile()+" :"+file.length());//不是目录，是文件直接打印该文件所对应的绝对路径
            }
        }

    }
}
