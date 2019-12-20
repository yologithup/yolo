package 练习;

import java.io.File;

/**
 * @author yolo
 * @date 2019/12/20-18:28
 */
public class Scanner {
    public static void scannerDir(TreeNode node ) {
        File[] files = node.file.listFiles();//返回该结点对应的文件目录下所有的文件
        if(files==null){
            return;
        }
        for (File file : files) {
            TreeNode child=new TreeNode();
            child.file=file;
            if(file.isDirectory()){
                scannerDir(child);
            }else {
                child.totalLength=file.length();
            }
            node.totalLength+=child.totalLength;
            node.children.add(child);
        }
    }

    private static void report(TreeNode root,int level) {
        for (int i = 0; i <level*4 ; i++) {
            System.out.print(" ");
        }
        System.out.println( root.file.getName());
        for (TreeNode node : root.children) {
            report(node,level+1);
        }
    }
    public static void main(String[] args) {
        String str="D:\\Program Files";
        TreeNode root=new TreeNode();
        root.file=new File(str);
        scannerDir(root);
        //遍历树，进行打印
        report(root,0);
    }
}
