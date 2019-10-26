package 斐波那契额数列;

/**
 * @author yolo
 * @date 2019/10/26-23:16
 * 非递归
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Solution01 {
    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        int a=1;
        int b=0;
        int c=0;
        for(int i=1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}
