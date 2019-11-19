package 线程;

/**
 * @author yolo
 * @date 2019/11/19-14:07
 * 线程的六种状态
 * new：创建好，但还未启动的线程处于这个状态
 * Runnable：正在虚拟机种执行的线程处于这个状态
 * Blocked：受阻塞并且等待某个监视器锁的线程处于这个状态
 * Waiting：无限期等待另一个线程来执行某一特定操作的线程主语这种状态
 * Time_Waiting:等待另一个线程来执行，取决于指定等待时间操作的线程处于这种状态
 * Terminated:已经退出的线程处于这种状态
 *
 * 进入TimeWaiting（计时等待）有两种方式
 *  ①使用sleep（long m）方法，在毫秒值结束之后，线程睡醒，进入到Runnable/Blocked状态
 *  ②使用wait（long m）方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，就会自带醒来，进入到Runnable/Blocked状态
 *唤醒的方法：
 *  ①notify：唤醒单个线程
 *  ②notifyAll：唤醒监视器上所有的线程
 * 等待唤醒案例：线程之间的通信
 *      创建一个顾客线程（消费者）：告知老板要的包子的种类和数量，调用wait方法，放弃CPU的执行，进入到waiting状态（无线等待）
 *      创建一个老板线程（生产者）：花了一秒做包子，包子做好后，调用notify方法，唤醒顾客吃包子
 *    注意：
 *      顾客和老板必须使用同步代码块包裹起来，保证等待和唤醒只能由一个在执行
 *      同步使用的锁对象必须保证唯一
 *      只有锁对象才能调用wait和notify方法
 *
 *    Object类中的方法：
 *      void wait()：在其他线程嗲用此对象的notify方法或Allnotify方法前，导致当前线程等待
 *      void notify():唤醒在此对象加湿器上等待的单个线程，被唤醒后的线程继续执行wait后的代码
 *
 *
 */
public class Main03 {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj=new Object();
        //创建顾客线程（匿名）--消费者
        new Thread(){
            @Override
            public void run() {
                //保证等待和唤醒只能由一个在执行，需要使用同步技术
                synchronized (obj){
                    System.out.println("告知老板要的包子数量和种类");
                    //调用wait方法，放弃CPU的执行，进入waiting等待状态
                    try {
                        obj.wait();//wait方法出现异常，但由于父类没有抛出异常，所以子类在此处也不可以throws抛出异常
                                    //只能进行异常的捕获
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //wait后的代码
                    System.out.println("包子已经做好，开吃");
                }
            }
        }.start();//启动顾客线程

        //创建老板线程（匿名）--生产者
        new Thread(){
            @Override
            public void run() {
                //花一秒做包子，所以需要休眠一秒
                try {
                    Thread.sleep(1000);//sleep会出现异常
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //保证等待和唤醒只能由一个在执行，需要使用同步技术
                synchronized (obj){
                    System.out.println("老板一秒之后做好包子，告知顾客可以吃包子了");
                    //唤醒顾客吃包子
                    obj.notify();
                }
            }
        }.start();
    }
}
