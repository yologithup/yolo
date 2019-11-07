package 数组;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/7-13:00
 * 题目描述：
 *  有一组数，对于任意的两个数组，若前边的大于后边的，则这两个数组组成逆序对。
 *  给定一个int型数组A，和它的大小n。计算A中的逆序对数。保证n小于5000
 *  测试样例：
 *  [1,2,3,4,5,6,7,0],8
 *  返回7
 *
 */
public class Main01 {
    public static int  count(int[] A, int n) {
        // write code here
        int count=0;
        for (int i = 0; i < A.length; i++) {
            {
                for (int j = i+1; j < A.length; j++) {
                    if(A[i]>A[j]){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
        System.out.println(count(arr,n));
    }
}
