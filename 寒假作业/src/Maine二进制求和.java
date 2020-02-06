/**
 * @author yolo
 * @date 2020/2/3-18:31
 */
public class Maine二进制求和 {
    public String addBinary(String a, String b) {
        //1.构造StringBuilder字符串
        StringBuilder sbA=new StringBuilder(a);
        StringBuilder sbB=new StringBuilder(b);
        //2.计算字符串的大小
        int lenA=sbA.length();
        int lenB= sbB.length();
        //3.求最大字符串长度
        int maxLen=Math.max(lenA,lenB);
        //4.保证两字符串长度相同
        //4.1先反转字符串，方便使用
        sbA.reverse();
        sbB.reverse();
        //4.2补0，保证长度相同
        while (sbA.length()<maxLen){
            sbA.append('0');
        }
        while (sbB.length()<maxLen){
            sbB.append('0');
        }
        //5.计算结果
        int carry=0;//进位
        int num1,num2;
        StringBuilder ans=new StringBuilder();
        for (int i = 0; i <maxLen ; i++) {
            num1=sbA.charAt(i)-'0';
            num2=sbB.charAt(i)-'0';
            //5.1产生进位的情况
            if(carry+num1+num2>1){
                ans.append(carry+num1+num2-2);
                carry=1;
            }else {//5.2不存在进位的情况
                ans.append(carry+num1+num2);
                carry=0;
            }
        }
        //5.3考虑最高位，看是否还存在进位
        if(carry==1){
            ans.append(1);
        }

        //6.反转，转换为String类型
        return ans.reverse().toString();
    }
}
