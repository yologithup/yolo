package 基础;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/12/14-14:51
 * 问题描述
 * Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
 *
 * 当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
 *
 * 输入格式
 * 输入包含一个整数n。
 * 输出格式
 * 输出一行，包含一个整数，表示Fn除以10007的余数。
 * 说明：在本题中，答案是要求Fn除以10007的余数，因此我们只要能算出这个余数即可
 * 而不需要先计算出Fn的准确值，再将计算的结果除以10007取余数直接计算余数往往比先算出原数再取余简单。
 *
 * 样例输入
 * 10
 * 样例输出
 * 55
 * 样例输入
 * 22
 * 样例输出
 * 7704
 * 数据规模与约定
 * 1 <= n <= 1,000,000。
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(Fibonacci(n));
    }

    private static int  Fibonacci(int n) {
        int a=1,b=0,c=0;
        for (int i = 0; i <=n ; i++) {
            c=(a+b)%10007;
            a=b%10007;
            b=c%10007;
        }
        return a;
    }
}
