import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.Color.BLUE;
import static org.fusesource.jansi.Ansi.Color.GREEN;
import static org.fusesource.jansi.Ansi.ansi;

/**
 * @author yolo
 * @date 2020/1/5-11:43
 */
public class Main {
    public static void main(String[] args) {
        AnsiConsole.systemInstall();
        //设置中断得背景颜色
        System.out.println(ansi().fg(BLUE).bg(GREEN).a("选项").reset());
        System.out.println(ansi().fg(BLUE).bg(GREEN).a("1.进入").reset());
        System.out.println(ansi().fg(BLUE).bg(GREEN).a("2.退出").reset());
        System.out.println(ansi().fg(BLUE).bg(GREEN).a("3.警告").reset());
    }
}
