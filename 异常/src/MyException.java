import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/10/21-20:03
 * 格式：
 * public class XXXException extends Exception|RuntimeException{
 *     添加一个无参的构造方法
 *     添加一个有参的构造方法:添加一个有参的构造方法，方法内部会调用父类的异常信息构造方法，让父类来处理
 * }
 * 注意：
 * 1.自定义异常类一般都是以Exception 结尾，说明该类是一个异常类
 * 2.自定义异常：必须继承Exception|RuntimeException
 *      继承Exception：那么自定义异常就是一个编译异常，如果方法内部抛出啦编译异常，就必须处理这个异常，要么throw，要么try...catch
 *      继承RuntimeException：那么自定义异常就是一个运行异常，无序处理，交给JVM即可
 *
 *
 * 分析：
 * 1.使用数组保存已经注册过的用户名（数据库）
 * 2.使用Scanner获取输入佛如注册信息（前端，页面）
 * 3.定义一个方法，对输入和注册的用户进行判断
 *      遍历数组，获取每个用户名
 *      使用用户名和输入佛如用户名进行比较
 *          true：用户已经存在，抛出异常，告诉用户该用户已经存在
 *          false：继续遍历比较
 *       如果循环结束，还没有找到重复的用户名，提示用户注册成功
 *
 */
public class MyException{
    static String[]userNames={"张三","李四","王五"};
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要注册的用户名");
        String name = input.nextLine();
        checkName(name);
    }
//    public static void checkName(String name) throws RegisteException {
//        for (String userName : userNames)
//            if (userName.equals(name)) {
//                throw new RegisteException("该用户已经被注册");
//            }
//        System.out.println("注册成功");
//    }
    public static void checkName(String name) {
        for (String userName : userNames) {
            if(userName.equals(name)){
                try {
                    throw new RegisteException("该用户已经存在");
                } catch (RegisteException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("注册成功");
    }

}
