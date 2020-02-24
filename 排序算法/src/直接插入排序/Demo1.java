package 直接插入排序;

import java.util.Arrays;

/**
 * @author yolo
 * @date 2020/2/24-17:54
 */
public class Demo1 {
    public static void main(String[] args) {
        int[]arr={5,8,6,3,9,2,1,7};//按照从小到大的顺序进行排列
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //有序区间[0,i)
            //无序区间[i,arr.length)
            int temp=arr[i];//无序区间第一个数
            int j=i-1;//i-1：有序区间最后一个元素下标
            for (; j >=0&&arr[j]>temp ; j--) {
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
    }
}
