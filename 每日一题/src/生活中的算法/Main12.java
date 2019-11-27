package 生活中的算法;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author yolo
 * @date 2019/11/27-21:49
 * 题目描述
 * 春节期间小明使用微信收到很多个红包，非常开心。
 * 在查看领取红包记录时发现，某个红包金额出现的次数超过了红包总数的一半。
 * 请帮小明找到该红包金额。写出具体算法思路和代码实现，要求算法尽可能高效。
 *
 * 给定一个红包的金额数组gifts及它的大小n，请返回所求红包的金额。
 *
 * 若没有金额超过总数的一半，返回0。
 * 测试样例：
 * [1,2,3,2,2],5
 * 返回：2
 */
public class Main12 {
    public int getValue(int[] gifts, int n) {
        // write code here
        Map<Integer,Integer>map=new HashMap<>();
        for (int gift : gifts) {
            int count=map.getOrDefault(gift,0);
            map.put(gift,++count);
        }
        double len=gifts.length/2.0;
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : set) {
            if(entry.getValue()>len){
                return entry.getKey();
            }
        }
        return 0;
    }
}
