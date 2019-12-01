package 第二次;

import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/12/1-9:27
 * 字符集合
 *
 * 输入描述:
 * 每组数据输入一个字符串，字符串最大长度为100，且只包含字母，不可能为空串，区分大小写。
 *
 *
 * 输出描述:
 * 每组数据一行，按字符串原有的字符顺序，输出字符集合，即重复出现并靠后的字母不输出。
 * 示例1
 * 输入
 * abcqweracb
 * 输出
 * abcqwer
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String str=input.nextLine();
            String result="";
            for (int i = 0; i <str.length() ; i++) {
                char c=str.charAt(i);
                if(result.indexOf(c)==-1){
                    result=result+c;
                }
            }
            System.out.println(result);
        }
    }
}
