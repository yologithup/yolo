import java.util.Arrays;

/**
 * @author yolo
 * @date 2020/1/18-20:02
 */
public class Main03 {
    public int removeElement(int[] nums, int val) {
        int ans=0;
        for (int num : nums) {
            if(num!=val){
                nums[ans]=num;
                ans++;
            }
        }
        return ans;
    }
}
