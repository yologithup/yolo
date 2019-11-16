package 数学问题;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/16-12:29
 * 题目描述
 * Fibonacci数列是这样定义的：
 * F[0] = 0
 * F[1] = 1
 * for each i ≥ 2: F[i] = F[i-1] + F[i-2]
 * 因此，Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，
 * 在Fibonacci数列中的数我们称为Fibonacci数。
 * 给你一个N，你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1
 * 现在给你一个数N求最少需要多少步可以变为Fibonacci数。
 * 输入描述:
 * 输入为一个正整数N(1 ≤ N ≤ 1,000,000)
 * 输出描述:
 * 输出一个最小的步数变为Fibonacci数"
 * 示例1
 * 输入
 * 15
 * 输出
 * 2
 */
public class Main04 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        int fib=0;
        while((Fibonacci(fib))<=n){
            fib++;
        }
        int min=Math.min(Fibonacci(fib)-n,n-Fibonacci(fib-1));
        System.out.println(min);
    }

    private static int Fibonacci(int n) {
        int a=1,b=0,c=0;
        for (int i = 1; i <=n; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}


