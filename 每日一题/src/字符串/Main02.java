package 字符串;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/9-22:23
 * 题目描述
 * 读入一个字符串str，输出字符串str中的连续最长的数字串
 * 输入描述:
 * 个测试输入包含1个测试用例，一个字符串str，长度不超过255。
 * 输出描述:
 * 在一行内输出str中里连续最长的数字串。
 * 示例1
 * 输入
 * 复制
 * abcd12345ed125ss123456789
 * 输出
 * 复制
 * 123456789
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int max=0;
        Map<Integer,String>map=new HashMap<>();
        for (int index = 0; index <str.length() ; index++) {
            String temp=null;
            int count=0;
            while(index<str.length()&&str.charAt(index)>='0'&&str.charAt(index)<='9'){
                if(temp==null){
                    if(index==str.length()-1){
                        temp+=str.substring(index);
                    }else {
                        temp=str.substring(index,index+1);
                    }
                }else {
                    if(index==str.length()-1){
                        temp+=str.substring(index);
                    }else {
                        temp+=str.substring(index,index+1);
                    }
                }
                index++;
                count++;
            }
            if(count!=0){
                map.put(count,temp);
            }
            if(count>max){
                max=count;
            }
        }
        System.out.println(map.get(max));
    }
}
