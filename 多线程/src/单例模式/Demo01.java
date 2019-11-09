package 单例模式;

/**
 * @author yolo
 * @date 2019/11/9-11:42
 */
public class Demo01 {
    private Demo01(){}
    private static Demo01 instance =new Demo01();
    public static Demo01 getInstance(){
        return instance;
    }
}
