package 二叉树;

import java.util.Arrays;

/**
 * @author yolo
 * @date 2019/10/26-21:44
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * 链接：https://www.nowcoder.com/questionTerminal/8a19cbe657394eeaac2f6ea9b0f6fcf6?answerType=1&f=discussion
 * 来源：牛客网
 *
 * 思路：
 * 前序遍历：根→左→右
 * 中序遍历：左→根→右
 *
 * 由前序遍历序列pre={1,2,4,7,3,5,6,8}可知根结点是1；
 * 则在中序遍历序列in={4,7,2,1,5,3,8,6}中找到1，便可知1所在位置的左侧是左子树,1所在位置的右侧是右子树；
 * 递归调用：将左子树和右子树分别看成一颗树，将其前序遍历序列、中序遍历序列分别传入到该方法中，便可得到左子树的根结点、右子树的根结点。
 *      此时需要用第一步得到的根结点连接它们；
 * 递归调用的终止条件：直到传入数组为空，说明已经没有节点，直接返回null。
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0||in.length==0){
            return null;
        }
       TreeNode root=new TreeNode(pre[0]);
        for(int i=0;i<in.length;i++){
            if(root.val==in[i]){
                root.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                root.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return root;
    }
}
/*

import java.util.Arrays;
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
       //递归调用的终止条件
       if(pre.length == 0 || in.length == 0){
            return null;
       }
       //由前序遍历得到该二叉树的根结点
       TreeNode root = new TreeNode(pre[0]);
       //在中序遍历中找根结点位置，进行左右子树的划分
       for(int i = 0; i < in.length; i++){
           if(root.val == in[i]) {
            //找到根结点位置便跳出循环
            break;
           }
       }
        //将左子树看成一棵二叉树调用该方法，可以得到左子树根结点，即上面根结点的左子结点
        root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
        //将右子树看成一棵二叉树调用该方法，可以得到右子树根结点，即上面根结点的右子结点
        root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
       //返回根结点
       return root;
    }
}
 */