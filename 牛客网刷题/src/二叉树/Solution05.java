package 二叉树;

import javax.crypto.AEADBadTagException;

/**
 * @author yolo
 * @date 2019/11/1-21:47
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class Solution05 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null||sequence.length==0){
            return false;
        }
        int root=sequence[sequence.length-1];
        int index=0;
        while(sequence[index]<root){
            index++;
        }
    }
}
