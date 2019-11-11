package 生活中的算法;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/11-21:55
 */
public class Main04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        int num4=input.nextInt();
        int A=(num1+num3)/2;
        int B=(num2+num4)/2;
        int C=num2-B;
        //必须保证糖果数是整数
        if((num1+num3)%2==0&&(num2+num4)%2==0&&(A+B)==num3){
            System.out.println(A+" "+B+" "+C);
        }else {
            System.out.println("NO");
        }
    }
}
