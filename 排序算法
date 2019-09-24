import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author yolo
 * @date 2019/9/24-18:50
 * 插入排序：
 *      有序区间：[0,i)
 *      无序区间：[i,a.length)
 *
 * 希尔排序：
 *      定义间隔 int gap=a.length;
 *      每次排序改变间隔：gap=(gap/3)-1;
 * 选择排序：
 *      (1)数据不敏感排序O(n^2)
 *      (2)不能保证稳定性
 *      有序区间：[0,a.length-i)
 *      无序区间：[a.length-i,a.length)
 *      每一次从无序区间选出最大（或最小）的一个元素，存放在无序区间的最后（或最前），直到全部待排序的数据元素排完
 * 双向选择排序：
 *      O(n^2)
 *      每一次从无序区间选出最小 + 最大的元素，存放在无序区间的最前和最后，直到全部待排序的数据元素排完
 * 堆排序
 *      利用向下调整构造大堆
 *      (1)向下调整
 *      (2)构造大堆
 */
public class Sort {
    //1.插入排序
    public static void insertSort1(int[]arr){
        for(int i=0;i<arr.length;i++){
            //有序[0，i）
            //无序[i,arr.length)
            int key=arr[i];
            int j;
            for(j=i-1;j>=0&&arr[j]>key;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=key;
        }
    }
    //2.希尔排序
    public static void insertSort2(int[]arr){
        int gap= arr.length;

    }
    //3.选择排序
    public static void insertSort3(int[]arr){
        for(int i=0;i<arr.length;i++){
            int MinIndex=i;
            for(int j= i+1;j< arr.length;j++){
                if(arr[j]<arr[MinIndex]){
                    MinIndex=j;
                }
            }
            swap(arr,MinIndex, i);
        }
    }

    private static void swap(int[] arr, int minIndex, int i) {
        int temp=arr[minIndex];
        arr[minIndex]=arr[i];
        arr[i]=temp;
    }
    //双向选择排序
    public static void insertSort4(int[]arr){
        // 每次选最大的放到无序区间的最后
        for (int i = 0; i < arr.length - 1; i++) {
            // 无序 [0, array.length - i)
            // 有序 [array.length - i, array.length)
            int maxIndex = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[maxIndex]) {
                maxIndex = j;
            }
        }

        swap(arr, maxIndex, arr.length - i - 1);
        }
    }

    //堆排序
    public static void insrtSort5(int[]arr){
        createHeadBig(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            // 无序 [0, array.length - i)
            // 交换 array[0], array[length - i - 1]
            // 无序 [0, array.length - i - 1)
            // 无序长度 array.length - i - 1
            // 下标 0 进行向下调整
            swap(arr, 0, arr.length - i - 1);
            shiftDownBig(arr, 0, arr.length - i - 1);
        }
    }
    //创建大堆
    private static void createHeadBig(int[] arr) {
        for(int i= (arr.length-2)/2;i>=0;i--){
            shiftDownBig(arr, i, arr.length);
        }
    }
    //向下调整
    private static void shiftDownBig(int[] arr, int i, int length) {
        while (2 * i + 1 < length) {
            int max = 2 * i + 1;
            if (max + 1 < length && arr[max+1] > arr[max]) {
                max = max + 1;
            }
            if (arr[i] >= arr[max]) {
                return;
            }
            swap(arr, i, max);
            i = max;
        }
    }

    //private static void shiftDownBig(int)
    //冒泡排序
    private static void insertSort6(int[]arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag = false;
                }
            }
            if(flag){
                return;
            }
        }
    }

}
