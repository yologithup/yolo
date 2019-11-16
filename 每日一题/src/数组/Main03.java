package 数组;

/**
 * @author yolo
 * @date 2019/11/16-21:16
 * 题目描述
 * 给定一个数组A[0,1,...,n-1]
 * 请构建一个数组B[0,1,...,n-1]
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]
 * 不能使用除法。
 */
public class Main03 {
    public static void main(String[] args) {

    }
    public int[] multiply(int[] A) {
        int[]B=new int[A.length];
        B[0]=1;
        //下三角
        for (int i = 1; i <A.length ; i++) {
            B[i]=B[i-1]*A[i-1];
        }
        //上三角
        int temp=1;
        for (int i = A.length-2; i >=0 ; i--) {
            temp=temp*A[i+1];
            B[i]*=temp;
        }
        return B;
    }
//    public int[] multiply(int[] A) {
//        int[]B=new int[A.length];
//        for (int i = 0; i < A.length ; i++) {
//            B[i]=1;
//            for (int left = 0; left <i ; left++) {
//                B[i]*=A[left];
//            }
//            for (int right =i+1; right <A.length ; right++) {
//                B[i]*=A[right];
//            }
//        }
//        return B;
//    }
    
}
