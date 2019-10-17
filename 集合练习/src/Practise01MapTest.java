import sun.security.action.PutAllAction;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/10/17-11:55
 * 练习：
 *  计算一个字符串中每个字符出现的次数
 * 分析：
 *  1.使用Scanner获取用户输入的字符串
 *  2.创建Map集合，key是字符串中的字符，value是每个字符出现的次数
 *  3.遍历字符串，获取每个字符（key）
 *  4.使用获得的字符，去判断Map集合中key是否存在
 *      key存在：
 *          通过字符（key），获取value（字符个数）
 *      key不存在：
 *          put(key,1)
 *   5.使用Map集合输出结果
 */
public class Practise01MapTest {
    public static void main(String[] args) {
        //1.使用Scanner获取用户输入的字符串
        Scanner input=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str=input.nextLine();
        //2.创建Map集合，key是字符串中的字符，value是每个字符出现的次数
        Map<Character,Integer>map=new HashMap<>();
        //3.遍历字符串，获取每个字符（key）---
        for (char c : str.toCharArray()) {
            // 4.使用获得的字符，去判断Map集合中key是否存在
            if(map.containsKey(c)){
                //key存在
                int value=map.get(c);
                map.put(c,++value);
            }
            else {
                //key不存在
                map.put(c,1);
            }
        }
        //5.使用Map集合输出结果
        System.out.println(map);
    }
}
