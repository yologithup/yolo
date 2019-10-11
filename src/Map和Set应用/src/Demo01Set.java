import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *  java.util.Set接口extends Collection
 *  Set接口的特点：
 *      不允许存储重复的元素
 *      没有索引，没有带索引的方法，不能使用普通的for循环遍历
 *  Set的方法
 *      boolean add(E e) 添加元素，但重复元素不会被添加成功
 *      void clear() 清空集合
 *      boolean contains(Object o) 判断 o 是否在集合中
 *      Iterator<E> iterator() 返回迭代器
 *      boolean remove(Object o) 删除集合中的 o
 *  Set纯K模型：Set<K>
 *  Set的两个实现类
 *  java.util.HashSet:
 *   HashSet特点：
 *      不允许存储重复的元素
 *      没有索引，没有带索引的方法，不能使用普通的for循环遍历
 *      是一个无序集合，存储元素和取出元素的顺序可能不一致
 *      哈希表结构；没有顺序，无序集合
 *   哈希值：十进制的整数，由系统给出（就是一个地址，但是模拟地址，不是实际地址）
 *  HashSet存储结构：
 *    哈希表：
 *    1.8之前
 *      数组+链表
 *    1.8之后
 *      数组+链表（当链表长度超过8位时，将链表转换位红黑树）
 *      数组+红黑树（提高查询速度）
 *
 *
 *      int hashCode()返回该对象的哈希码值
 *          public native int hashCode()
 *          native:代表该方法调用
 *      字符串类重写了hashCode，equals
 *  HashSet存储自定义类型：
 *      Set报错元素唯一：
 *          存储的元素(string,Integer,......,Person,Student),必须重写hashCode方法和equals方法
 *      要求：同名同年龄视为同一人，只能存储一次
 */

public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        //添加元素
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        //迭代器遍历
        Iterator<Integer>it=set.iterator();
        while(it.hasNext()){
            Integer n=it.next();
            System.out.printf("%d ",n);
        }
        System.out.println();
        System.out.println("-----");
        //增强for遍历
        for (Integer i : set) {
            System.out.printf("%d ",i);
        }
        System.out.println();

        HashSet<Person>hashSet=new HashSet<>();
        Person p1=new Person(18,"小美女");
        Person p2=new Person(18,"小美女");
        Person p3=new Person(19,"小美女");
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        System.out.println(hashSet);
        System.out.println(p1.hashCode());//哈希码的值
        System.out.println(p2.hashCode());

    }
}
