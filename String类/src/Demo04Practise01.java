/**
 * @author yolo
 * @date 2019/10/18-20:45
 * 题目：
 *  定义一个方法，把数组{1，2，3}按指定格式拼接成一个字符串》格式如下[word1#word2#word3]
 * 分析：
 *  1.首先准备一个int[]数组，内容是1，2，3
 *  2.定义一个方法，用来将数组变成新字符串
 *      三要素：
 *          返回值：String
 *          方法名：formArrayToString
 *          参数列表：int[]
 *  3.格式：[word1#word2#word3]
 *      1.for循环
 *      2.字符串拼接：+ / concat（）--两种任选其一
 *      3.前有word，分割使用的是#，但需要区分是不是最后一个
 *  4.调用方法：得到返回值，并且打印
 */
public class Demo04Practise01{
    public static void main(String[] args) {
        int[] array={1,2,3};
        String result=formArrayToString(array);
        System.out.println(result);
    }

    private static String formArrayToString(int[] array) {
        String str="[";
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                str+=array[i]+"word"+"]";
            }else{
                str+=array[i]+"word"+"#";
            }
        }
        return str;
    }
}
