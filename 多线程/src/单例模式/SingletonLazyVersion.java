package 单例模式;

/**
 * @author yolo
 * @date 2019/11/9-11:46
 */
public class SingletonLazyVersion {
//    private SingletonLazyVersion(){}
//    private static SingletonLazyVersion instance=null;
//    //getInstance被第一次调用时，意味着有人需要初始化instance
//    //再进行初始化
//    public static SingletonLazyVersion getInstance(){
//        //原子开始
//        if(instance==null){
//            instance=new SingletonLazyVersion();
//        }
//        //原子结束
//        return instance;
//    }

//    private SingletonLazyVersion(){}
//    private static SingletonLazyVersion instance=null;
//    //getInstance被第一次调用时，意味着有人需要初始化instance
//    //再进行初始化
//    //静态方法加锁加的是类的锁，每次只允许一个对象，可以保证可见性
//    public static synchronized SingletonLazyVersion getInstance(){
//        if(instance==null){
//            instance=new SingletonLazyVersion();
//        }
//        return instance;
//    }
    private SingletonLazyVersion(){}
    private static SingletonLazyVersion instance=null;
    //getInstance被第一次调用时，意味着有人需要初始化instance
    //再进行初始化
    //静态方法加锁加的是类的锁，每次只允许一个对象，可以保证可见性
    public static synchronized SingletonLazyVersion getInstance(){
        if(instance==null){
            synchronized (SingletonLazyVersion.class){
                instance=new SingletonLazyVersion();
                if(instance==null){//二次判断
                    instance=new SingletonLazyVersion();//但此处依旧存在重排序问题，需要用volatile修饰
                }
            }
        }
        return instance;
    }
}
