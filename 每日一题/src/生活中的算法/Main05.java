package 生活中的算法;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/13-20:00
 */
public class Main05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int W=input.nextInt();
        int H=input.nextInt();
        int sum=0;
        sum=(W/4)*(H/4)*8;
        if(W%4==1){
            sum+=H/4*2;
        }
        if(W%4>=2){
            sum+=H/4*4;
        }
        if(H%4==1){
            sum+=W/4*2;
        }
        if(H%4>=2){
            sum+=W/4*4;
        }
        System.out.println(sum);
    }
}
