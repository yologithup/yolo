package 生活中的算法;

import java.util.Scanner;



/**
 * @author yolo
 * @date 2019/12/1-21:07
 */
public class Main15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            int a=input.nextInt();
            int[]engry=new int[n];
            for (int i = 0; i < n; i++) {
                engry[i]=input.nextInt();
            }
            for (int i : engry) {
                a+=method(i,a);
            }
            System.out.println(a);
        }
        input.close();
    }
    public static int method(int a,int b){
        int temp;//余数，当余数为0的时候，最后的a即为最大公约数
        if(a<b){
            temp=a;
            a=b;
            b=temp;
        }
        while(b!=0){
            temp=a%b;
            a=b;
            b=a;
        }
        return a;
    }
}
