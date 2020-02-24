package 快速排序;

import java.util.Arrays;

/**
 * @author yolo
 * @date 2020/2/23-19:50
 */
public class Demo1 {
    public static void main(String[] args) {
        int[]arr={5,8,6,3,9,2,1,7};//按照从小到大的顺序进行排列
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void sort(int[]arr,int startIndex,int endIndex){
        if(startIndex>=endIndex){//递归出口
            return ;
        }

        //得到基准元素的位置,采用分治法
        int pivotIndex=partition(arr,startIndex,endIndex);

        //根据基数，分成两部分进行递归排序
        sort(arr,startIndex,pivotIndex-1);
        sort(arr,pivotIndex+1,endIndex);

    }

    private static int partition(int[] arr, int startIndex, int endIndex) {
        int pivot=arr[startIndex];//基数
        int left=startIndex;
        int right=endIndex;
        while (left<right){
            //控制right指针比较并左移
            while (arr[right]>pivot&&left<right){
                right--;
            }
            //控制left指针比较并右移
            while(arr[left]<=pivot&&left<right){//注意此处是小于等于
                left++;
            }

            //交换left和right所致的元素
            if(left<right){
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
            }
        }

        //pivot基数和指针重合点交换
        arr[startIndex]=arr[left];
        arr[left]=pivot;
        return left;
    }
}
