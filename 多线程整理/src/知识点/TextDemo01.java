package 知识点;

/**
 * @author yolo
 * @date 2020/1/14-18:39
 */
public class TextDemo01 {
    public static void main(String[] args) {
        System.out.println("这是main线程");
        MyThreadDemo01 mt=new MyThreadDemo01("小强");
        mt.start();
        for (int i = 0; i <20 ; i++) {
            System.out.println("旺财"+i);
        }
    }
}
