package 线程安全相关知识;

import java.util.Objects;

/**
 * @author yolo
 * @date 2019/11/9-9:23
 * 语法：
 *  1.修饰普通方法方法：
 *      1.如果可以锁，就正常执行代码
 *      2.否则需要的带其他的线程把锁释放（unlock）
 *          如果 一个线程lock到这把锁，到方法执行结束的额时候，这把锁就会被unlock
 *
 *
 * 作用：
 */
class SynchronizedDemo{
    public synchronized void method(){
        while(true){
            for (int i = 0; i <10 ; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}
public class Demo01 {
    static class MyThread extends Thread{
        SynchronizedDemo object;
        MyThread(SynchronizedDemo object){
            this.object=object;
        }
        public void run(){
            while (true){
                for (int i = 0; i <10 ; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedDemo object=new SynchronizedDemo();
        MyThread thread=new MyThread(object);
        thread.start();
        object.method();
    }
}
