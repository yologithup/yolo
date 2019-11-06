package 排序;

import java.util.Arrays;

/**
 * @author yolo
 * @date 2019/11/6-23:22
 * 找第k个最大的数
 */
public class Main01 {
    public int findKth(int[] a, int n, int K) {
        // write code here
        Arrays.sort(a);
        return a[a.length-K];
    }
}
