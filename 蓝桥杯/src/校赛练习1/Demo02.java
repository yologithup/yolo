package 校赛练习1;

import java.util.Scanner;
import java.util.SortedMap;

/**
 * @author yolo
 * @date 2019/11/4-19:31
 * 【问题描述】
 * 任意给定一个正整数N，
 * 如果是偶数，执行： N / 2
 * 如果是奇数，执行： N * 3 + 1
 * 生成的新的数字再执行同样的动作，循环往复。
 * 通过观察发现，这个数字会一会儿上升到很高，
 * 一会儿又降落下来。
 * 就这样起起落落的，但最终必会落到“1”
 * 这有点像小冰雹粒子在冰雹云中翻滚增长的样子。
 *  
 * 比如N=9
 * 9,28,14,7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1
 * 可以看到，N=9的时候，这个“小冰雹”最高冲到了52这个高度。
 *  
 * 输入格式：
 * 一个正整数N（N<1000000）
 * 输出格式：
 * 一个正整数，表示不大于N的数字，经过冰雹数变换过程中，最高冲到了多少。(这块容易理解错误，指的并不是n做高冲到多少,而是不大于n的所有数最高冲到多少)
 *  
 * 样例输入：
 * 10
 * 样例输出：
 * 52
 *  
 * 样例输入：
 * 100
 * 样例输出：
 * 9232
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int max=1;
        for (int j = n; j >1 ; j--) {
           int temp=j;//需要用一个临时变量用于while循环内，不能直接使用j
                     //否则会在while循环内部改变j，从而影响判断条件
            while(temp!=1){
                if(temp%2==0){
                    temp=temp/2;
                }else {
                    temp=temp*3+1;
                }
                if(temp>max){
                    max=temp;
                }
            }
        }

        System.out.println(max);
    }
}
