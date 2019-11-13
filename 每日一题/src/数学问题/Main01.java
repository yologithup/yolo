package 数学问题;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/13-18:55
 * 求最小公倍数
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int A=input.nextInt();
        int B=input.nextInt();
        int minMultiple=0;
        int min=A>B?B:A;
        for (minMultiple = min;  ; minMultiple++) {
            if(minMultiple%A==0&&minMultiple%B==0){
                break;
            }
        }
        System.out.println(minMultiple);
    }
}
