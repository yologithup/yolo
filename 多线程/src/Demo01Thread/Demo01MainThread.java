package Demo01Thread;

import Demo02Thread.MyThread;

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
 *  Java虚拟机允许多线程
 *  多线程与多进程的区别：
 *      最大区别：执行流之间是否有资源的共享（进程没有资源的共享，线程有资源的共享）
 *      进程是系统分配资源的最小单位，线程是系统调度的最小单位。
 *      一个进程内的线程之间是可以共享资源的。
 *  多线程的优点：增加运行速度（但也不时绝对的，任务量不大时，没必要创建线程，若是创建线程反而会降低效率）
 *  创建线程的方法：
 *      1.继承Thread类
 *        可以通过继承 Thread 来创建一个线程类，该方法的好处是 this 代表的就是当前线程，不需要通过Thread.currentThread() 来获取当前线程的引用。
 *      2.实现Runnable接口
 *        通过实现 Runnable 接口，并且调用Thread的构造方法将Runnable对象作为 target 参数传入来创建线程对象
 *        该方法的好处是可以规避类的单继承的限制，但需要通过 Thread.currentThread() 来获取当前线程的引用。
 *      3.使用匿名类创建Thread子类对象
 *        使用匿名类创建Runnable子类对象
 *  Thread类及常见方法
 *      Thread 类是 JVM 用来管理线程的一个类--->每个线程都有一个唯一的 Thread 对象与之关联
 *
 *      ID 是线程的唯一标识，不同线程不会重复,
 *      名称是各种调试工具用到
 *      状态表示线程当前所处的一个情况，下面我们会进一步说明
 *      优先级高的线程理论上来说更容易被调度到
 *      关于后台线程，需要记住一点：JVM会在一个进程的所有非后台线程结束后，才会结束运行。
 *      是否存活，即简单的理解，为 run 方法是否运行结束了
 *  覆写run方法：
 *      覆写run方法是提供给线程要做的时期的指令清单
 *      而调用start方法就是，启动这个进程，这时线程才真正的运行起来
 *  进程启动：
 *      调用start（）方法
 *  进程中断：
 *      方法一：通过共享的标记来进行沟通
 *      方法二：调用 interrupt() 方法来通知
 *  进程的状态：
 *      状态间的转移以及引发转移的事件或者方法的调用
 *  线程安全：
 *      1.哪些区域共享，哪些不共享
 *      2.线程的三点
 *          原子性
 *          内存可见性
 *          代码重用
 *
 */
public class Demo01MainThread {
    static class MyThread extends  Thread{
        @Override
        public void run() {
            System.out.println("这里是线程t1运行的代码");
        }
    }
    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+"这里是线程t2运行的代码");
        }
    }
    public static void main(String[] args) {
        Thread t1=new Thread(new MyThread());
        Thread t2=new Thread(new MyRunnable());
        t1.start();
        t2.start();
    }
}
