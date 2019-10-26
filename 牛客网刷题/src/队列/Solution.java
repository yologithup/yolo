package 队列;

/**
 * @author yolo
 * @date 2019/10/26-22:43
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    //进队列
    public void push(int node) {
        stack1.push(node);
    }
    //出队列
    public int pop() {
        //如果stack2为空，才能入栈
        if(stack2.size()<=0){
            //如果stack1不为空，才能出栈，从而进行stack2的入栈
            while(stack1.size()!=0){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}