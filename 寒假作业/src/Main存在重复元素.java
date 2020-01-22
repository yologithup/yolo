import java.util.HashMap;
import java.util.Map;

/**
 * @author yolo
 * @date 2020/1/22-16:44
 */
public class Main存在重复元素 {
    public static void main(String[] args) {
        int[]arr={1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count=map.getOrDefault(nums[i],0);
            map.put(nums[i],++count);
        }
        System.out.println(map);
        for (Integer key : map.keySet()) {
            if(map.get(key)>=2){
                return true;
            }
        }
        return false;
    }
}
