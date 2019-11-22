package 位运算;

/**
 * @author yolo
 * @date 2019/11/22-13:21
 * 题目描述
 * 请编写一个函数，将两个数字相加。不得使用+或其他算数运算符。
 * 给定两个int A和B。请返回A＋B的值
 * 测试样例：
 * 1,2
 * 返回：3
 */
public class Main01 {
    public int addAB(int A, int B) {
        // write code here
        if(A==0){
            return B;
        }
        if(B==0){
            return A;
        }
        return addAB(A^B,(A&B)<<1);
    }

    public static void main(String[] args) {

    }
}
