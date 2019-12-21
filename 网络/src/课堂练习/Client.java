package 课堂练习;

import java.io.*;
import java.net.Socket;

/**
 * @author yolo
 * @date 2019/12/21-11:16
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",8888);

        InputStream is=socket.getInputStream();
        OutputStream os=socket.getOutputStream();

        Reader reader=new InputStreamReader(is,"UTF-8");
        BufferedReader bufferedReader=new BufferedReader(reader);
        Writer writer=new OutputStreamWriter(os,"UTF-8");
        PrintWriter printWriter=new PrintWriter(writer,false);
        String[] messages = {"早啊", "赶紧吃饭", "赶紧学习", "不要松懈"};
        for (String message : messages) {
            printWriter.println(message);
            printWriter.flush();

            String echoMessage = bufferedReader.readLine();
            System.out.println("对方有回复了: " + echoMessage);
        }

        socket.close();

    }
}
