package 二叉树;

/**
 * @author yolo
 * @date 2019/11/30-22:53
 * 题目描述
 * 实现一个函数，检查二叉树是否平衡，平衡的定义如下，对于树中的任意一个结点,其两颗子树的高度差不超过1。
 * 给定指向树根结点的指针TreeNode* root，请返回一个bool，代表这棵树是否平衡。
 */
public class Main02 {
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root==null){
            return true;
        }
        int t=hight(root.left)-hight(root.right);
        if(Math.abs(t)<=1){
            return isBalance(root.left)&& isBalance(root.right);
        }else {
            return false;
        }
    }

    private int hight(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=hight(root.left);
        int right=hight(root.right);
        int max=Math.max(left,right);
        return max+1;
    }
}