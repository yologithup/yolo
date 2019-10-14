import java.util.HashMap;
import java.util.Map;

/**
 * @author yolo
 * @date 2019/10/14-13:06
 *
 *  java.util.Map<K,V>集合
 *  Map集合的特点：
 *      1.双列集合，每个元素由两部分组成，通过键可以找到对应的值
 *      2.Map集合中的元素，key和value的数据类型可以相同，也可不同
 *      3.Map集合中的元素， K：键 ----键不可以重复         V：值----值可以重复
 *      4.Map集合中的元素，key与value一一对应
 *
 *  Map.Entry<K, V>即 Map 中定义的 K 类型的 key 和 V 类型的 value 的映射关系的类。
 *  Map集合的常用方法：
 *      1.V put(K key, V value)                       设置 key 对应的 value
 *          返回值V：
 *                 存储键值对的时候，key不重复，返回值为null
 *                 存储键值对的时候，key重复，会用新的value替换ap中重复的value，返回被替换的value
 *      2.V remove(Object key)                        删除 key 对应的映射关系
 *          返回值V
 *                 删除时，key存在，返回被删除的值
 *                 删除时，key存在，返回null
 *      3.K getKey()              返回 entry 中的 key
 *          返回值V
 *              key存在，返回value
 *              key不存在，返回null
 *      4.boolean containsKey(Object key)             判断是否包含 key
 *          返回值：boolean
 *              包含返回true
 *              不包含返回false
 *      boolean containsValue(Object value)         判断是否包含 value
 *      V getValue()                                返回 entry 中的 value
 *      V get(Object key)                           返回 key 对应的 value
 *      V getOrDefault(Object key, V defaultValue)  返回 key 对应的 value，key 不存在，返回默认值
 *      <K> keySet()                             返回所有 key 的不重复集合
 *      Collection<V> values()                      返回所有 value 的可重复集合
 *      Set<Map.Entry<K, V>> entrySet()             返回所有的 key-value 映射关系
 *  java.util.HashMap<K,V>集合implement Map<K,V>集合
 *  HashMap集合的特点：
 *      1.HashMap集合的底层是哈希表，查询速度特别快
 *          JDK1.8之前：数组+单项链表
 *          JDK1.8之后：数组+单项链表/红黑树（链表节点数超过8）
 *      2.HashMap集合是一个无序生物集合，存储元素河岸u出元素的顺序可能不一致
 *  java.util.LinkedHashMap<K,V>集合 implement HashMap<K,V> 集合
 *  LinkedHashMap集合
 *      1.LinkedHashMap集合的底层是哈希表+链表（保证迭代顺序）
 *      2.LinkedHashMap集合是一个无序集合，存储元素和取出元素的顺序一致
 *
 *
 *
 *  LinkedHashMap<K,V>
 *
 */
public class Demo01Map {
    public static void main(String[] args) {
        shoe01();
        show02();
        show03();
        show04();

    }

    private static void show04() {
        Map<String,Integer>map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        System.out.println(map);//{林志玲=178, 赵丽颖=168, 杨颖=165}
        System.out.println(map.containsKey("林志玲"));//true
        System.out.println(map.containsKey("小米"));//false
    }

    private static void show03() {
        Map<String,Integer>map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        System.out.println(map);//{林志玲=178, 赵丽颖=168, 杨颖=165}
        System.out.println(map.get("赵丽颖"));//168
        System.out.println(map.get("黎明"));//null
    }

    private static void shoe01() {
        //创建Map集合对象，多态
        Map<String,String>map=new HashMap<>();
        //1.V put(K key, V value)
        String v1=map.put("abc","def");
        System.out.println("v1:"+v1);//v1:null
        String v2=map.put("abc","efg");
        System.out.println("v2:"+v2);//v2:def
        map.put("hig","klm");
        System.out.println(map);//  {abc=efg, hig=klm}--打印的不是地址，所以重写啦toString方法
    }
    private static void show02() {
        Map<String,Integer>map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        System.out.println(map);//{林志玲=178, 赵丽颖=168, 杨颖=165}
        Integer v1=map.remove("林志玲");
        System.out.println("v1:"+v1);//v1:178
        System.out.println(map);//{赵丽颖=168, 杨颖=165}
        Integer v2=map.remove("林志颖");
        System.out.println("v2"+v2);//v2null
        System.out.println(map);//{赵丽颖=168, 杨颖=165}
    }

}
