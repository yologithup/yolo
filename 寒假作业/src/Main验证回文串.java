/**
 * @author yolo
 * @date 2020/2/6-12:47
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 */
public class Main验证回文串 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
    public static boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);
            if(Character.isLetter(c)||Character.isDigit(c)){
                str.append(c);
            }
        }

        String temp=str.toString();//注意StringBuilder，操作后会改变自身，所以需要先暂存
        String reserve=str.reverse().toString();
        return reserve.equalsIgnoreCase(temp);
    }
}
