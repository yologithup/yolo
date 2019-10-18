/**
 * @author yolo
 * @date 2019/10/18-8:49
 * java.lang.String类代表字符串
 * API中说：Java程序中所有的字符串字面值（"abc"）都作为此类的实例对象
 * 也就是说：程序当中的所有双引号字符串，都是String类的对象。（就算没有new，也照样是）
 * 字符串的特点：
 *      1.字符串内容永不可变【重点】
 *      2.正是因为字符串不可变，所以字符串是可以共享使用的
 *      3.字符串效果上相当于char[]字符数组，但底层是byte[]字节数组
 * 创建字符串的常见3+1种方式
 *  三种构造方法
 *      public String （）:创建一个空白字符串，不含有其他内容
 *      public String(char[] array):根据字符数组的内容创建字符串
 *      public String(byte[] array):根据字节数组的内容创建对应的字符串
 * 注意：直接鞋上双引号，就是字符串对象--jvm帮助你做啦new操作
 *
 */
public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造
        String str1=new String();
        System.out.println("第一个字符串："+str1);
        //根据字符数组创建
        char[]charArray={'a','b','c'};
        String str2=new String(charArray);
        System.out.println("第二个字符串："+str2);
        //根据字节数组创建
        byte[]byteArray={97,98,99};
        String str3=new String(byteArray);
        System.out.println("第三个字符串："+str3);
        //直接创建
        String str4="abc";
        System.out.println("第四个字符串："+str4);
    }
}

