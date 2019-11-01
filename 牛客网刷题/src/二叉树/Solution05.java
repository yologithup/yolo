package 二叉树;

/**
 * @author yolo
 * @date 2019/11/1-21:47
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * 左右根
 * 左子树<根<右子树
 * 思路：先利用左子树<根找出左右子树的分界点，找出左子树
 *      再利用根<右子树判断数组后部分是否满足右子树的特点
 *
 */
public class Solution05 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null||sequence.length==0){//注意为null的情况，数组为空，或者数组长度为null，均返回false
            return false;
        }
        return isTree(0,sequence.length-1,sequence);
    }

    private boolean isTree(int star, int end, int[] sequence) {
        if(star>=end){
            return true;
        }
        int root=sequence[end];
        int split=star;
        while(split<end&&sequence[split]<root){
            split++;//找出左子树
        }
        for(int i=split;i<end;i++){
            if(sequence[i]<root){
                return false;//若不满足根<右子树，则返回false
            }
        }
        return isTree(star,split-1,sequence)&&isTree(split,end-1,sequence);
    }
}
