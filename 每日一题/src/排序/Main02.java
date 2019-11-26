package 排序;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/26-19:29
 */
class student{
    public String name;
    public  int grade;

    public student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name+" "+grade;
    }
}

public class Main02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            List<student>list=new ArrayList<>();
            int n=input.nextInt();
            int flag=input.nextInt();
            while(n-->0){
                list.add(new student(input.next(),input.nextInt()));
            }
            //降序
            if(flag==0){
                list.sort((o1,o2)->o2.grade-o1.grade);
            }
            //升序
            if(flag==1){
                list.sort((o1,o2)->o1.grade-o2.grade);
            }
            for (student student : list) {
                System.out.println(student.toString());
            }
        }
    }
}