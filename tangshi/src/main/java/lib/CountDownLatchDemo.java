package lib;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * @author yolo
 * @date 2020/1/9-19:15
 * CountDownLatch是一个非常实用的多线程控制工具类。常用的就下面几个方法：
 *
 *
 * new CountDownLatch(int count) 实例化一个倒计数器，count指定计数个数
 * countDown() 计数减一
 * await() 等待，当计数减到0时，所有线程并行执行
 * 等待的线程调用await方法，。。。线程调用countDown

 */
public class CountDownLatchDemo {
    //创建一个线程：实现Runnable方法
    private static class Job implements Runnable {
        private CountDownLatch countDownLatch;

        Job(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        //实现run方法
        public void run() {
            Random random = new Random();
            try {
                Thread.sleep(random.nextInt(30) * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countDownLatch.countDown();
            System.out.println("一个线程的任务结束了");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            //创建线程池
            Thread thread = new Thread(new Job(countDownLatch));
            thread.start();
        }

        System.out.println("等待 10 个线程全部结束");
        countDownLatch.await();
        System.out.println("10 个线程全部结束了");
    }
}
