package 生活中的算法;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/28-19:12
 * 有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子
 * 假如兔子都不死，问每个月的兔子总数为多少？
 * 分析：
 *      1->1;2->2;3->2;4->3;5->5;6->8...
 *      可以看出每个月的兔子数等于前两个月的兔子数之和
 *
 */

public class Main13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int month=input.nextInt();
            System.out.println(getTotalCount(month));
        }
    }

    private static int getTotalCount(int month) {
        if(month==1||month==2){
            return 1;
        }
        return getTotalCount(month-1)+getTotalCount(month-2);
    }
}
