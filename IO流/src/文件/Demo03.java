package 文件;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * @author yolo
 * @date 2019/12/20-15:36
 * 选定一个根路径
 * 找到该盘符下，最大的一个文件
 */
public class Demo03 {
    public  static List<Map<String,Integer>>list=new ArrayList<>();
    public static void main(String[] args) {
        String path="E:\\Java自学视频";
        //listDir(new File(path));
    }

//    private static List<Map<String,Integer>>listDir(File dir) {
//        File[] files = dir.listFiles();
//        for (File file : files) {
//            if(file.isDirectory()){
//                listDir(file);
//            }else {
//                //list.add(Map<file.getAbsolutePath(),file.length()>);
//            }
//        }
//    }
}
