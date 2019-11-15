package 数学问题;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/15-20:21
 * 输入一个正整数n,求n!(即阶乘)末尾有多少个0？
 * 比如: n = 10; n! = 3628800,所以答案为2
 * 输入描述:
 * 输入为一行，n(1 ≤ n ≤ 1000)
 * 输出描述:
 * 输出一个整数,即题目所求
 * 示例1
 * 输入
 * 复制
 * 10
 * 输出
 * 复制
 * 2
 *
 * 思路：0的2和5的乘积
 *      很明显2的个数远大于五的个数，所以只需要计算5的个数即可
 */
public class Main03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(count(n));
    }

    private static int  count(int n) {
        int count=0;
        //判断每个数里包含几个5
        for (int i = n; i >=5 ; i--) {
            int temp=i;
            while(temp%5==0){
                count++;
                temp=temp/5;
            }
        }
        return count;
    }
}
