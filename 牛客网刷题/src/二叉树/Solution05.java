package 二叉树;

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
        return isTree(0,sequence.length-1,sequence);
    }

    private boolean isTree(int star, int end, int[] sequence) {
        if(star>=end){
            return true;
        }
        int root=sequence[end];
        int index=star;
        while(index<end&&sequence[index]<root){
            index++;
        }
        for(int i=index;i<end;i++){
            if(sequence[i]<root){
                return false;
            }
        }
        return isTree(star,index-1,sequence)&&isTree(index,end-1,sequence);
    }
}
