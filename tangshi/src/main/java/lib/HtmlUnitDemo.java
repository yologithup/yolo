package lib;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author yolo
 * @date 2020/1/5-16:52
 */
public class HtmlUnitDemo {
    public static void main(String[] args) throws IOException {
//        WebClient webClient=new WebClient(BrowserVersion.CHROME);
//        //关闭了浏览器的js执行引擎，不再执行网页中的js脚本
//        webClient.getOptions().setJavaScriptEnabled(false);
//        //关闭了浏览器的css执行引擎，不再执行网页中的css布局
//        webClient.getOptions().setCssEnabled(false);
//        HtmlPage page = webClient.getPage("https://so.gushiwen.org/gushi/tangshi.aspx");
//        System.out.println(page);
//        page.save(new File("唐诗三百首\\PageDemo1.html"));

        //关闭界面的浏览器（HTTP客户端）
        //WebClient:用于从特定的URI中请求文件
        WebClient webClient=new WebClient(BrowserVersion.CHROME);
        //关闭了浏览器的js执行引擎，不再执行网页中的js脚本
        webClient.getOptions().setJavaScriptEnabled(false);
        //关闭了浏览器的css执行引擎，不再执行网页中的css布局
        webClient.getOptions().setCssEnabled(false);
        HtmlPage page = webClient.getPage("https://so.gushiwen.org/gushi/tangshi.aspx");
        System.out.println(page);
        File file=new File("唐诗三百首\\PageDemo1.html");
        file.delete();
        page.save(file);

        //如何从html中提取我们需要的信息
        HtmlElement body=page.getBody();

        List<HtmlElement>elements=body.getElementsByAttribute(
                "div",
                "class",
                "typecont"
        );

        HtmlElement divElement=elements.get(0);
        List<HtmlElement>aElements=divElement.getElementsByAttribute("a","target","_blank");
        for (HtmlElement e : aElements) {
            System.out.println(e);
        }
        System.out.println(aElements.size());
        System.out.println(aElements.get(0).getAttribute("href"));
    }
}
