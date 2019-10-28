package 数组;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yolo
 * @date 2019/10/28-20:54
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Solution03 {
    public void reOrderArray(int [] array) {
        List<Integer> list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                list1.add(array[i]);
            }else {
                list2.add(array[i]);
            }
        }
        int i=0;
        for(int index=0;index<list1.size();index++){
            array[i]=list1.get(index);
            i++;
        }
        for(int index=0;index<list2.size();index++){
            array[i]=list2.get(index);
            i++;
        }
    }
}
