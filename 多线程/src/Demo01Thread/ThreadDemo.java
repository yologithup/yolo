package Demo01Thread;

import java.util.Random;

/**
 * @author yolo
 * @date 2019/11/7-17:43
 */
public class ThreadDemo {
    private static class MyThread extends Thread{
        @Override
        public void run() {
            Random random=new Random();
            while(true){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(random.nextInt(10));
                    //停止运行9秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        //创建线程
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        //启动线程
        t1.start();
        t2.start();
        t3.start();

        Random random=new Random();
        while(true){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
