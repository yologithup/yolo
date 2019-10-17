import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/10/17-16:15
 * Debug调试程序：
 *  可以使代码逐行执行，查看代码的执行过程，调试程序中出现的bug
 * 使用方法：
 *  在行号的右边，鼠标左键单击，添加断点
 *  右键，选择Debug执行程序
 *  程序就会停留在添加的第一个断点处
 * 执行程序：
 *  f8:逐行执行程序
 *  f7：进入到方法中
 *  Shift+f8：跳出方法
 *  f9：跳到下一个断点，如果没有，那么就结束程序
 *  CTRL+f2:退出Debug模式，停止程序
 *  Console：切换到控制台
 */
public class Demo01Debug {
    public static void main(String[] args) {
        //1.使用Scanner获取用户输入的字符串
        Scanner input=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str=input.nextLine();
        //2.创建Map集合，key是字符串中的字符，value是每个字符出现的次数
        Map<Character,Integer> map=new HashMap<>();
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
