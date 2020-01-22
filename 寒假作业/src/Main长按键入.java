import java.time.chrono.IsoChronology;

/**
 * @author yolo
 * @date 2020/1/22-17:10
 */
public class Main长按键入 {
    public static void main(String[] args) {
        String str1="saeed";
        String str2= "ssaaedd";
        isLongPressedName(str1,str2);
    }
    public static boolean isLongPressedName(String name, String typed) {
        char[] n=name.toCharArray();
        char[] t=typed.toCharArray();

        int p1=0,p2=0;
        while(p1<n.length&&p2<t.length){
            if(n[p1]==t[p2]){
                p1++;
            }
            p2++;
        }
        return p1==t.length;
    }
}
