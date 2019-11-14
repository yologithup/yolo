package 最值;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/14-14:03
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[]arr1=new int[100];
        int i=0;
        while(input.hasNextInt()){
            arr1[i]=input.nextInt();
            i++;
        }
        int k=arr1[i-1];
        int[]arr2= Arrays.copyOfRange(arr1,0,i-2);
        Arrays.sort(arr2);
        if(k>arr2.length){
            return;
        }
        for (int j = 0; j <k; j++) {
            System.out.printf("%d ",arr2[j]);
        }
    }
}
