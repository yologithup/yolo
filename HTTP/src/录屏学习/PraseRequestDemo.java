package 录屏学习;

/**
 * @author yolo
 * @date 2019/12/28-15:18
 */
public class PraseRequestDemo {
    public static void main(String[] args) {
        StringBuilder request=new StringBuilder();
        request.append("GET / HTTP/1.1\r\n");
        request.append("Host: 127.0.0.1\r\n");
        request.append("Accept: test/html\r\n");
        request.append("X-Teacher: peixinchen\r\n");
        request.append("\r\n");

        //方法String，路径String，版本String
        //请求头Map<String,String>
        String req=request.toString();
        int i=req.indexOf("\r\n");
        String requestLine=req.substring(0,i);
        String[] group = requestLine.split(" ");
        System.out.println(group[0]);
        System.out.println(group[1]);
        System.out.println(group[2]);

        while(true){
            int j=req.indexOf("\r\n",i+2);//indexOf(String str, int fromIndex)返回指定子串的第一次出现的字符串中的索引，从指定的索引开始。
            String line=req.substring(i+2,j);
            if(line.isEmpty()){
                break;
            }
            System.out.println(line);
            String[]kv=line.split(":");
            System.out.println("|"+kv[0].trim()+"|");
            System.out.println("|"+kv[1].trim()+"|");
            i=j;
        }
    }
}
