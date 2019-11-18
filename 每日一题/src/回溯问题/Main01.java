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
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int m,n;
        m = in.nextInt();
        n = in.nextInt();
        int f[][] = new int[11][11];
        f[0][0] = 0;
        for(int i=0; i<=m; i++)
            f[i][0] = 1;
        for(int i=0; i<=n; i++)
            f[0][i] = 1;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++)
                f[i][j] = f[i-1][j] + f[i][j-1];
        }
        System.out.print(f[m][n]);
    }
//    public int countWays2(int x, int y){
//
//    }
}
