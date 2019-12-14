package 入门练习;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/12/14-15:13
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int r=input.nextInt();
        double area=Math.pow(r,2)*Math.PI;
        System.out.printf("%.7f",area);
    }
}
