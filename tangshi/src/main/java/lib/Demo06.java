package lib;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yolo
 * @date 2020/1/9-19:27
 * 通过技术方法判断任务是否完成
 * 考虑线程是否安全
 * int ++；线程不安全
 *
 */
public class Demo06 {
    private static int COUNT = 10;
    /*
    private static int successCount = 0;
    private static int failureCount = 0;
    AtomicInteger:保证变量的原子性
     */
    private static AtomicInteger successCount = new AtomicInteger(0);
    private static AtomicInteger failureCount = new AtomicInteger(0);

    //创建线程
    private static class Job implements Runnable {
        private void work() throws IOException, InterruptedException {
            Random random = new Random();
            int n = random.nextInt(5);
            if (n < 2) {
                throw new IOException();
            }
            Thread.sleep(5);
        }

        @Override
        public void run() {
            try {
                work();
                successCount.getAndIncrement();
            } catch (IOException | InterruptedException e) {
                failureCount.getAndIncrement();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            Thread thread = new Thread(new Job());
            thread.start();
        }

        while (successCount.get() + failureCount.get() != COUNT) {
            Thread.sleep(1000);
            System.out.println("任务没有全部完成");
        }
        System.out.println("任务全部完成");
    }
}
