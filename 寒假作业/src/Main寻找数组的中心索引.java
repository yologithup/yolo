/**
 * @author yolo
 * @date 2020/2/3-14:04
 * S 是数组的和，当索引 i 是中心索引时，位于 i 左边数组元素的和 leftsum 满足 S - nums[i] - leftsum。
 * 我们只需要判断当前索引 i 是否满足 leftsum==S-nums[i]-leftsum 并动态计算 leftsum 的值。
 */
public class Main寻找数组的中心索引 {
    public int pivotIndex(int[] nums) {
        int sum=0,leftsum=0;
        for (int num : nums) {
            sum+=num;
        }
        for (int i = 0; i < nums.length; i++) {
            if(leftsum==sum-leftsum-nums[i]){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}
