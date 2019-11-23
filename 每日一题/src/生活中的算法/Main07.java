package 生活中的算法;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/22-16:39
 */
public class Main07 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int temp = Math.min(x % 1000000007, 1000000007 - x % 1000000007);
        System.out.println(method(x,temp));
    }
    public static int method(int x,int temp) {
        if(temp / (8 * x + 7)>100000){
            return -1;
        }
        if(temp==0){
            return 0;
        }
        if (temp % (8 * x + 7) == 0) {
            return temp / (8 * x + 7);
        }
        return method(x,temp-(4*x+3)) + 1;
    }
}
//4.22
