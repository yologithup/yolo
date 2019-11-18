package 线程;

/**
 * @author yolo
 * @date 2019/11/18-14:24
 * 开启三个线程，三个线程抢CPU的执行权，谁抢到，谁执行
 * t0抢到啦执行权，执行if语句时，遇到睡眠会放弃CPU的执行权
 *  线程安全问题时不能够产生的，我们剋让一个线程访问共享数据的时候，无论是失去CPU的执行权
 *  其他线程只能等待当前线程卖完票，其他线程再进行卖票操作，也就是只保证一个人在卖票
 */
public class Main02 {
    public static void main(String[] args) {
        Runnable runnable=new MyRunnable();
        Thread mt=new Thread(runnable);
        mt.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
