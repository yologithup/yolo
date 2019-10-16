import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author yolo
 * @date 2019/10/16-12:20
 * java.util.LinkedHashMap<K,V>extends HashMap<K,V>
 *     Map接口的哈希表和链表实现，具有可预知的迭代顺序
 *     底层原理：
 *          哈希表+链表
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();
        map.put("c","c");
        map.put("d","a");
        map.put("a","a");
        map.put("a","d");
        System.out.println(map);
        System.out.println("=============");
        HashMap<String,String>linked=new LinkedHashMap<>();
        linked.put("c","c");
        linked.put("d","a");
        linked.put("a","a");
        linked.put("a","d");
        System.out.println(linked);
    }
}
