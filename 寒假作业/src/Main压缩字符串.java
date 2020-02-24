/**
 * @author yolo
 * @date 2020/2/7-21:55
 */
public class Main压缩字符串 {
    public static void main(String[] args) {
        char[]chars={'a','a','b','b','c','c','c'};
        compress(chars);
    }
    public static int compress(char[] chars) {
        int len=0;
        int value;
        int tempIndex;
        int i=0;
        while(i<chars.length){
            i=len;
            if(i<chars.length){
                char c=chars[i];
                chars[len++]=c;
                value=1;
                tempIndex=i+1;
                while(tempIndex<chars.length&&c==chars[tempIndex]){
                    value++;
                    tempIndex++;
                }
                if(value>1){
                    StringBuilder nums=new StringBuilder();
                    while (value>0){
                        int num=value%10;
                        nums.append(num);
                        value/=10;
                    }
                    for (int j = nums.length()-1; j >=0; j--) {
                        chars[len++]=nums.charAt(j);
                    }
                }
            }
        }
        return len;
    }
}
