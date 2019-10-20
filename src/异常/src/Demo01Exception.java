/**
 * @author yolo
 * @date 2019/10/19-12:47
 * throw关键字：
 * 作用：
 * 可以使用throw关键字在指定的方法中抛出指定的异常
 * 使用格式：
 * throw new xxxException("异常产生的原因")
 * 注意：
 * 1.throw关键字必须写在方法的内部
 * 2.throw关键字后边new的对象必须是Exception或者它的子类
 * 3.throw关键字抛出指定的异常对象，我们就必须处理这个对象
 * throw关键字后边创建的是RuntimeException或者它的子类，我们可以不处理，把他交给jvm处理
 * throw关键字后边创建的是编译异常，我们就必须处理这个异常，要么throws，要么try...catch
 */
public class Demo01Exception {
    /*
    定义一个方法，获取指定索引的元素
    参数:
        int []arr
        int index
        以后（工作中）我们必须首先对传递进来的参数进行合法校验
        如果参数不合法，我们必须使用抛出异常的方式，告诉调用者，参数传递有问题

        如果数组是null，那我们就抛出空指针异常，告知方法的调用者，传递的数组的值是null
     */
    public static int getElement(int[] arr,int index){
        /*
        如果数组是null，那我们就抛出空指针异常，告知方法的调用者，传递的数组的值是null
        如果index的范围不在数组下标范围内，我们就需要抛出数组下标越界异常，告知调用者
         */
        if(arr==null){
            throw  new NullPointerException("传递的数组为空");
        }
        if(index<0||index>arr.length){
            throw  new ArrayIndexOutOfBoundsException("数组越界");
        }
        return arr[index];
    }

    public static void main(String[] args) {

    }
}
