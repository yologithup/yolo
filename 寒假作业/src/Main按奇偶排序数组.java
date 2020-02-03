/**
 * @author yolo
 * @date 2020/2/3-12:18
 */
public class Main按奇偶排序数组 {
    public int[] sortArrayByParity(int[] A) {
        int left=0,right=A.length-1;
        while(left<right){
            while(left<right&&A[left]%2==0){
                left++;
            }
            while (left<right&&A[right]%2!=0){
                right--;
            }
            int temp=A[left];
            A[left]=A[right];
            A[right]=temp;
        }
        return A;
    }
}
