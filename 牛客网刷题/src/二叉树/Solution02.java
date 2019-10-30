package 二叉树;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author yolo
 * @date 2019/10/28-21:43
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class Solution02 {
    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
