package 斐波那契额数列;

/**
 * @author yolo
 * @date 2019/10/26-23:21
 * 递归
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Solution02 {
    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return Fibonacci(n - 2) + Fibonacci(n - 1);
        }
    }
}
