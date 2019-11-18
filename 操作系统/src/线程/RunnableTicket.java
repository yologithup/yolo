package 线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author yolo
 * @date 2019/11/18-19:37
 * 解决不安全问题的办法：
 * 同步机制
 *  1.同步代码块
 *  synchronized(锁对象){
 *      可能会出现线程安全问题的代码块（访问了共享数据的代码块）
 *  }
 *  注意：
 *      ①通过代码块中的锁对象，可以使用任何的对象
 *      ②但是必须保证多个线程使用的锁对象时同一个
 *      ③锁对象的作用：
 *          把同步代码块锁住，只让一个线程在同步代码块中执行
 *  同步技术的原理：
 *      1.同步代码块
 *      使用了一个锁对象，这个对象叫同步锁，也叫对象锁，也叫对象监视器
 *      3个线程一起抢夺CPU的执行权，谁抢到谁执行run方法进行卖票
 *      t0抢到了CPU的执行权，执行run方法，遇到synchronized代码块，这是会检查synchronized代码块是否有锁对象
 *      发现有，就会获取锁对象，进入同步代码中
 *      t1抢到了CPU的执行权，执行run方法，遇到synchronized代码块，这是会检查synchronized代码块是否有锁对象
 *      发现没有，t1就进入阻塞状态，会一直等待t0线程把对象还给同步代码块，t1才能获取到锁对象进入到同步中执行
 *
 *      总结：同步中的线程，没有执行完毕不会是否锁，同步外的线程没有锁进不去同步
 *      同步保证了只有一个线程在同步中执行共享数据，保证了安全，程序频繁的判断锁，获取锁，释放锁，程序的效率会降低
 *
 *       2.同步方法
 *       ①把访问了共享数据的代码抽出来，放到一个方法中
 *       ②在方法上添加synchronized修饰符
 *       格式：修饰符 synchronized 返回值类型  方法名（参数列表）{
 *
 *       }
 *       定义一个同步方法，同步方法也会把方法内的代码所著，只让一个线程执行，
 *       同步方法锁的对象是谁？
 *
 *       3.lock锁
 *       Lock实现提供了比使用synchronized方法和话语可获得的更广泛的锁定操作
 *       Lock接口中的方法：
 *       void lock()获取锁
 *       void unlock（）释放锁
 *       使用步骤：
 *          ①在成员位置创建一个ReentrantLock对象
 *          ②在可能会出现问题的代码前调用Lock接口中的方法lock获取锁
 *          ③在可能会出现问题的代码后调用Lock接口中的方法unlock释放锁
 *
 */
public class RunnableTicket implements Runnable {
    //定义一个线程共享的资源
    private int ticket=10;
    Lock l=new ReentrantLock();
    @Override
    public void run() {
        //使用死循环，重复卖票操作
        while (true) {
            l.lock();
            if(ticket>0){
                try {
                    Thread.sleep(100);//提高问题的出现率，便于观察，不写也可以
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                ticket--;
            }
            l.unlock();
        }
    }




}

