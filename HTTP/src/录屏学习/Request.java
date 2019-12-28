package 录屏学习;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/12/28-14:17
 */
public class Request {
    //（请求行）成员变量：方法，url,版本，
    String method;
    String path;
    String version;
    Map<String, String> headers = new HashMap<>();//请求头<key:value>

    public static Request parse(InputStream is) {
        Request request = new Request();
        Scanner scanner = new Scanner(is, "UTF-8");//is是字节流不方便读，字节流转字符流都必须进行解码
                                                                //Scanner(InputStream source, String charsetName)构造一个新的 Scanner ，产生从指定输入流扫描的值。

        // 1.解析请求行，执行请求行解析方法
        parseRequestLine(request, scanner.nextLine());
        // 2.解析请求头直到空行
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {//如果不是空行，继续对请求头进行解析。
            String[] group = line.split(":");//
            String key = group[0].trim();//trim（）去掉左右两边多余的空格
            String value = group[1].trim();
            request.headers.put(key, value);
        }
        // 解析正文（忽略）

        return request;
    }

    private static void parseRequestLine(Request request, String line) {//
        String[] group = line.split(" ");
        request.method = group[0];
        request.path = group[1];
        request.version = group[2];
    }

    @Override
    public String toString() {//覆写toString方法
        return "Request{" +
                "method='" + method + '\'' +
                ", path='" + path + '\'' +
                ", version='" + version + '\'' +
                ", headers=" + headers +
                '}';
    }
}
