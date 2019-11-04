package 校赛练习1;

import com.sun.javafx.image.BytePixelSetter;
import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import sun.print.SunMinMaxPage;

import java.util.Scanner;
import java.util.logging.Level;

/**
 * @author yolo
 * @date 2019/11/4-20:12
 * 问题描述
 *  
 *     有n个小朋友围坐成一圈。老师给每个小朋友随机发偶数个糖果，然后进行下面的游戏：
 *     每个小朋友都把自己的糖果分一半给左手边的孩子。
 *     一轮分糖后，拥有奇数颗糖的孩子由老师补给1个糖果，从而变成偶数。
 *     反复进行这个游戏，直到所有小朋友的糖果数都相同为止。
 *     你的任务是预测在已知的初始糖果情形下，老师一共需要补发多少个糖果。
 *  
 * 【格式要求】
 *  
 *     程序首先读入一个整数N(2<N<100)，表示小朋友的人数。
 *     接着是一行用空格分开的N个偶数（每个偶数不大于1000，不小于2）
 *     要求程序输出一个整数，表示老师需要补发的糖果数。
 *  
 * 样例输入
 * 3
 * 2 2 4
 * 样例输出：
 * 4
 */
public class Demo03 {
    static int sum=0;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int studentNum=input.nextInt();
        int[] candyNum=new int[studentNum];
        for (int i = 0; i < candyNum.length; i++) {
                candyNum[i]=input.nextInt();
        }
        int sum=game(candyNum);
        System.out.println(sum);
    }

    private static int game(int[] candyNum) {
        for (int i = 0; i < candyNum.length; i++) {
            int temp=candyNum[candyNum.length-1];
            if(i==0){
                candyNum[candyNum.length-1]+=candyNum[i]/2;
                candyNum[i]-=candyNum[i]/2;
            }else if(i==candyNum.length-1){
                candyNum[i-1]+=temp/2;
                candyNum[i]-=temp/2;
            }else{
                    candyNum[i-1]+=candyNum[i]/2;
                    candyNum[i]-=candyNum[i]/2;
                }
            }
        if(!judge(candyNum)){
            for (int i = 0; i < candyNum.length; i++) {
                if(candyNum[i]%2==1){
                    candyNum[i]++;
                    sum++;
                }
            }
            if(judge(candyNum)){
                return sum;
            }else {
                game(candyNum);
            }
        }
        return sum;
    }

    private static boolean judge(int[] candyNum) {
        for (int i = 0; i < candyNum.length-1; i++) {
            if(candyNum[i]!=candyNum[i+1]){
                return false;
            }
        }
        return true;
    }
}
