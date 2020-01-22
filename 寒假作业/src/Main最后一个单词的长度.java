/**
 * @author yolo
 * @date 2020/1/22-11:40
 */
public class Main最后一个单词的长度 {
    public int lengthOfLastWord(String s) {
        String[]arr=s.split(" ");
        if(arr.length>=1){
            return arr[arr.length-1].length();
        }else {
            return 0;
        }
    }
}
