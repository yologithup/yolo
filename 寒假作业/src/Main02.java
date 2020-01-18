
/**
 * @author yolo
 * @date 2020/1/18-18:44
 */
public class Main02 {
    public static void main(String[] args) {

    }
    public void rotate(int[] nums, int k) {
       reserve(nums,0,nums.length-1);
       reserve(nums,0,k-1);
       reserve(nums,k,nums.length-1);

    }


    private void reserve(int[] nums, int left, int right) {
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}
