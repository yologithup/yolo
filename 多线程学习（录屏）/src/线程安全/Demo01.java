package 线程安全;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
/**
 * @author yolo
 * @date 2019/11/17-18:18
 * 1.阻塞队列
 *  1.Java中的阻塞队列有哪些
 *      import java.util.concurrent.BlockingDeque;
 *      如果生产者往里边放东西时，发现已经满啦，就阻塞
 *      如果消费者从里边取东西时，发现已经空啦，就阻塞
 *
 * 2.定时器
 * 3.线程池
 */
public class Demo01 {
    //用链表实现的阻塞队列，一般情况下无上线，但最大也只能为int类型的最大值，但他有下线
    private static BlockingQueue<Integer> quene=new ArrayBlockingQueue<>(1);
    private static class Produce extends Thread{
        @Override
        public void run() {
            Random random=new Random(20191117);
            while(true){
                try {
                    int mesage=random.nextInt(100);
                    quene.put(mesage);
                    System.out.println("放入消息："+mesage);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static class Costomer extends Thread{
        @Override
        public void run() {
            while(true){
                try {
                    int message=quene.take();
                    System.out.println("收到消息："+message);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Produce produce=new Produce();
        Costomer costomer=new Costomer();
        produce.start();
        costomer.start();
    }
}
