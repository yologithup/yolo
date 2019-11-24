package 生活中的算法;

import javax.security.sasl.SaslClient;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author yolo
 * @date 2019/11/24-19:45
 */
public class Main10 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        while(input.hasNext()){
            int N=input.nextInt();
            int[]trains=new int[N];
            for (int i = 0; i < trains.length; i++) {
                trains[i]=input.nextInt();
            }
            for (int i = 0; i < trains.length; i++) {
                //进站立马出战
                Stack<Integer>stack=new Stack<>();
                stack.add(trains[i]);
                for (int j = 0; j < trains.length; j++) {
                    if(i==j){
                        System.out.println(stack.pop());
                        j++;
                    }else {
                        stack.add(trains[j]);
                        stack.pop();
                    }
                }
            }
        }
    }
}
