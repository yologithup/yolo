package 栈;

import java.util.Stack;

/**
 * @author yolo
 * @date 2019/10/30-22:09
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等
 * 例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 *
 * 思路：新建一个栈，将数组A压入栈中，当栈顶元素等于数组B时，就将其出栈，当循环结束时，判断栈是否为空，若为空则返回true.
 *
 */
public class Solution02 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer>stack=new Stack<>();
        int j=0;
        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while(!stack.isEmpty()&&stack.peek()==popA[j]){//此处一定保证栈不为空，只有栈不为空，才能对栈进行peek操作
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
