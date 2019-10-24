package Demo02Thread;

/**
 * @author yolo
 * @date 2019/10/24-16:55
 *
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("run:"+i);
        }
    }
}
