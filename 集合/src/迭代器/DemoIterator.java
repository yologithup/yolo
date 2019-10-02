package 迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author yolo
 * @date 2019/10/2-20:35
 *  java.util.Iterator接口，迭代器(对集合进行遍历)
 *  有两个常用的方法
 *      boolean hasNext()如果有元素可以迭代，返回true
 *          判断集合中有没有下一个元素，有返回true，没有返回false
 *      E next()返回迭代的下一个元素合
 *          取出集合中的下一个元素
 *  Iterator迭代器是一个接口，无法直接使用，需要使用Iterator接口的实现类对象，获取实现类的方式比较特殊
 *  Collection接口中有一个方法iterator（）,这个方法返回的就是迭代器的实现类对象
 *      Iterator<E> iterator()返回在此collection的元素上进行迭代的迭代器
 *   迭代器的使用步骤
 *      1.使用集合中的方法iterator()获取迭代器的实现对象，对Iterator接口接收(多态)
 *      2.使用Iterator接口的hasNext()判断集合中有没有下一个元素
 *      3.使用Iterator接口的next()取出集合中的下一个元素
 */
public class DemoIterator{
        public static void main(String[] args) {
            //创建集合对象
            Collection<String> coll=new ArrayList<>();
            coll.add("张三");
            coll.add("张三");
            coll.add("张三");
        /*
        使用集合中的方法iterator()获取迭代器的实现类对象，使用接口进行接收（多态）
        Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合的泛型走，集合什么泛型，迭代器就什么泛型

         */
            //多态    接口        实现类对象
            Iterator<String> it=coll.iterator();
            while (it.hasNext()){
                String s=it.next();//取出下一个元素，指针后移一位
                System.out.println(s);
            }
        }

    }
