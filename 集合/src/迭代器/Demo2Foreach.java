package 迭代器;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author yolo
 * @date 2019/10/2-21:48
 *
 *增强for循环
 *    底层使用的也是迭代器，使用for 循环的格式，简化啦迭代器的书写
 *    Collection<E>extends Iterator,所有的单列集合都可以使用增强for循环
 *    public interface Iterable<T>实现这个接口。允许对象成为foreach语句
 *        for(集合/数组的数据类型 变量名：集合名/数组名)
 */
public class Demo2Foreach {
    public static void main(String[] args) {
        demo1();
        demo2();
    }

    //遍历数组
    private static void demo1() {
        int[]arr={1,2,3,4};
        for(int i:arr){
            System.out.println(i);
        }
    }
    private static void demo2() {
        Collection<String> coll=new ArrayList<>();
        coll.add("张三");
        coll.add("张三");
        coll.add("张三");
        for(String e:coll){
            System.out.println(e);
        }
    }
}
