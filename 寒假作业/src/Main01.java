import java.util.Scanner;

/**
 * @author yolo
 * @date 2020/1/18-18:26
 * 大小写转换
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        System.out.println(toLowerCase(str));
    }
    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }
}
