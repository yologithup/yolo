
import java.util.Arrays;

/**
 * @author yolo
 * @date 2019/9/26-17:49
 * 1.
 */
public class Heap {
    private static void CreatedBigHead(int[]arr){

    }
    //向下调整--小堆
    private static void shiftDown(int[]arr,int index){
        int left=2*index+1;
        int size= arr.length;
        while(left<size){
            int minIndex=left;
            int right=left+1;
            if(right<size){
                if(arr[left]>arr[right]){
                    minIndex=right;
                }
                if(arr[index]<=arr[minIndex]){
                    break;
                }
            }
            swap(arr,index,minIndex);
            index=minIndex;
            left=2*index+1;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int[]arr={27,15,19,18,28,34,65,49,25,37};
        shiftDown(arr,0);
        System.out.println(Arrays.toString(arr));
    }
}
