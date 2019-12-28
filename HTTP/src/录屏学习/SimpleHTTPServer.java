package 录屏学习;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author yolo
 * @date 2019/12/28-14:09
 */
public class SimpleHTTPServer {
    private static class Task implements Runnable {//将整个任务当作是一个Task对象
        private final Socket socket;//需要与客人进行对接，所以需要知道客人是谁，socket端口作为客人的标识

        Task(Socket socket) {
            this.socket = socket;
        }//构造方法

        @Override
        public void run() {//线程的run方法
            try {
                InputStream is = socket.getInputStream();//获取socket对象的输入流
                OutputStream os = socket.getOutputStream();//获取socket对象输出流
                // 解析请求
                Request request = Request.parse(is);//传入输入流（请求），对输入流进行解析--请求解析过程
                System.out.println(request);//输出解析后的请求

                //业务处理
                if(request.path.equalsIgnoreCase("/")){
                    String body = "<h1>成功</h1>";

                    byte[]bodyBufer=body.getBytes("UTF-8");
                    StringBuilder responder=new StringBuilder();
                    responder.append("HTTP/1.0 200 ok\r\n");//请求行
                    //请求头
                    responder.append("Content-Type: text/html; charset=UTF-8\r\n");
                    responder.append("Content-Length: "+body.length()+"\r\n");
                    responder.append("\r\n");

                    os.write(responder.toString().getBytes("UTF-8"));

                    os.write(bodyBufer);
                    os.flush();
                }
                socket.close();//关闭socket对象
            } catch (Exception e) {}
        }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(80);//1.ServerSocket(int port)：创建绑定到指定端口的服务器套接字。

        //2.static ExecutorService newFixedThreadPool(int nThreads)创建一个线程池，该线程池重用固定数量的从共享无界队列中运行的线程。
        ExecutorService pool = Executors.newFixedThreadPool(10);

        while (true) {
            Socket socket = serverSocket.accept();//3.获取socket对象
            //4.void execute(Runnable command)在将来的某个时间执行给定的命令。 该命令可以在一个新线程，一个合并的线程中或在调用线程中执行，由Executor实现。
            pool.execute(new Task(socket));
        }
    }
}

/**
 * 为什么要使用线程池
 *
 */