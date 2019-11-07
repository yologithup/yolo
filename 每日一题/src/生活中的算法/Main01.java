package 生活中的算法;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/7-12:36
 * 题目描述：
 *  三个瓶子可以换取一瓶汽水。
 *  小张手上有十个空瓶子，他最多喝多可以喝多少瓶汽水
 *  方法如下：
 *      先用九个瓶子换取三个满瓶的，喝完后四个空瓶，用三个再换一瓶，喝完，此时还剩下两个。
 *      这时你可以问老板借一个瓶饮料喝完，用三个空瓶换一瓶饮料还给老板
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
                n = 0;
            }
            else{
                int temp=n/3;
                count+=temp;
                n=n%3;
                n+=temp;
            }
        }
        return count;
    }
}
