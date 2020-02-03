/**
 * @author yolo
 * @date 2020/2/3-14:43
 */
public class Main加一 {
    public int[] plusOne(int[] digits) {
        //一般情况，加一后位数不会发生变化
        for (int i = digits.length-1; i >=0 ; i--) {
            digits[i]++;
            digits[i]=digits[i]%10;
            if(digits[i]!=0){
                return digits;
            }
        }
        //特殊情况，进行加一后，代编啦数字的位数
        digits=new int [digits.length+1];
        digits[0]=1;
        return digits;
    }
}
