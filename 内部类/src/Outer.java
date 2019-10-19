/**
 * @author yolo
 * @date 2019/10/19-17:46
 * 如何访问外部类成员变量：
 * 如果出现啦重名现象，那么格式是：外部类.this.成员名称
 */
public class Outer {
    int num=10;
    public class Inner{
        int num=20;
        public void methodInner(){
            int num=30;//内部类方法局部变量
            System.out.println(num);//30--局部变量就近原则
            System.out.println(this.num);//20--内部类的成员变量
            System.out.println(Outer.this.num);//10--外部类的成员变量
        }
    }
}
