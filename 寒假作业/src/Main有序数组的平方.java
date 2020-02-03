import java.util.Arrays;

/**
 * @author yolo
 * @date 2020/2/2-12:04
 */
public class Main有序数组的平方 {
    public int[] sortedSquares(int[] A){
        for (int i = 0; i < A.length; i++) {
            A[i]=(int)Math.pow(A[i],2);
        }
        Arrays.sort(A);
        return A;
    }
}
