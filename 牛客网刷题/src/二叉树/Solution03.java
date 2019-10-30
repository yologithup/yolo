package 二叉树;

/**
 * @author yolo
 * @date 2019/10/30-19:10
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 *
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 *
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class Solution03 {
    public boolean isSameTree(TreeNode root1, TreeNode root2) {
        if(root1==null&&root2==null){
            return true;
        }
        if(root1==null||root2==null){
            return false;
        }
        return root1.val==root2.val&&isSameTree(root1.left,root2.left)&&isSameTree(root1.right,root2.right);
    }
    public boolean isSubtree(TreeNode root1, TreeNode root2) {
        if(root1==null||root2==null){
            return false;
        }
        return isSameTree(root1,root2)||isSubtree(root1.left,root2)||isSubtree(root1.right,root2);
    }
}
