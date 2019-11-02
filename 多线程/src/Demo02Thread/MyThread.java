package Demo02Thread;

/**
 * @author yolo
 * @date 2019/10/24-16:55
 *
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("我在 method2 中打印");
            // 进程会暂停运行 1 秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
