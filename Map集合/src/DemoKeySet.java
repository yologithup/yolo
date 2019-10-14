import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ForkJoinPool;

/**
 * @author yolo
 * @date 2019/10/14-21:23
 * Map 集合的遍历
 *    第一种：通过键找值
 *       Map集合中的方法：
 *       Set<K>keyset()返回这次要映射中包含的键的Set图
 *       实现步骤：
 *          1.使用map集合中的keySet(),把Map集合所有的key取出来，存到Set集合中
 *          2.遍历set集合，获取Map中的每一个key
 *          3.通过Map集合中的方法get(key),通过key找到value
 */
public class DemoKeySet {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        //1.使用map集合中的keySet(),把Map集合所有的key取出来，存到Set集合中
        Set<String>set =map.keySet();
        //2.遍历set集合，获取Map中的每一个key(迭代器遍历/增强for遍历)
            //迭代器
            Iterator<String>it=set.iterator();
            while(it.hasNext()){
                String key=it.next();
                //3.通过Map集合中的方法get(key),通过key找到value
                Integer value=map.get(key);
                System.out.println(value);
            }
            //增强for
            for (String s : set) {
                Integer value=map.get(s);
                System.out.println(value);
            }
    }
}
