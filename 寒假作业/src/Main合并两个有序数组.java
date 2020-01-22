import java.util.Arrays;

/**
 * @author yolo
 * @date 2020/1/22-11:51
 */
public class Main合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
    }
}
