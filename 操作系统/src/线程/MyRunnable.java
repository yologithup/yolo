package 线程;

/**
 * @author yolo
 * @date 2019/11/18-14:22
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
