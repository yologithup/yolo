import javax.lang.model.element.VariableElement;

/**
 * @author yolo
 * @date 2019/10/18-13:15
 * 判等：
 * ==是进行对象的地址比较，如果需要对字符串内容比较，可以使用两个方法
 *     1.public boolean equals(object obj):
 *         1.参数可以是任意对象
 *         2.只有参数是一个字符串，并且内容相同才会返回true，否则返回false
 *         注意事项：
 *          1.任何对象都可以Object进行接收
 *          2.equals方法具有对称性
 *          3.如果比较双发一个常量，一个变量，推荐常量写在前边，避免引用类型为null，出现空指针异常
 *             推荐："abc".equals(str)
 *             不推荐：str.equals("abc")
 *     2.public boolean equalsIgnoreCase(Object obj):忽略大小写,进行内容比较
 * 与获取相关的常用方法：
 *      1.public int length():获取字符串中含有的字符个数，拿到字符串的长度
 *      2.public String concat(String str):将当前的字符串和参数字符串拼接成为新的字符串，并且返回新的字符串
 *          字符串本身内容并没有发生变化，因为字符串不可变，只是创建啦一个新的字符串而已
 *      3.public char charAt(int index):获取指定索引位置的单个字符
 *      4.public int indexOf(String str):查找参数字符串在本字符串中首次出现的索引位置，弱国没有，返回-1，
 * 截取方法：
 *      1.public String subtring(int index):截取从参数位置开始一直到末尾，返回新的字符串
 *      2.public String subtring(int begin，int end):截取从begin开始，一直到end结束中间的字符串。
 *          左闭右开[begin,end)
 *
 * 字符串转换相关方法
 *      1.public char[]toCharArray();将当前字符串拆分为字符数组返回
 *      2.public byte[]getBytes():获得当前字符串的字节数组---IO流会用的到
 *      3.public String replace(CharSequence oldString,CharSequence newString):
 *          将所有出现的老字符串替换成新的字符串，返回替换后的新字符串
 *          CharSequence：是个接口，可以接收字符串，你可以把它当作字符串
 *
 * 字符串分割相关方法
 *      1.public String[] split(String regex):按照参数的规则，将字符串切割为若干个
 *      split方法的参数是一个正则表达式：
 *      .作为参数时：应该用\\.
 *
 */
public class Demo03StringMethod {
    public static void main(String[] args) {
//        //1.判等
//        String str1="hello";
//        String str2="hello";
//        char[]charArray={'h','e','l','l','o'};
//        String str3=new String(charArray);
//        System.out.println(str1.equals(str2));//true
//        System.out.println(str2.equals(str3));//true
//        System.out.println(str3.equals("hello"));//true
//        System.out.println("hello".equals(str1));//true
//        String str5=null;
//        System.out.println(str5.equals("hello"));//NullPointerException
//        System.out.println("hello".equals(str5));//false
//        String strA="Java";
//        String strB="java";
//        System.out.println(strA.equalsIgnoreCase(strB));//true
//
//        //2.与获取相关的常用方法：
//        //获取字符串的长度
//        int length = "shudhedeiuwafnffewfno".length();
//        System.out.println("字符串长度是："+length);
//        //拼接字符串
//        String s1="hello";
//        String s2="world";
//        String s3=s1.concat(s2);
//        System.out.println(s1);//hello原封不动
//        System.out.println(s2);//world原封不动
//        System.out.println(s3);//helloworld
//
//        //获取指定索引位置的单个字符
//        char ch ="hello".charAt(1);
//        System.out.println(ch);//e
//
//        //查找参数字符串在本来字符串中第一次出现的索引位置
//        String original="helloworld";
//        int index = original.indexOf("llo");
//        System.out.println(index);//2
//
//        //3.截取
//        String st1="helloworld";
//        String st2=st1.substring(4);
//        String st3=st1.substring(4,7);
        String S1="aaa,bbb,ccc";
        String[] array = S1.split(",");
        for (String s : array) {
            System.out.println(s);
        }
    }
}
