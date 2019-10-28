package 运算符使用;

/**
 * @author yolo
 * @date 2019/10/27-19:27
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Solution01 {
//    public int NumberOf1(int n) {
//        int count=0;
//        while(n!=0){
//            count++;
//            n=n&(n-1);//整数n，进行n&(n-1)运算，会把二进制表示中最右边的1变为0
//        }
//        return count;
//    }
public double Power(double base, int exponent) {
    if(base==0){
        return 0;
    }if(exponent==0){
        return 1;
    }else{
        return Power(base,exponent-1)*base;
    }
}
}
