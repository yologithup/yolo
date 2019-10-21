import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * @author yolo
 * @date 2019/10/20-21:19
 * 多个异常使用捕获又该如何处理？
 * 1.多个异常多次捕获，分开处理
 * 2.多个异常一次捕获，分开处理
 * 注意事项：
 * catch里边定义的异常变量，子类的异常变量必须紫萼在上边，否则会报错
 * 报错原因：
 * 3.多个异常一次捕获，一次处理
 * 让catch里定义的变量可以接收所有的异常即可
 * 捕获处理的好处:后续代码会被打印
 */
public class Demo06Attention {
    public static void main(String[] args) {
        try {
            int[]arr={1,2,3};
            System.out.println(arr[3]);
            List<Integer>list=new LinkedList<>();
            list.add(1);
            list.add(2);
            System.out.println(list.get(3));
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
