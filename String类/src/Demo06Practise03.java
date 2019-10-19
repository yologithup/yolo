import java.util.*;

/**
 * @author yolo
 * @date 2019/10/19-10:08
 * 题目：一个网站域名，如"discuss.leetcode.com"，包含了多个子域名。作为顶级域名，常用的有"com"，下一级则有"leetcode.com"，最低的一级为"discuss.leetcode.com"。当我们访问域名"discuss.leetcode.com"时，也同时访问了其父域名"leetcode.com"以及顶级域名 "com"。
 *
 * 给定一个带访问次数和域名的组合，要求分别计算每个域名被访问的次数。其格式为访问次数+空格+地址，例如："9001 discuss.leetcode.com"。
 *
 * 接下来会给出一组访问次数和域名组合的列表cpdomains 。要求解析出所有域名的访问次数，输出格式和输入格式相同，不限定先后顺序。
 * 输入:
 * ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
 * 输出:
 * ["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]
 * 说明:
 * 按照假设，会访问"google.mail.com" 900次，"yahoo.com" 50次，"intel.mail.com" 1次，"wiki.org" 5次。
 * 而对于父域名，会访问"mail.com" 900+1 = 901次，"com" 900 + 50 + 1 = 951次，和 "org" 5 次。
 * 分析：
    *1.遍历将数组的每个元素以空格为依据进行第一次分割：
        * public String[] split(String regex):按照参数的规则，将字符串切割为若干个
    *2.遍历第一次分割好的字符串数组：
        * 0下标处是次数（字符串类型）---需要转化为int型：int n=Integer.valueOf(a[0]);
        * 1下标处是字符串 ：
            *需要再次以 . 为标志进行切割
            *遍历第二次切割好的字符串数组，进行按题目要求进行合并
            *已合并的字符串作为key,次数n作为value向Map集合做添加运算
    *3.遍历Map集合，得到键值对
        *getKey()得到键
        *getValue()得到值
        *拼接值与键，将的得到的新字符串添加到List集合中
        *返回List集合
    *4.调用函数，打印List集合
 *
 */
public class Demo06Practise03 {
    public static List<String> subdomainVisits(String[] cpdomains){
        Map<String,Integer>map=new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[]a=cpdomain.split(" ");
            int n=Integer.valueOf(a[0]);
            String []domain=a[1].split("\\.");
            for(int i=0;i<domain.length;i++){
                String[]b= Arrays.copyOfRange(domain,i,domain.length);
                String result=String.join(".",b);
                int oldCount=map.getOrDefault(result,0);
                map.put(result,oldCount+n);
            }
        }
        List<String> list=new LinkedList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String result=entry.getKey();
            int count=entry.getValue();
            String s=count+" "+result;
            list.add(s);
        }
        return list;
    }

    public static void main(String[] args) {
        String[]str1={"9001 discuss.leetcode.com"};
        List<String> result1=subdomainVisits(str1);
        System.out.println(result1);
        String[]str2={"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String>result2=subdomainVisits(str2);
        System.out.println(result2);
    }
}
