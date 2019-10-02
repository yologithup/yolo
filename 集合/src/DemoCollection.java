import java.util.ArrayList;
import java.util.Collection;

/**
 * @author yolo
 * @date 2019/10/2-21:55
 *   java.util.Collection接口
 *       所有单列集合的最顶层的接口，里边定义啦所有单列集合的共性方法
 *       任意的单列集合丢可以使用Collection接口中的方法
 *
 *   共性方法：
 *       public boolean add(E e);把给定的对象添加到当前的集合中
 *          返回值是boolean,一般返回true，所以可以不用接收
 *       public boolean remove(E e);把给定的对象从当前集合删除
 *          存在元素，删除元素，返回true
 *          不存在元素，删除失败，返回false
 *       public boolean contains(E e);判断当前集合是否包含指定的对象
 *          包含返回true，否则返回false
 *       public boolean isEmpty()
 *          判断当前集合是否为空
 *          集合为空返回true，否则返回false
 *       public void clear();清空集合的元素
 *           但集合依旧还在，只是没有数据
 *       public Object[] toArray();将集合改变为数组
 */
public class DemoCollection {
    //创建集合对象，可以使用多态
    public static void main(String[] args) {
        //创建集合对象，可以使用多态
        Collection<String>coll=new ArrayList<>();
        System.out.println(coll);//重写了toString方法
        coll.add("张三");
        coll.add("李四");
        coll.add("赵六");
        coll.remove("李四");
        coll.remove("赵四");
        coll.contains("赵六");
        coll.isEmpty();
        coll.size();
        coll.toArray();
        coll.clear();
    }
}
