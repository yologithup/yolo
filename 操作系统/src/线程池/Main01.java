package 线程池;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author yolo
 * @date 2019/11/20-19:51
 * 线程池：
 *  集合（Array List，HashSet，HashMap,LinkedList）
 *  jdk1.5之后提供的：
 *      java.util.concurrent.Executors:线程池的工程类，用来生成线程池
 *      Executors类中的静态方法：
 *          public static ExecutorService newFixedThreadPool(int nThreads)：创建一个可重复使用的线程池
 *          参数：int nThreads：创建的线程池中包含的线程数量
 *          返回值：ExecutorService接口，返回的是接口的实现类对象，我们可以用ExecutorService接口接收（面向接口编程）
 *      java.util.concurrent. ExecutorService接口：
 *      ExecutorService接口：
 *          用来从线程池获取线程，调用start方法，执行线程任务
 *              submit(Runnable task)：提交一个Runnable任务用于执行
 *          关闭销毁线程：
 *          使用    void shutdown()
 *     线程池使用步骤：
 *      ①线程池的工厂类Executors里边提供的静态方法newFixedThreadPool产生一个指定线程数量的线程池
 *      ②创建一个Runnable接口的实现类，重写run方法，设置线程任务
 *      ③调用ExecutorService中的方法submit，传递线程任务，开启线程，执行run方法
 *      ④调用ExecutorService中的方法shutdown，销毁线程--不建议使用，使用之后线程池不可再次使用
 */
public class Main01 {
    public static void main(String[] args) {
        //①线程池的工厂类Executors里边提供的静态方法newFixedThreadPool产生一个指定线程数量的线程池
        ExecutorService pool = Executors.newFixedThreadPool(2);
        //③调用ExecutorService中的方法submit，传递线程任务，开启线程，执行run方法
        pool.submit(new MyRunnable());
        //线程池一直开启，使用完了线程，会把线程回环给线程池，线程可以继续使用
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        //④调用ExecutorService中的方法shutdown，销毁线程--不建议使用，使用之后线程池不可再次使用
        pool.shutdown();
    }
}
