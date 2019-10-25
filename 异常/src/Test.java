/**
 * @author yolo
 * @date 2019/10/21-21:09
 * 在Java中提供了四种访问权限，使用不同的访问权限修饰符修饰时，被修饰的内容会有不同的访问权限
 * public：公共的。
 * protected：受保护的
 * default：默认的
 * private：私有的
 * 编写代码时，如果没有特殊的考虑，建议这样使用权限：
 * 成员变量使用 private ，隐藏细节。
 * 构造方法使用 public ，方便创建对象。
 * 成员方法使用 public ，方便调用方法。
 * 注意：不加权限修饰符，其访问能力与default修饰符相同
 *
 * 匿名内部类 ：是内部类的简化写法。它的本质是一个 带具体实现的 父类或者父接口的 匿名的 子类对象。
 * 以接口举例，当你使用一个接口时，似乎得做如下几步操作，
 * 1. 定义子类
 * 2. 重写接口中的方法
 * 3. 创建子类对象
 * 4. 调用重写后的方法
 * 我们的目的，最终只是为了调用方法，那么能不能简化一下，把以上四步合成一步呢？匿名内部类就是做这样的快 捷方式。
 * 前提匿名内部类必须继承一个父类或者实现一个父接口。
 */
public class Test {

}
