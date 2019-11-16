package 数学问题;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author yolo
 * @date 2019/11/16-20:01
 * 给定一个k位整数N = dk-1*10k-1 + ... + d1*101 + d0 (0<=di<=9, i=0,...,k-1, dk-1>0)
 * 请编写程序统计每种不同的个位数字出现的次数。
 * 例如：给定N = 100311，则有2个0，3个1，和1个3。
 *
 * 输入描述:
 * 每个输入包含1个测试用例，即一个不超过1000位的正整数N。
 * 输出描述:
 * 对N中每一种不同的个位数字，以D:M的格式在一行中输出该位数字D及其在N中出现的次数M。要求按D的升序输出。
 * 示例1
 * 输入
 * 100311
 * 输出
 * 0:2
 * 1:3
 * 3:1
 */
public class Main05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();//可以将输入的整数定义为字符串，这样方便对他的遍历
        Map<Character,Integer>map=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            int count=map.getOrDefault(s.charAt(i),0);
            map.put(s.charAt(i),++count);
        }
        Set<Map.Entry<Character,Integer>>set=map.entrySet();
        for (Map.Entry<Character, Integer> i : set) {
            System.out.println(i.getKey()+":"+i.getValue());
        }
    }
}

