package Demo01Thread;

/**
 * @author yolo
 * @date 2019/10/24-16:24
 * 主线程：（main线程）执行主方法的线程
 *      JVM 执行main方法，进入占内存，
 *      JVM会找操作系统开辟一条main方法通向CPU的路径，
 *      CPU通过这条路径执行main方法，
 *      而这个路径有一个名字叫做main线程
 * 单线程：Java程序中只有一个线程
 *      执行从main方法开始，从上到下依次执行
 *      中间出现异常会影响后边的程序运行
 *
 *  Java虚拟机允许多线程
 */
public class Demo01MainThread {
    public static void main(String[] args) {

        Person p1=new Person("小强");
        p1.run();
        Person p2=new Person("旺财");
        p2.run();
    }
}
