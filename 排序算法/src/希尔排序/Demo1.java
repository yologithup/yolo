package 希尔排序;

import java.util.Arrays;

/**
 * @author yolo
 * @date 2020/2/24-18:08
 * 也就是对元素先进性分组，然后再进行直接插入排序，直至组内元素只有一个
 * 相比直接插入，希尔排序知识下标变化的大喜爱不再是1而已
 * gap=(gap/3)+1;
 */
public class Demo1 {
    public static void main(String[] args) {
        int[]arr={5,8,6,3,9,2,1,7};//按照从小到大的顺序进行排列
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shellSort(int[] arr) {
        int gap=arr.length;//gap:间隙，也即是分组的大小
        while (gap>=1){
            insertSort(arr,gap);
            gap=gap/2;
        }
    }

    private static void insertSort(int[] arr, int gap) {
        for (int i = gap; i <arr.length ; i++) {
            int temp=arr[i];//无序区间第一个元素
            int j=i-gap;//i-gap:有序区间最后一个元素下标
            for (; j >=0&& arr[j]>temp; j-=gap) {
                arr[j+gap]=arr[j];
            }
            arr[j+gap]=temp;
        }
    }
}
