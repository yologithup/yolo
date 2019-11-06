package 字符串;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/6-22:47
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str1=input.nextLine();
        String str2=input.nextLine();
        int count=0;
        for (int i = 0; i <str1.length(); i++) {
            String temp=str1.substring(0,i)+str2+str1.substring(i,str1.length());
            if(judge(temp)){
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean judge(String str) {
       int pre=0,post=str.length()-1;
       while(post>=pre){
           if(str.charAt(pre)==str.charAt(post)){
               pre++;
               post--;
           }else{
               return false;
           }
       }
       return true;
    }
}
