import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author yolo
 * @date 2019/9/24-18:50
 * 排序：
 *      1.所有排序都需将整个区间划分成相应的有序和无序区间
 *
 *
 *
 *
 * 插入排序：
 *      有序区间：[0,i)
 *      无序区间：[i,a.length)
 *
 * 希尔排序：
 *      定义间隔 int gap=a.length;
 *      每次排序改变间隔：gap=(gap/3)+1或者gap/2;
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
 * 归并排序：
 *
 */
public class Sort {
    //1.直接插入排序
    public static void sort1(int[]arr){
        //有序区间[0,i)
        for(int i=1;i< arr.length;i++){
            int key=arr[i];//无序区间[i,arr.length),则key为第一个数
            int j;
            for(j=i-1;j>=0&&arr[j]>key;j--){
                    arr[j+1]=arr[j];
                }
                arr[j+1]=key;
        }
    }
    //2.希尔排序--直接插入的优化
    public static void sort2(int[]arr){
        int gap= arr.length;//间隔gap=gap/3+1或者gap/2
        while(gap>1){
            insertSortWithGap(arr,gap);
            gap=gap/2;
        }
        insertSortWithGap(arr,1);
    }
        //变形的插排
        private static void insertSortWithGap(int[] arr, int gap) {
            for(int i=gap;i<arr.length;i++){
                int key=arr[i];
                int j;
                for(j=i-gap;j>=0&&arr[j]>key;j-=gap){
                    arr[j+gap]=arr[j];
                }
                arr[j+gap]=key;
            }
        }
    //3.选择排序
    //每次找最大的放无序区间末尾
     public static void sort3(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            //无序[0,arr.length-i)
            //有序[arr.length-i,arr.length)
            int maxIndex=0;
            for(int j=0;j< arr.length-i;j++){
                if(arr[j]>arr[maxIndex]){
                    maxIndex=j;
                }
            }
            swap(arr, arr.length-1,maxIndex);
        }
     }
     //4.双向排序
    /**
     * 利用选择排序
     * 每次既找出最小的，也找出最大的
     * 无序区间[low,high]
     */
    public static void sort4(int[]arr){
        int low=0;
        int high= arr.length-1;
        while(low<high){
            int minIndex=low;
            int maxIndex=low;
            for(int i=low+1;i<=high;i++){
                if(arr[i]<arr[minIndex]){
                    minIndex=i;
                }
                if(arr[i]>arr[maxIndex]){
                    maxIndex=i;
                }
            }
            swap(arr,low,minIndex);
            if(maxIndex==low){
                maxIndex=minIndex;
            }//当最大的数正好是low 时需要更新maxIndex，因为他会被交换走
            swap(arr,high,maxIndex);
            low++;
            high--;
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    /**
     * 1.递归：
     *      在栈里进行
     * 2.非递归
     *      在堆里进行
     * @param arr
     */
    //归并排序
    //1.递归
    public static void mergeSort1(int[]arr){
        mergeSortInternal(arr,0,arr.length);
    }
    //2.非递归
    private static void mergeSort2(int[]arr){
        for(int i=1;i<arr.length;i*=2){
            for(int j=0;j< arr.length;j+=i*2){
                int low=j;
                int mid=j+i;
                if(mid> arr.length){
                    continue;
                }
                int high=mid+i;
                if(high> arr.length){
                    high= arr.length;
                }
                merge(arr,low,mid,high);
            }
        }
    }
    private static void mergeSortInternal(int[] arr, int begin, int end) {
        if(begin+1>=end){
            return;
        }
        int mid=(begin+end)/2;
        mergeSortInternal(arr,begin,mid);
        mergeSortInternal(arr,mid,end);
        merge(arr,begin,mid,end);
    }
    private static void merge(int[]arr,int low,int mid,int high){
        int i=low;
        int j=mid;
        int k=0;
        int []temp=new int[high-low];
        while(i<mid&&j<high){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while (i<mid){
            temp[k++]=arr[i++];
        }
        while (j<high){
            temp[k++]=arr[j++];
        }
        for(int x=0;x<high-low;x++){
            arr[low+x]=temp[x];
        }
    }



    public static void main(String[] args) {
        int[]a={9,5,2,7,3,6,4,8,9};
        int[]b=a.clone();
        int[]c=a.clone();
        int[]d=a.clone();
        int[]e=a.clone();
        sort1(a);
        System.out.println(Arrays.toString(a));
        sort2(b);
        System.out.println(Arrays.toString(b));
        sort4(c);
        System.out.println(Arrays.toString(c));
        mergeSort1(d);
        System.out.println(Arrays.toString(d));
        mergeSort2(e);
        System.out.println(Arrays.toString(e));
    }
}
