package 线程;

/**
 * @author yolo
 * @date 2019/11/17-20:13
 * 线程调度：
 *  分是调度，抢占式调度---Java是抢占式调度
 *  主线程：
 *      执行主方（main）法的线程
 *  单线程程序：Java线程中只有一个线程
 *      执行从main方法开始执行，从上到下
 *  JVM执行main方法，main方法会进入到栈内存，JVM会找操作系统开辟一条main方法通向CPU的路径
 * CPU就可以通过这个路径指向main方法，而这个路径有一个名字，叫main线程（执行主方法的线程）
 *线程创建：
 *  方法一：
 *      创建Thread的子类
 *      ①创建一个Thread类的子类
 *      ②再Thread类的子类中，重写Thread中的run 方法，设置线程任务（开启线程要做什么）
 *      ③创建Tread类的子类对象
 *      ④调用Tread类中的start方法，开启线程，执行run方法
 *          结果是连个线程并发的执行，当前线程（main线程）和另外一个线程（创建的新线程）
 *          多次启动一个线程时非法的。特别是当线程已经结束执行后，不能再重新启动
 *
 *      注意：调用直接run方法（此时是单线程程序）
 *           调用start方法（会开辟一个新的栈空间，执行run方法，此时为多线程程序）是有所不同的
 *           对于CPU而言他就有啦选择的权力，它可以从main方法，也可以执行run方法，他们在不同的栈空间
 *           多线程的好处：多线程之间互不影响（在不同的栈空间）
 *  方法二：
 *      实现Runnable接口
 *          Runnable接口应该由那些打算通过某一线程执行实例的类来实现。类必须定义一个称为run的无参方法
 *          java.lang.Thread类的构造方法
 *          ①创建一个Runnable接口的实现类
 *          ②在实现类中重写Runnable接口中的run方法，设置线程任务
 *          ③创建一个Runnable接口的置线对象
 *          ④创建一个Thread类对象，构造方法中传递Runnable接口的实现类对象
 *          ⑤调用Thread类的start方法，启动新的线程，执行run方法
 *      实现Runnable接口创建多线程程序事物好处
 *          ①避免啦继承Thread类的局限性
 *              一个类只能继承一个类，类继承了Thread类就不能继承其他类
 *              实现Runnable接口，还可以继承其他的类，实现其他的接口
 *          ②增强了程序的扩展性，降低程序的耦合性（解耦）
 *              实现Runnable接口的方式，把设置线程的任务和开启线程进行了分离（解耦）
 *              实现类中重写run方法：用来涉资线程任务
 *              创建Thread类对象，调用start方法开启线程
 *              此时传递不同的实现类，可以执行不同的任务
 *
 *Thread类的常用方法：
 *  1.获取当前线程名称
 *      ①使用Thread类中的getName()
 *          String getName();返回该线程的名称
 *      ②可以先获取当前正在执行的线程，使用线程中的getName()获取线程的名称
 *          static Thread currentThread()--静态方法，需要用类名访问
 *      线程名称：
 *          主线程：main
 *          新线程：Thread-0，Thread-1，Thread-2......
 *  2.设置线程名称
 *      ①使用Thread类中的方法setName()，在启动线程之前使用
 *          void setName(String name)
 *      ②创建一个带参数的构造方法，参数创思线程的名称，调用父类的代餐构造方法，把线程名床底给父类，让父类（Thread给他起名字），再创建线程时使用
 *  3.暂停当前线程
 *  public static void sleep(long millis)
 *                   throws InterruptedException使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行），具体取决于系统定时器和调度程序的精度和准确性。 线程不会丢失任何显示器的所有权。
 *          参数：millis - 以毫秒为单位的睡眠时间长度
 *          异常 ：
 *              IllegalArgumentException - 如果 millis值为负数
 *              InterruptedException - 如果任何线程中断当前线程。 当抛出此异常时，当前线程的中断状态将被清除。
 */
public class Main01 {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.setName("小强");
        mt.start();
        //因为主线程没有基础继承Thread类，所以不能狗直接调用getName()，需要先获取当前线程，再进行调用
        System.out.println(Thread.currentThread().getName());
    }
}
