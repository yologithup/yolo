/**
 * @author yolo
 * @date 2020/2/6-11:46
 */
public class Main在排序数组中查找元素的第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==target){
                ans[0]=i;
                break;
            }
        }

        if(ans[0]==-1){
            return ans;
        }
        for (int i = nums.length-1; i >=0 ; i--) {
            if(nums[i]==target){
                ans[1]=i;
                break;
            }
        }
        return ans;
    }
}
