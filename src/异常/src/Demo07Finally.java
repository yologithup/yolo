/**
 * @author yolo
 * @date 2019/10/20-21:59
 * 如果finally有return，永远返回finally中的结果，应避免这种情况
 */
public class Demo07Finally {
    public static void main(String[] args) {
        int a=getA();
        System.out.println(a);
    }

    private static int getA() {
        int a=10;
        try {
            return a;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            a=100;
            return a;
        }
    }
}
