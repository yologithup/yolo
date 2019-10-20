/**
 * @author yolo
 * @date 2019/10/17-20:59
 * 1.异常的背景
 * 2.语法
 *      2.如何处理异常
 *      3.
 * 3.定义异常：相当于定义一个类
 *
 * 自定义异常：需要构造方法（通过idea写）
 * 4.理解异常：
 *  try: 巡查员
 *  throw： 发生明确的隐患，并且上报
 *  catch：
 *   异常的大分类：
 *      1.无法恢复的错误，环境整个都出现啦问题
 *      硬盘坏掉，电量不足，网络断掉---Error
 *      Error类型一般不会被catch
 *      2.程序员导致的错误--Bug
 *      NPE。。。继承自RuntimeException
 *      bug尽早暴露，一般也不catch
 *      3.网络慢啦，磁盘满啦--有修复的机会
 *      catch并且尝试修复
 *   重点：
 *     受检异常：Exception类的子类，但不包含RuntimeException子类
 *     非受检异常 ：Error的子类，RuntimeException的子类
 *
 */
class Test{
    int num=10;
}
public class Demo01Exception {
    public static void main(String[] args) {
        //System.out.println(10/0);//ArithmeticException
        int[]arr={1,2,3};
        //System.out.println(arr[100]);//ArrayIndexOutOfBoundsException--下标越界
        Test t=null;
        //System.out.println(t.num);//NullPointerException--空指针异常

    }

}
