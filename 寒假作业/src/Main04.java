/**
 * @author yolo
 * @date 2020/1/18-20:33
 */
public class Main04 {
    public int searchInsert(int[] nums, int target) {
        int index=nums.toString().indexOf(target);
        if(index!=-1){
            return index;
        }
       index=0;
        for (int num : nums) {
            if(num<target){
                index++;
            }
        }
        return index;
    }
}
