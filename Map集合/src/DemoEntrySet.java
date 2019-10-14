import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author yolo
 * @date 2019/10/14-21:58
 *  第一种：使用Entry对象遍历
 *     Map集合中的方法：
 *     Set<Map<K,V>>entrySet()返回此映射中包含的键的Set图
 *     实现步骤：
 *        1.使用map集合中的entrySet(),把Map集合所有的Entry对象取出来，存到Set集合中
 *        2.遍历set集合，获取每一个Entry对象
 *        3.通过Entry对象中的方法getKey(),getValue()获取键与值
 */
public class DemoEntrySet {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        Set<Map.Entry<String,Integer>> set=map.entrySet();
            //迭代器
            Iterator<Map.Entry<String,Integer>>it=set.iterator();
            while(it.hasNext()){
                Map.Entry<String,Integer>entry=it.next();
                String key=entry.getKey();
                Integer value=entry.getValue();
                System.out.println("key:"+key);
                System.out.println("value:"+value);
            }
            //增强for
            for (Map.Entry<String, Integer> entry : set) {
                String key=entry.getKey();
                Integer value=entry.getValue();
                System.out.println("key:"+key);
                System.out.println("value:"+value);
            }
    }
}
