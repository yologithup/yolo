package 等待集;

/**
 * @author yolo
 * @date 2019/11/12-19:24
 */
public class NWaitDemo {
    private static Object o = new Object();
    private static int n = 0;

    private static class Sub extends Thread {
        Sub() {
            super("n--");
        }

        @Override
        public void run() {
            while (true) {
                synchronized (o) {
                    if (n == 0) {
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    n--;
                    System.out.println(getName() + ":" + n);
                    o.notify();
                }
            }
        }
    }

    private static class Add extends Thread {
        Add() {
            super("n++");
        }

        @Override
        public void run() {
            while (true) {
                synchronized (o) {
                    if (n == 10) {
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    n++;//因为锁还没有释放，所以notify可以放在上边
                    System.out.println(getName() + ":" + n);
                    o.notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread a = new Add();
        Thread b = new Sub();
        a.start();
        b.start();
    }
}
