package 入门练习;
//序列求和

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/12/14-15:24
 * 求1+2+3+...+n的值。
 */
public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //锦囊1
        //使用求和公式计算结果，使用64位整型(C++:long long, C:long long, Java:long)来保存结果和进行中间运算。
        //锦囊2
        //利用公式1+2+3+...+n=(1+n)*n/2来计算。注意这里的乘法运算时需要在64位整数下进行。
        long n = scanner.nextLong();
        System.out.println(n*(n+1)/2);
    }
}
