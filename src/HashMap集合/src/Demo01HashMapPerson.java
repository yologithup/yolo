import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author yolo
 * @date 2019/10/16-11:17
 * HashMap存储自定义类型的键值
 * Map集合保证key是唯一的：
 *      作为key的元素，必须重写hashcode方法和equals方法,以保证key唯一
 */
public class Demo01HashMapPerson {
    public static void main(String[] args) {
        //show01();
        show02();
    }


    /*
    HashMap存储自定义类型键值
    key:String类型
        String类重写hashcode方法和equals方法，可以保证key唯一
    value:Person类型
        value可以重复（同年同年龄的人视为同一人）

     */
    private static void show01() {
        //创建HashMap集合
        HashMap<String,Person>map=new HashMap<>();
        //往集合里添加元素
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",19));
        map.put("广州",new Person("王五",20));
        map.put("北京",new Person("赵六",18));
        //使用keySet()---返回所有 key 的不重复集合
        //增强for遍历Map集合
        Set<String>set=map.keySet();
        for (String s : set) {
            Person value=map.get(s);
            System.out.println(s+"-->"+value);
        }
    }
    /*
   HashMap存储自定义类型键值
   key:Person类型
       Person必须重写hashcode方法和equals方法，才能保证key唯一
   value:String类型
        String类重写hashcode方法和equals方法，可以保证key唯一
        value可以重复（同年同年龄的人视为同一人）
    */
    private static void show02() {
        //创建HashMap集合
        HashMap<Person,String>map=new HashMap<>();
        //往集合里添加元素
        map.put(new Person("张三",18),"北京");
        map.put(new Person("李四",19),"上海");
        map.put(new Person("张三",18),"广州");
        map.put(new Person("赵六",18),"北京");
        //使用
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"--->"+value);
        }

    }
}