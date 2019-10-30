package 二叉树;

/**
 * @author yolo
 * @date 2019/10/28-21:43
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class Solution02 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null||root2==null){
            return false;
        }
        return isSameTree(root1,root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
    }
    public boolean isSameTree(TreeNode root1,TreeNode root2) {
        if(root1==null&&root2==null){
            return true;
        }
        if(root1==null||root2==null){
            return false;
        }

        return root1.val==root2.val&&isSameTree(root1.left,root2.left)&&isSameTree(root1.right,root2.right);
    }

}
