/**
 * @author yolo
 * @date 2019/10/18-12:39
 * 对于基本类型：==是进行数值的比较
 * 对于引用类型：==是进行【地址】的比较
 *  双引号直接写的字符串，在字符串常量池中，new的不在
 * 在堆内存中：有一个空间（字符串常量池：保存的也是地址值（字节数组的地址值））
 */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";
        char[]charArray={'a','b','c'};
        String str3=new String(charArray);
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);

    }
}
