package 校赛练习1;

import java.util.Scanner;
import java.util.SortedMap;

/**
 * @author yolo
 * @date 2019/11/4-21:26
 * 小Hi喜欢各种角度。一天，他注意到了钟表上的角度，于是他想考考他的好朋友小Ho：
 * 对于一个24小时制的时刻，在 t 秒之后，对应在钟表上时针与分针的夹角是多少。
 * 为保证答案的唯一性，只需考虑不超过180°的角。你能帮助小Ho解决这个问题吗？  
 * 例如，下图可表示15点30分0秒经过0秒后的时间，其对应的夹角为75°和285°，在这个问题中我们只考虑不超过180°的角，所以此时的夹角为75°。
 *
 * 输入
 * 输入包含多组测试数据。
 * 第一行为测试数据的组数T（1 ≤ T ≤ 1000）  
 * 对于每组数据：  
 * 第一行包含三个整数h，m，s，表示给定时刻的时、分、秒（0 ≤ h ≤ 23，0 ≤ m ≤ 59，0 ≤ s ≤ 59）  
 * 第二行包含一个整数t，表示经过的秒数（0 ≤ t ≤ 1000000000）
 * 输出
 * 对于每组数据，输出时针与分针的夹角。四舍五⼊保留小数点后四位。
 * 样例输入
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int groups = input.nextInt();
        double[] result=new double[groups];
        int h,m,s,t;
        for (int i = 0; i <groups ; i++) {//控制可以输入的组数
            h=input.nextInt();
            m=input.nextInt();
            s=input.nextInt();
            t=input.nextInt();
            m+=(s+t)/60;//先求出临时的分钟
            s=(s+t)%60;//最终秒数
            h+=m/60;//临时小时
            h=h%12;//最终小时
            m=m%60;//最终分钟
            double angle=Math.abs((h*30+(30.0/60)*m)-m*6);//时钟与分钟夹角
            if(angle>180){//判断是否大于180度
                angle=360-angle;
            }
           result[i]=angle;
        }
        for (double v : result) {
            System.out.printf("%.4f\n",v);
        }
    }
}
