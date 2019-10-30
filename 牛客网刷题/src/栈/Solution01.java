package 栈;

import java.util.Stack;

/**
 * @author yolo
 * @date 2019/10/30-20:55
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 *
 * 思路：创建一个最小栈存储当前栈的最小值或的的关于当前栈的最小值的值
 */
public class Solution01 {
    Stack<Integer>stack=new Stack<>();
    Stack<Integer>min=new Stack<>();
    public void push(int node) {
        if(stack.isEmpty()){
            min.push(node);
        }else{
            if(node<=min.peek()){//方便起见，一定要写成小于等于
                min.push(node);
            }
        }
        stack.push(node);
    }

    public void pop() {
        if(stack.isEmpty()){
            return;
        }else {
            if(stack.peek()==min.peek()){
                min.pop();
            }
            stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min.peek();
    }
}
