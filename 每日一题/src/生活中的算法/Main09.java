package 生活中的算法;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author yolo
 * @date 2019/11/23-11:36
 * 
 */
public class Main09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            if(n==0){
                return;
            }
            int[]grades=new int[n];
            for (int i = 0; i <n ; i++) {
                grades[i]=input.nextInt();
            }
            int count=0;
            int flag=input.nextInt();
            for (int i = 0; i < grades.length; i++) {
                if(flag==grades[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
