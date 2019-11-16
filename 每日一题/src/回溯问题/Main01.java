package 回溯问题;
import java.util.*;
/**
 * @author yolo
 * @date 2019/11/16-13:13
 * 题目描述
 * 有一个XxY的网格，一个机器人只能走格点且只能向右或向下走，要从左上角走到右下角。
 * 请设计一个算法，计算机器人有多少种走法。
 *
 * 给定两个正整数int x,int y，请返回机器人的走法数目。保证x＋y小于等于12。
 *
 * 测试样例：
 * 2,2
 * 返回：2
 * 方法一：递归
 *  既然是只能向右或者向下走，那么每一步只有两种选择：要么向右，要么向左
 *  如果向下走，问题就变成：求（x-1）*y矩阵中机器人的走法
 *  如果向右走，问题就变成：求x*（y-1）矩阵中机器人的走法
 *  当然是递归，就需要考虑递归的退出条件：当只有一行或者一列时只有一种走法
 *
 * 方法二：动态规划
 */
public class Main01 {
    public int countWays1(int x, int y) {
        // write code here
        if(x==0||y==0){
            return 0;
        }
        if(x==1||y==1){
            return 1;
        }
        return countWays1(x-1,y)+countWays1(x,y-1);
    }
//    public int countWays2(int x, int y){
//
//    }
}
