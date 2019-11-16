package DP问题;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/16-18:37
 */
public class Main02 {
    public static void main(String[] args) {
        int[]arr={3,34,4,12,5,2};
        System.out.println(subset(arr,arr.length-1,10));
        System.out.println(subset(arr,arr.length-1,11));
        System.out.println(subset(arr,arr.length-1,12));
        System.out.println(subset(arr,arr.length-1,13));
        System.out.println(subset(arr,arr.length-1,14));
    }

    private static boolean subset(int[] arr,int i, int sum) {
        if(sum==0){
            return true;
        }
        else if(i==0){
            return arr[i]==sum;
        }
        else if(arr[i]>sum){
            return subset(arr,i-1,sum);
        }
        return subset(arr,i-1,sum)||subset(arr,i-1,sum-arr[i]);
    }


}
