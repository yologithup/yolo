import java.util.*;

/**
 * @author yolo
 * @date 2019/10/17-19:12
 */
public class Practise01String {
    public static List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer>map=new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[]a=cpdomain.split(" ");
            int n=Integer.valueOf(a[0]);
            String domain=a[1];
            String[]domains=domain.split("\\.");
            for(int i=0;i<domains.length;i++){
              String[]c=Arrays.copyOfRange(domains,i,domains.length);
              //静态方法，通过类名调用
              String result=String.join(".",c);
              int oldCount=map.getOrDefault(result,0);
              map.put(result,oldCount+n);
            }
        }
        List<String>list=new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key=entry.getKey();
            int value=entry.getValue();
            String s=value+" "+key;
            list.add(s);
        }
        return list;
    }
    public static void main(String[] args) {
        String[]cpdomains={"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        System.out.println(subdomainVisits(cpdomains));
    }
}
