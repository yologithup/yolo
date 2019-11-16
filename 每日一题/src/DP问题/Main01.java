package DP问题;

/**
 * @author yolo
 * @date 2019/11/16-15:25
 *有一数组，相邻的数不可以取，求数组中元素的最大和
 */
public class Main01 {
    public static void main(String[] args) {
        int[]arr={1,2,4,1,7,8,3};
        System.out.println(rec_opt1(arr,arr.length-1));
    }

    //递归
    private static int rec_opt1(int[] arr,int i) {
        if(i==0){
            return arr[0];
        }
        if(i==1){
            return Math.max(arr[0],arr[1]);
        }
        //选
        int num1=rec_opt1(arr,i-2)+arr[i];
        //不选
        int num2=rec_opt1(arr,i-1);
        return Math.max(num1,num2);
    }


    //因为递做了很多重复的计算，归耗时比较长，我们可以将已经算过的数存储到数组里
    //利用迭代来实现，类似于斐波那契数列的非递归写法，返回最终的值即可
    private static int rec_opt2(int[] arr, int i) {
        int[]temp=new int[arr.length];
        temp[0]=arr[0];
        temp[1]=Math.max(arr[0],arr[1]);
        for ( int k = 2; k <=i ; k++) {
            int num1=temp[i-2]+arr[k];//选
            int num2=temp[k-1];//不选
            temp[k]= Math.max(num1,num2);//快定本次迭代的值
        }
        return temp[i];
    }
}
