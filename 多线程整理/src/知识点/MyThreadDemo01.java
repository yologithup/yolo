package 知识点;

/**
 * @author yolo
 * @date 2020/1/14-18:29
 */
public class MyThreadDemo01 extends Thread{
    //定义指定线程名称的构造方法
    public MyThreadDemo01(String name) {
        //调用父类的String参数的构造方法，指定线程的名称
        super(name);
    }

    /**
     * 重写run方法，完成该线程执行的逻辑
     */
    @Override
    public void run() {
        for (int i = 0; i <20; i++) {
            System.out.println(getName()+":正在执行！"+i);
        }
    }
}
