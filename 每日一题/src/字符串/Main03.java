package 字符串;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/10-22:00
 * 在字符串中删除特定的字符。
 * 题目：输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。
 *
 *  例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”。
 */
public class Main03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str1=input.nextLine();
        String str2=input.nextLine();
        for (int index = 0; index <str2.length() ; index++) {
            char c=str2.charAt(index);
            int flag=0;
            while((flag=str1.indexOf(c))!=-1){//小技巧，直接将赋值和判断都放在while条件判断里
                    str1 = str1.substring(0, flag) + str1.substring(flag + 1);
            }
        }
        System.out.println(str1);
    }
}
