package 线程池;

/**
 * @author yolo
 * @date 2019/11/20-20:32
 */
//②创建一个Runnable接口的实现类，重写run方法，设置线程任务
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建啦新的线程执行");
    }
}
