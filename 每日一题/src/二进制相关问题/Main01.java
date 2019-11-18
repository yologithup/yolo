package 二进制相关问题;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author yolo
 * @date 2019/11/18-13:00
 * 递归：
 * 递归的思路就是n为的gray码是由n-1位的gray码生成
 * 比如求n=3的gray码，首先知道n=2的gray码是(00,01,11,10)
 * 那么n=3的gray码其实就是对n=2的gray码首位添加0或1生成的
 * 添加0后变成(000,001,011,010)
 * 添加1后变成(110,111,101,100),此时需要发反向就变成啦(110,111,101,100)
 * 组合在一起就是(000,001,011,010,110,111,101,100)
 *
 *
 */
public class Main01 {
    public String[] getGray(int n) {
        // write code here
        String resStr[]=null;
        if(n==1){
            resStr=new String[]{"0","1"};//数组的初始化
        }else {
            String[] str=getGray(n-1);
            resStr=new String[2*str.length];
            for (int i = 0; i <str.length ; i++) {
                //加0加1操作同时进行
                resStr[i]="0"+str[i];//加0时从前往后遍历
                resStr[resStr.length-i-1]="1"+str[i];//加1时从后往前遍历
            }
        }
        return resStr;

    }
    public static void main(String[] args) {

    }
}
