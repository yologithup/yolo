package DP问题;

/**
 * @author yolo
 * @date 2019/11/16-19:35
 * 01背包
 * 有N件物品和一个最大重量为V的背包。第i件物品的重量时c[i]，价值是w[i].
 * 求解哪些物品装入背包可以使价值总和最大
 * 每种物品只可以被选择一次
 *
 * 分析：
 *  每种物品有拿和不拿两种情况
 */
public class Main03 {
    static int[]c={2,2,2,3,5,1,3,2,7,4,2,6};//重量
    static int[]w={4,4,4,6,4,1,3,8,2,1,2,4};//价值
    static int v=7;
    public static void main(String[] args) {
       // System.out.println(fun(w.length-1,v));
    }
//    private static int fun(int i, int v) {
//        if(i<1){
//            //当i=0时，即问题分析种分析到最后意见物品时，判断背包剩余容量是否可以放得下这件物品
//
//        }
//    }
}
