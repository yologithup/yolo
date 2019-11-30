package 数学问题;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/30-23:19

 * 给定一系列正整数，请按要求对数字进行分类，并输出以下5个数字：
 *
 *
 *
 * A1 = 能被5整除的数字中所有偶数的和；
 *
 * A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
 *
 * A3 = 被5除后余2的数字的个数；
 *
 * A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
 *
 * A5 = 被5除后余4的数字中最大数字。
 *
 * 输入描述:
 * 每个输入包含1个测试用例。每个测试用例先给出一个不超过1000的正整数N，随后给出N个不超过1000的待分类的正整数。数字间以空格分隔。
 *
 *
 * 输出描述:
 * 对给定的N个正整数，按题目要求计算A1~A5并在一行中顺序输出。数字间以空格分隔，但行末不得有多余空格。
 * 若其中某一类数字不存在，则在相应位置输出“N”。
 * 示例1
 * 输入
 * 13 1 2 3 4 5 6 7 8 9 10 20 16 18
 * 输出
 * 30 11 2 9.7 9
 */
public class Main09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        List<Integer> A1 = new ArrayList<>();
        List<Integer> A2 = new ArrayList<>();
        List<Integer> A3 = new ArrayList<>();
        List<Integer> A4 = new ArrayList<>();
        List<Integer> A5 = new ArrayList<>();
        int N=input.nextInt();
        while (N-->0) {
            int n = input.nextInt();
            if (n % 5 == 0 && n % 2 == 0) {
                A1.add(n);
            }
            if (n % 5 == 1) {
                A2.add(n);
            }
            if (n % 5 == 2) {
                A3.add(n);
            }
            if(n%5==3){
                A4.add(n);
            }
            if (n % 5 == 4) {
                A5.add(n);
            }
        }
            int num1=0;
            for (int i = 0; i <A1.size() ; i++) {
                num1+= A1.get(i);
            }
            int num2=0;
            for (int i = 0; i < A2.size(); i++) {
                num2+=Math.pow(-1,i)*A2.get(i);
            }
            int num3=A3.size();
            int num4=0;
            for (int i = 0; i < A4.size(); i++) {
                num4+=A4.get(i);
            }
            int num5=0;
            for (int i = 0; i <A5.size() ; i++) {
                if(A5.get(i)>num5){
                    num5=A5.get(i);
                }
            }
            if(A1.size()==0){
                System.out.print("N ");
            }else {
                System.out.print(num1+" ");
            }
        if(A2.size()==0){
                System.out.print("N ");
            }else {
                System.out.print(num2+" ");
            }
        if(A3.size()==0){
                System.out.print("N ");
            }
            else {
                System.out.print(num3+" ");
            }
        if(A4.size()==0){
                System.out.print("N ");
            }
            else {
                System.out.printf("%.1f ",1.0 * num4 / A4.size());
            }
        if(A5.size()==0){
                System.out.print('N');
            }
            else {
                System.out.print(num5);
            }
        }
}
