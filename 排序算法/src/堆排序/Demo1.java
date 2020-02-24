package 堆排序;

import java.util.Arrays;

/**
 * @author yolo
 * @date 2020/2/23-22:59
 */
public class Demo1 {
    public static void main(String[] args) {
        int[]arr={5,8,6,3,9,2,1,7};//按照从小到大的顺序进行排列
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int[] arr) {//排序
        //1.先将无序数组工造成大堆
        creatHeap(arr);
        //2.循环删除堆顶元素，移到集合尾部，调整堆产生新的堆顶
        for (int i = arr.length-1; i >=0 ; i--) {
            swap(arr,0,i);//第一个元素和最后一个元素进行交换
            //向下调整
            downAdjust(arr,0,i);
        }
    }

    public static void creatHeap(int[] array){//构建堆
        //从最后一个非叶子结点开始做下沉调整
        for (int i = (array.length-2)/2 ;i>=0 ;i--) {
            downAdjust(array,i,array.length);
        }
    }

    private static void downAdjust(int[] array, int parent, int length) {
        int left=2*parent+1;
        int max;//孩子节点中最小节点的下标
        while (left<length){
             max=left;
            int right=2*parent+2;//left+1
            if(right<length){
                if(array[right]>array[left]){
                    max=right;
                }
            }
            if(array[parent]>=array[max]){
                break;
            }
            swap(array,parent,max);//交换父节点
            //哪个子节点被替换，则表示哪边可能不再是堆结构，需要进行下沉操作，保证北条真够依旧是堆结构
            parent=max;
            left=2*parent+1;
        }
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
}
