import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author yolo
 * @date 2019/10/16-12:48
 * Hashtable集合:底层也是一个哈希表，是一个线程安全的集合，时单线程集合，速度慢
 * HashMap集合:底层是一个哈希表，是一个线程不安全的集合，速度快
 * Hashtable集合:不能存储null值，null键
 * HashMap集合:存可以储null值，null键
 * Hashtable集合和vector集合一样，在jdk 1.2版本之和被更先进的集合（HashMap,ArrayList）取代啦
 * Hashtable集合的子类Propertist依然活跃在历史舞台
 * Propertist集合是唯一和IO流相结合的集合
 */
public class Demo01HashTable {
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);//{null=null, b=null}

        Hashtable<String,String>table=new Hashtable<>();
        table.put(null,"a");
        table.put("a",null);
        table.put(null,null);
    }
}
