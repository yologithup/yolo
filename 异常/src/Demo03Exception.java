/**
 * @author yolo
 * @date 2019/10/19-13:20
 * throws关键字：异常处理的第一种方法，交给别人处理
 * 作用：当方法内部抛出异常对象时，我们必须处理这个对象
 * 可以使用throws关键字处理异常，会把异常对象声明抛出给方法的调用者处理（自己不处理，给别人处理）最终交给JVNM进行中断处理
 * 使用格式：
 * 修饰符 返回值类型 方法名（形参列表） throws XXXException,...{
 *     throw new XXXException("产生原因");
 *     。。。
 * }
 * 注意：
 * 1.throws关键字必须写在方法声明处
 * 2.throws关键字后边声明多个异常必须是Exception或者它的子类
 * 3.方法内部如果抛出多个异常，那么throws后边必须也声明多个异常‘
 *  如果抛出的多个异常对象有子父类关系，那么直接声明父类即可
 *  4.调用一个声明抛出异常的方法，我们就必须处理声明的异常
 *    要么继续使用throws声明抛出，将诶方法的调用者，最终由JVM处理
 *    要么try...catch自己处理异常
 */
public class Demo03Exception {
    public static void main(String[] args) {

    }
    /*
    定义一个方法，对传递的文件路径进行合法创建
    如果路径不是"...."，那么我们就抛出文件找不到异常，告知调用者
   注意：抛出啦编译异常就必须进行处理
   可以使用throws继续声明这个异常对象，让方法调用者处理
     */
    public static void readFile(String fileName){

    }
}
