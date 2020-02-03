import java.util.Arrays;

/**
 * @author yolo
 * @date 2020/2/3-14:59
 */
public class Main第三大数字 {
    public static void main(String[] args) {
        int[]arr={2,2,3,1};
        System.out.println(thirdMax(arr));
    }
    public static int thirdMax(int[] nums) {
        if(nums.length<3){

        }
        String str="";
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int num=nums[i];
            if(str.indexOf(num)==-1){
                str+=num;
            }
        }
        char c=' ';
        if(str.length()>=3){
             c=str.charAt(str.length()-3);
        }else if(str.length()==1){
             c=str.charAt(0);
        }else if(str.length()==2){
             c=str.charAt(1);
        }
        return Integer.valueOf(c)-'0';
    }
}
