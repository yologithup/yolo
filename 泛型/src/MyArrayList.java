/**
 * @author yolo
 * @date 2019/10/13-9:53
 *  1.类型：泛型类/泛型方法
 *  2.泛型：一定要区分是泛型的定义还是使用
 *  3.把握E。。。是一个变量，有其作用域
 *      类名后边的都是定义类型，其余位置都是使用
 *  4.谁是谁的父类问题：
 *      List<Object>不是List<String>的父类
 *      List<？>是List<String>的父类
 *
 *  5.泛型作用于编译期间----编译完成后泛型被擦除（类型擦除）
 *  6.泛型的限制
     *  1. 泛型类型参数不支持基本数据类型
     *  2. 无法实例化泛型类型的对象--E无法确定，所以不能够实例化
     *  3. 无法使用泛型类型声明静态的属性
     *  4. 无法使用 instanceof 判断带类型参数的泛型类型
     *  5. 无法创建泛型类数组
     *  6. 无法 create、catch、throw 一个泛型类异常（异常不支持泛型）
     *  7. 泛型类型不是形参一部分，无法重载
 *
 */

//此处的MyArrayList<E>泛型类与Set<K>和Map<K,V>类似
public class MyArrayList<E> {
    private E[]arr;
    private int size;
    public MyArrayList(){
        //
        arr= (E[]) new Object[16];
        size=0;
    }
    //头插
    public void add(E e){
        arr[size++]=e;
    }
    //尾删，并返回所删除的值
    public E remove(){
        E element=arr[size--];
        arr[size]=null;
        return element;
    }
    //.....自己还可以继续实现其他方法

}
