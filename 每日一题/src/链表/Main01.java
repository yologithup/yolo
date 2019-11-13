package 链表;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/13-20:49
 * //删数
 * 有一个数组a[N]顺序存放0~N-1，要求每隔两个数删掉一个数，到末尾时循环至开头继续进行，求最后一个被删掉的数的原始下标位置。以8个数(N=7)为例:｛0，1，2，3，4，5，6，7｝，0->1->2(删除)->3->4->5(删除)->6->7->0(删除),如此循环直到最后一个数被删除。
 * 输入描述:
 * 每组数据为一行一个整数n(小于等于1000)，为数组成员数,如果大于1000，则对a[999]进行计算。
 * 输出描述:
 * 一行输出最后一个被删掉的数的原始下标位置。
 * 示例1
 * 输入
 * 复制
 * 8
 * 输出
 * 复制
 * 6
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNextInt()){//主义题目描述，收入的不知一组
            int n=input.nextInt();
            if(n>1000){
                n=999;
            }
            List<Integer>list=new ArrayList<>();
            for (int i = 0; i <n ; i++) {
                list.add(i);
            }
            int i=0;
            while (list.size() > 1) {
                i = (i + 2) % list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
        }

}
//链接：https://www.nowcoder.com/questionTerminal/f9533a71aada4f35867008be22be5b6e?f=discussion
//来源：牛客网
//
//public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            if (n > 1000) {
//                n = 999;
//            }
//            List<Integer> list = new ArrayList<Integer>();
//            for (int i = 0; i < n; i++) {
//                list.add(i);
//            }
//            int i = 0;
//            while (list.size() > 1) {
//                i = (i + 2) % list.size();
//                list.remove(i);
//            }
//            System.out.println(list.get(0));
//        }
//    }