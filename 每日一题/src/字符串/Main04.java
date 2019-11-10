package 字符串;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author yolo
 * @date 2019/11/10-22:59
 * 对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
 *
 * 给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。
 *
 * 测试样例：
 * "(()())",6
 * 返回：true
 * 测试样例：
 * "()a()()",7
 * 返回：false
 * 测试样例：
 * "()(()()",7
 * 返回：false
 */
public class Main04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int len = input.nextInt();
        System.out.println(chkParenthesis(str,len));
//        Stack<Character> stack = new Stack<>();
//        for (int index = 0; index < str.length(); index++) {
//            if(str.charAt(index)==')'){
//                if(stack.size()==0){
//                    System.out.println(false);
//                }
//                else {
//                    stack.pop();
//                }
//            }else {
//                stack.push(str.charAt(index));
//            }
//        }
//        if(stack.size()==0){
//            System.out.println(true);
//        }else {
//            System.out.println(false);
//        }
    }

    private static boolean chkParenthesis(String A, int n) {
        Stack<Character>stack=new Stack<>();
        for (int index = 0; index <n ; index++) {
            if(A.charAt(index)==')'){
                if(stack.size()==0){
                    return false;
                }
                else {
                    stack.pop();
                }
            }else {
                stack.push(A.charAt(index));
            }
        }
        if(stack.size()==0){
            return true;
        }else {
            return false;
        }
    }
}