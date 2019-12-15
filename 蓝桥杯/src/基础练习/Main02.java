package 基础练习;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/12/14-16:12
 * 十六进制转换八进制
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String[]arr=new String[n];
        int i=0;
        while(n-->0){
            String s=input.next();
            Integer temp=Integer.valueOf(s.trim(),16);
            String result=Integer.toOctalString(temp);
            arr[i]=result;
            i++;
        }
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
