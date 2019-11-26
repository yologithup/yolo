package 排序;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/26-19:29
 * 题目描述
 * 查找和排序
 *
 * 题目：输入任意（用户，成绩）序列，可以获得成绩从高到低或从低到高的排列,相同成绩
 * 都按先录入排列在前的规则处理。
 *
 * 示例：
 * jack      70
 * peter     96
 * Tom       70
 * smith     67
 *
 * 从高到低  成绩
 * peter     96
 * jack      70
 * Tom       70
 * smith     67
 *
 * 从低到高
 *
 * smith     67
 *
 * jack      70
 * Tom      70
 * peter     96
 *
 * 输入描述:
 * 输入多行，先输入要排序的人的个数，然后输入排序方法0（降序）或者1（升序）再分别输入他们的名字和成绩，以一个空格隔开
 *
 * 输出描述:
 * 按照指定方式输出名字和成绩，名字和成绩之间以一个空格隔开
 *
 * 示例1
 * 输入
 * 3
 * 0
 * fang 90
 * yang 50
 * ning 70
 * 输出
 * fang 90
 * ning 70
 * yang 50
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