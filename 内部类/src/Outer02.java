import javax.crypto.interfaces.PBEKey;

/**
 * @author yolo
 * @date 2019/10/19-18:19
 */
public class Outer02 {
    public void methodOuter(){
        class Inner02{//局部内部类
            int num=10;
            public void methodInner02(){
                System.out.println(num);
            }
        }
        Inner02 inner02=new Inner02();
        inner02.methodInner02();
    }
}
