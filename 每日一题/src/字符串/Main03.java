package 字符串;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/10-22:00
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
