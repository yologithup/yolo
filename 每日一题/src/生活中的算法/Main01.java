package 生活中的算法;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/7-12:36
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        while (n!=0){
            int count=calculate(n);
            System.out.println(count);
            n=input.nextInt();
        }
    }

    private static int calculate(int n) {
        int count=0;
        while(n>=2){
            if(n==2){
                count++;
                n=0;
            }else{
                int temp=n/3;
                count+=temp;
                n=n%3;
                n+=temp;
            }
        }
        return count;
    }
}
