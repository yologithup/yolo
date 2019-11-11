package 生活中的算法;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/11-12:54
 * 题目描述
 * 有一个神奇的口袋，总的容积是40，用这个口袋可以变出一些物品，这些物品的总体积必须是40。John现在有n个想要得到的物品，每个物品的体积分别是a1，a2……an。John可以从这些物品中选择一些，如果选出的物体的总体积是40，那么利用这个神奇的口袋，John就可以得到这些物品。现在的问题是，John有多少种不同的选择物品的方式。
 * 输入描述:
 * 输入的第一行是正整数n (1 <= n <= 20)，表示不同的物品的数目。接下来的n行，每行有一个1到40之间的正整数，分别给出a1，a2……an的值。
 * 输出描述:
 * 输出不同的选择物品的方式的数目。
 * 示例1
 * 输入
 * 3
 * 20
 * 20
 * 20
 * 输出
 * 3
 */
public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kinds = scanner.nextInt();
        int[] arr = new int[kinds];
        for (int i = 0; i < kinds; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(differentkinds(arr, kinds, 40,0));
    }

    static int differentkinds(int[] arr, int n, int v,int index) {
        if (v == 0) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }else {
            //从后往前装，最后一个开始，装上n个后，体积减少，继续往前
            //装上n个后，如果无解。删除该包。然后从n-1开始继续往前装
            return differentkinds(arr,n-1,v-arr[index],index+1)
                    +differentkinds(arr,n-1,v,index+1);
        }
    }
}
