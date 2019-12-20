package 练习;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yolo
 * @date 2019/12/20-18:32
 */
public class TreeNode {
    File file;
    long totalLength;//汇总该文件夹下所有文件的大小
    List<TreeNode> children=new ArrayList<>();
}
