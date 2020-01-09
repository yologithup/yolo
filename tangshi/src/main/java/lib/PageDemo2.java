package lib;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomText;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;

/**
 * @author yolo
 * @date 2020/1/7-19:11
 */
public class PageDemo2 {
    public static void main(String[] args) throws IOException {
        try (WebClient webClient = new WebClient(BrowserVersion.CHROME)) {
            webClient.getOptions().setCssEnabled(false);
            webClient.getOptions().setJavaScriptEnabled(false);

            String url = "https://so.gushiwen.org/shiwenv_45c396367f59.aspx";
            HtmlPage page = webClient.getPage(url);
            HtmlElement body = page.getBody();
            /*
            List<HtmlElement> elements = body.getElementsByAttribute(
                    "div",
                    "class",
                    "contson"
            );

            for (HtmlElement element : elements) {
                System.out.println(element);
            }

            System.out.println(elements.get(0).getTextContent().trim());
             */

            // ����
            {
                String xpath = "//div[@class='cont']/h1/text()";
                Object o = body.getByXPath(xpath).get(0);DomText domText = (DomText)o;
                System.out.println(domText.asText());
            }
            {
                String xpath = "//div[@class='cont']/p[@class='source']/a[1]/text()";
                Object o = body.getByXPath(xpath).get(0);
                DomText domText = (DomText)o;
                System.out.println(domText.asText());
            }
            {
                String xpath = "//div[@class='cont']/p[@class='source']/a[2]/text()";
                Object o = body.getByXPath(xpath).get(0);DomText domText = (DomText)o;
                System.out.println(domText.asText());
            }
            {
                String xpath = "//div[@class='cont']/div[@class='contson']";
                Object o = body.getByXPath(xpath).get(0);
                HtmlElement element = (HtmlElement)o;
                System.out.println(element.getTextContent().trim());
            }
        }
    }
}
