package Demo02Thread;

import java.util.Map;
import java.util.zip.DeflaterOutputStream;

/**
 * @author yolo
 * @date 2019/10/24-16:39
 *
 * 创建多线程的第一种方法：Thread类
 * 实现步骤：
 *      1.创建一个Thread的子类
 *      2.在Thread子类的子类中重写run方法，设置线程任务（开启的线程要做什么？）
 *      3.创建Thread类的子类对象
 *      4.调用Thread类中的start方法，开启新的线程，执行run方法
 *          void start（）使该线程开始执行：Java虚拟机调用该县线程的run方法
 *          结果是两个线程并发进行，当前线程（main线程）和另一个（创建的新线程，执行run方法）
 *          多次启动一个线程是非法的。特别是当前线程已经结束的时候，不能够再重新启动
 *  Java程序属于抢占式调度，哪个线程的优先级高，哪个线程就优先执行，同一个优先级就随机选择执行
 *
 *  结论：可以看的处每次的运行结果不一致（随机性打印），是因为Java程序属于抢占式调度
 *
 *  多线程程序的原理：
 *  JVM执行main方法，开辟一条main方法通向CPU的路径，这个路径叫做main线程，CPU通过这个线程，这个路径可以执行main方法
 *  MyThread mt=new MyThread();
 *      开辟一条通向CPU的新路径，用来执行ｒｕｎ方法
 *  对于cup而言，就有啦两条执行路径，CPU有啦选择权，CPU喜欢谁，就选择那条路径，我们控制不了CPU，所以就有啦随机值
 *  两个线程一个main线程，一个新的线程一起抢夺CPU的执行权（执行时间），谁抢到啦谁就执行对应的代码
 */
public class Demo01PrimeThread {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.start();
        for (int i = 0; i <20 ; i++) {
            System.out.println("main" + i);
        }
    }
}
