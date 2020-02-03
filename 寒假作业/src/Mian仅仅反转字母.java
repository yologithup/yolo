import java.util.Stack;

/**
 * @author yolo
 * @date 2020/2/2-12:14
 */
public class Mian仅仅反转字母 {
    public String reverseOnlyLetters(String S) {
        Stack<Character>letters=new Stack<>();
        for (char c : S.toCharArray()) {
            if(Character.isLetter(c)){
                letters.push(c);
            }
        }
        StringBuilder ans=new StringBuilder();
        for (char c : S.toCharArray()) {
            if(Character.isLetter(c)){
                ans.append(letters.pop());
            }else {
                ans.append(c);
            }
        }
        return ans.toString();
    }
    public void loop(){

    }
}
