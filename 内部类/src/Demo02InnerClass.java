/**
 * @author yolo
 * @date 2019/10/19-17:52
 */
public class Demo02InnerClass {
    public static void main(String[] args) {
        Outer.Inner obj=new Outer().new Inner();
        obj.methodInner();
    }
}
