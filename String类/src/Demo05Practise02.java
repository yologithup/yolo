import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/10/18-21:07
 * 题目：
 * 定义一个方法，键盘输入一个字符串，并统计其中各种字符出现的次数
 * 种类：大写字母，小写字母，数字，其他
 * 分析：
 *  1.用到从键盘输入，肯定为Scanner
 *  2.获取输入的字符串：nextLine()
 *  3.定义一个方法：
 *      返回值：Map类型
 *      参数：String
 *      判断种类：
 *        Character.isUpperCase(c)：判断是否为大写
 *        Character.isLowerCase(c)：判断是否为小写
 *        Character.isDigit(c)：判断是否为数字
 *        other：其他
 *      定义Map集合：
 *        Map<String,Integer> map=new HashMap<>();
 *      利用Map集合进行存储
 *         int count1=map.getOrDefault("countUpper",0);
 *         map.put("countUpper",++count1);
    4.调用函数：打印Map类型的返回值
 */
public class Demo05Practise02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str=new String(input.nextLine());
        Map<String,Integer> map=new HashMap<>();
        map=method(str);
        System.out.println(map);
    }

    private static Map<String, Integer> method(String str) {
        Map<String,Integer> map=new HashMap<>();
        char[]chars=str.toCharArray();
        for (char c : chars) {
            if(Character.isUpperCase(c)){
                int count1=map.getOrDefault("countUpper",0);
                map.put("countUpper",++count1);
            } else if(Character.isLowerCase(c)){
                int count2=map.getOrDefault("countLower",0);
                map.put("countLower",++count2);
            } else if(Character.isDigit(c)){
                int count3=map.getOrDefault("countNumber",0);
                map.put("countNumber",++count3);
            }else{
                int count4=map.getOrDefault("countOther",0);
                map.put("countOther",++count4);
            }
        }
        return map;
    }
}
