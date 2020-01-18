/**
 * @author yolo
 * @date 2020/1/18-21:01
 */
public class Main06 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1211));
    }
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s=Integer.toString(x);
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
