import java.util.Objects;

/**
 * @author yolo
 * @date 2019/10/19-13:08
 * Objects非空判断
 * Objects类中的静态方法：(需要用类名进行访问)
 *  public static <T> requireNonNull(T obj):查看指定对象是不是null
 *  public static <T> requireNonNull(T obj,String str):查看指定对象是不是null
 *  源码：
 *      public static <T> requireNonNull(T obj){
 *          if(obj==nill){
 *              throw new NullPointerException();
 *          }
 *          return obj;
 *      }
 *
 */
public class Demo02Exception {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object obj) {
        //对传递过来的参数进行合法性判断，判断是否为null
        /*
        if(obj==null){
            throw new  NullPointerException("传递的参数为空");
        } */
        Objects.requireNonNull(obj);//不要需要自己再写判空语句
        Objects.requireNonNull(obj,"传递的参数为空");

    }
}

