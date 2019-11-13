package 数学问题;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/13-19:38
 * 输入A，B,求最大公约数，最小公倍数
 * 最小公倍数=A*B/最大公约数
 *
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int A=input.nextInt();
        int B=input.nextInt();
        int max=method(A,B);
        System.out.println("最大公约数："+max);
        int min=A*B/max;
        System.out.println("最小公倍数："+min);
    }

    private static int method(int a, int b) {
        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        while(b!=0){
            int mod=a%b;
            a=b;
            b=mod;
        }
        return a;
    }
}
