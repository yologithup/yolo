package 基础练习;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/12/15-11:05
 */
public class Main03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        while(n-->0){
            String str=input.next();
            String twoStr=sixteenToTWO(str);
            String eightStr=twoToEight(twoStr);
            System.out.println(eightStr);
        }
    }
    private static String sixteenToTWO(String str) {
        String twoStr="";
        for (int i = 0; i <str.length() ; i++) {
            int[]arr=new int[4];
            char c=str.charAt(i);
            int temp=c>'A'?c-'A'+10:c-'0';
            for (int j = 3; j >=0 ; j--) {
                arr[j]=temp%2;
                temp=temp/2;
            }
            for (int j : arr) {
                twoStr+=j;
            }
        }
        return twoStr;
    }
    private static String twoToEight(String str) {
        List<Integer>list=new LinkedList<>();
       int i=str.length()-1;
       int count=str.length()%3==0?str.length()/3:str.length()/3+1;
       while(i>=0){
           while(count-->0){
               int num=0;
               for (int j = 0,temp=0; j <3&&i>=0 ; j++) {
                  int c= str.charAt(i)-'0';
                   temp=temp+(int) (c*Math.pow(2,j));
                   num=temp;
                   i--;
               }
               list.add(0,num);
           }
       }
       int k=0;
       while(list.get(k)==0){
           k++;
       }
       String eightStr="";
       while(k<list.size()){
          eightStr+=list.get(k);
          k++;
       }
       return eightStr;
    }
}
