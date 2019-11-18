package 线程;

/**
 * @author yolo
 * @date 2019/11/18-19:37
 */
public class Demo02 {
    public static void main(String[] args) {
        //创建一个Runnable接口实现类对象
        // 注意：是一个不是多个，若是多个，则不存在资源共享问题
        RunnableTicket run=new RunnableTicket();
        //创建Thread类对象，构造方法中传入Runnable接口实现类对象
        //在此创建三个线程
        Thread t0=new Thread(run);
        Thread t1=new Thread(run);
        Thread t2=new Thread(run);
        //开启三个线程
        t0.start();
        t1.start();
        t2.start();
    }
}
