package 归并排序;

import java.util.Arrays;

/**
 * @author yolo
 * @date 2020/2/24-18:58
 */
public class Demo1 {
    public static void main(String[] args) {
        int[]arr={5,8,6,3,9,2,1,7};//按照从小到大的顺序进行排列
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
    }
}
