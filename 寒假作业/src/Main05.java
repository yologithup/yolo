/**
 * @author yolo
 * @date 2020/1/18-20:51
 */
public class Main05 {
    public static void main(String[] args) {
        String str1="aa";
        String str2="aab";
        System.out.println(canConstruct(str1,str2));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i <ransomNote.length() ; i++) {
            char c=ransomNote.charAt(i);
            if(magazine.indexOf(c)==-1){
                return false;
            }else {
                int index=magazine.indexOf(c);
                magazine=magazine.substring(0,index)+magazine.substring(index+1);
            }
        }
        return true;
    }
}
