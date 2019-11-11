package 数组;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/11-21:24
 */
public class Main02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        while (input.hasNextInt()){
            list.add(input.nextInt());
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()/2));
    }
}
