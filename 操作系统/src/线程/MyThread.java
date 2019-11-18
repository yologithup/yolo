package 线程;

/**
 * @author yolo
 * @date 2019/11/17-20:38
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("MyThread"+i);
            try {
                sleep(1000);//单位毫秒，会抛出异常，需要进行异常处理
                                    //效果：循环在打印时，会一秒打印一次
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//public class MyThread extends Thread {
//    @Override
//    public void run() {
//        System.out.println(getName());
//
//    }
//}
//public class MyThread extends Thread {
//    public MyThread() {
//    }
//
//    public MyThread(String name) {
//        super(name);//调用父类的带参构造方法
//    }
//    @Override
//    public void run() {
//        System.out.println(getName());
//
//    }
//}