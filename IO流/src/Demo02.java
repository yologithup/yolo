import sun.misc.PostVMInitHook;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yolo
 * @date 2019/11/29-19:57
 *
 */
public class Demo02 {
   static Map<String ,Long>map=new HashMap<>();
    public static void main(String[] args) {
        File file = new File("E:\\比特科技");
        listDir(file);
    }
    public static void listDir(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                listDir(file);
            } else {
                System.out.println(file.getAbsolutePath() + ": " + file.length());
            }
        }
    }
}
