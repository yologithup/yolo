package 字符串;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/15-20:59
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
