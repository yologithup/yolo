package 字符串;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/15-20:59
 * 题目描述
 * 描述：
 *
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 * 输入描述:
 * 输入一个int整数
 *
 * 输出描述:
 * 将这个整数以字符串的形式逆序输出
 *
 * 示例1
 * 复制
 * 1516000
 * 输出
 * 0006151
 */
public class Main05 {
    /*//方法一：利用计算
   public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       while (n >0) {
           System.out.print(n%10);
           n=n/10;
       }
   }*/
    //方法二：利用StringBuffer的常用方法reserve
    //注意：nextLine()的返回值是String类型，而String类型没有reserve
    //     但同时String又不可以直接强转为StringBuffer，因此需要借助StringBuffer的构造方法StringBuffer（String str）
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        StringBuffer s=new StringBuffer(str);
        System.out.println(s.reverse());
    }
}
