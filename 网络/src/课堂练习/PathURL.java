package 课堂练习;

import org.omg.CORBA.ARG_OUT;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yolo
 * @date 2019/12/21-12:02
 */
public class PathURL {
    public static void main(String[] args) {
        String url="https://www.baidu.com/?tn=80035161_1_dg";
        List<String>list=new ArrayList<>();
        int index;
        index=url.indexOf("://");
        list.add(url.substring(0,index));
        url= url.substring(index+3);
        index=url.indexOf('/');
        list.add(url.substring(0,index));
        url=url.substring(index+1);
        index=url.indexOf("?");
        list.add(url.substring(0,index));
        list.add(url.substring(index+1));
        System.out.println(list);
    }
}
