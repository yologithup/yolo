package 选择排序;

import java.util.Arrays;

/**
 * @author yolo
 * @date 2020/2/24-18:33
 */
public class Demo1 {
    public static void main(String[] args) {
        int[]arr={5,8,6,3,9,2,1,7};//按照从小到大的顺序进行排列
        selsctSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selsctSort(int[] arr) {
        for (int i = 0; i <arr.length-1 ; i++) {
            //无序去区间[0, arr.length - i)
            // 有序区间: [array.length - i, array.length)
            int max=0;//没糖比较，假设第一元素最大
            for (int index = 1; index <arr.length-i ; index++) {
                if(arr[index]>arr[max]){
                    max=index;//最大元素的下标
                }
            }

            //将最大元素方无序区间最后一个元素进行交换，是最大元素再无序区间最后
            int temp=arr[max];
            arr[max]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }

    }
}
