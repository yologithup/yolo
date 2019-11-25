package 字符串;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/25-19:53
 * 题目描述
 * 一个DNA序列由A/C/G/T四个字母的排列组合组成。
 * G和C的比例（定义为GC-Ratio）是序列中G和C两个字母的总的出现次数除以总的字母数目（也就是序列长度）。
 * 在基因工程中，这个比例非常重要。因为高的GC-Ratio可能是基因的起始点。
 * 给定一个很长的DNA序列，以及要求的最小子序列长度，研究人员经常会需要在其中找出GC-Ratio最高的子序列。
 * 输入描述:
 * 输入一个string型基因序列，和int型子串的长度
 * 输出描述:
 * 找出GC比例最高的子串,如果有多个输出第一个的子串
 *
 * 示例1
 * 输入:AACTGTGCACGACCTGA    5
 * 输出:GCACG
 */
public class Main06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int n=input.nextInt();
        Map<Integer,String>map=new HashMap<>();
        for (int i = 0; i <str.length()-n ; i++) {
            int len=0;
            int count=0;
            String temp="";
                for (int j = i; j <str.length()&&len<5 ; j++) {
                    temp=temp+str.charAt(j);
                    len++;
                    if(str.charAt(j)=='C'||str.charAt(j)=='G'){
                        count++;
                    }
                }
                if(map.get(count)==null){
                    map.put(count,temp);
                }
        }
        for (int i = n; i >0 ; i--) {
            if(map.containsKey(i)){
                System.out.println(map.get(i));
                return;
            }
        }
    }
}
