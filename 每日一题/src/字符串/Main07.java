package 字符串;

/**
 * @author yolo
 * @date 2019/11/26-19:04
 */
public class Main07 {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[]arr=new boolean[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.contains(p[i]);
        }
        return arr;
    }
}
