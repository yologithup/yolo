package 数学问题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/20-17:56
 */
public class Main06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            String str1=input.nextLine();
            String str2=input.nextLine();
            System.out.println(AddLongInteger(str1,str2));
        }

    }
    public static String AddLongInteger(String addend,String augend) {
        // 求出两个字符串中较长的那个字符串长度
        int lenA = addend.length();
        int lenB = augend.length();
        int lenS = Math.max(lenA, lenB);

        // arrS保存最终生成的结果
        int[] arrA = new int[lenS];
        int[] arrB = new int[lenS];
        int[] arrS = new int[lenS + 1];

        for (int i = 0; i < lenA; i++) {
            arrA[i] = addend.charAt(lenA - 1 - i) - '0';
        }

        for (int i = 0; i < lenB; i++) {
            arrB[i] = augend.charAt(lenB - 1 - i) - '0';
        }

        for (int i = 0; i < lenS; i++) {
            int sum = arrS[i] + arrA[i] + arrB[i];
            int flag = sum / 10;
            arrS[i] = sum % 10;
            arrS[i + 1] += flag;
        }
        int index = arrS.length-1;
        while (arrS[index] != 0) {
            index--;
        }
        int[] result = Arrays.copyOfRange(arrS, 0, index);
        String str="";
        for (int i = result.length - 1; i >= 0; i--) {
            str+=result[i];
        }
        return str;
    }
}