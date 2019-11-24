package 二叉树;

/**
 * @author yolo
 * @date 2019/11/24-20:16
 */
public class Main01 {
    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
