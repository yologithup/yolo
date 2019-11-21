package 数学问题;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/21-14:15
 */
public class Main08 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int m=input.nextInt();
            int result=(int)Math.pow(m,3);
            int temp=result/m;
            ArrayList<Integer>listLeft=new ArrayList<>();
            ArrayList<Integer>listRight=new ArrayList<>();
            if(temp%2==0){
                int left=m/2;
                int right=m/2;
                while(left>0){
                    if(left==m/2){
                        listLeft.add(temp-1);
                    }else{
                        listLeft.add(listLeft.get(listLeft.size()-1)-2);
                    }
                    left--;
                }
                while(right>0){
                    if(right==m/2){
                        listRight.add(temp+1);
                    }else{
                        listRight.add(listRight.get(listRight.size()-1)+2);
                    }
                    right--;
                }
            }else {
                int left=m/2+1;
                int right=m/2+1;
                while(left>0){
                    if(listLeft.size()==0){
                        listLeft.add(temp);
                    }else {
                        listLeft.add(listLeft.get(listLeft.size()-1)-2);
                    }
                    left--;
                }
                while(right>0){
                    if(listRight.size()==0){
                        listRight.add(temp);
                    }else {
                        listRight.add(listRight.get(listRight.size()-1)+2);
                    }
                    right--;
                }
                listRight.remove(0);
            }
            for (int i =listLeft.size()-1; i >=0 ; i--) {
                System.out.print(listLeft.get(i)+"+");
            }
            for (int i =0; i <listRight.size() ; i++) {
                if(i==listRight.size()-1){
                    System.out.print(listRight.get(i));
                }else {
                    System.out.print(listRight.get(i)+"+");
                }
            }
        }
    }
}
