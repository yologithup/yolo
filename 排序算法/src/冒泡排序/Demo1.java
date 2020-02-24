package 冒泡排序;

import java.util.Arrays;

/**
 * @author yolo
 * @date 2020/2/22-14:28
 * 是一种基础交换排序
 * 思想：以从小到大为例
 * 相邻的两个元素做比较,当一个元素大于右侧相邻的元素时，交换位置。
 * 当一个元素小于于右侧相邻的元素时，位置不变
 */
public class Demo1 {
    public static void main(String[] args) {
        int[]arr={5,8,6,3,9,2,1,7};//按照从小到大的顺序进行排列
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //双向冒泡排序
    private static void sort(int[] arr){
        int temp=0;
        //从左向右
        for (int i = 0; i <arr.length/2 ; i++) {
            boolean isSorted=true;
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    isSorted=false;
                }
            }
            if(isSorted){
                break;
            }
            //从右向左
            isSorted=true;//记得要将isSorted置为true
            for (int j = arr.length-1-i; j>i;j--) {
                if(arr[j]<arr[j-1]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    isSorted=false;
                }
            }
            if(isSorted){
                break;
            }
        }
    }
//
//    private static void sort(int[] arr) {
//        int lastExchangeIndex=0;//最后一次交换的位置
//        int sortBorder=arr.length-1;
//        for (int i = 0; i <arr.length-1 ; i++) {
//            boolean isSorted=false;//isSorted:作为标记，标志本轮是否进行排序，如果没有表示已经有序
//            for (int j = 0; j < sortBorder; j++) {//将无序区间做调整，调整为最后一次元素减缓的位置
//                int temp=0;
//                if(arr[j]>arr[j+1]){
//                    isSorted=true;
//                    temp=arr[j+1];
//                    arr[j+1]=arr[j];
//                    arr[j]=temp;
//                    lastExchangeIndex=j;//更新为最后一次元素交换的位置
//                }
//            }
//            sortBorder=lastExchangeIndex;
//            if(!isSorted){
//                break;
//            }
//        }
//    }
}
