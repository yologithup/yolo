import java.io.IOException;

/**
 * @author yolo
 * @date 2019/10/20-19:36
 * 异常处理的第二种方式：自己处理异常
 * 格式：
 *  try{
 *      可能产生异常的代码
 *  }catch（定义一个异常的变量，用于接收try中抛出的异常）{
 *      异常的处理逻辑，产生异常对象后怎么处理
 *      一般在工作中，会把异常的信息记录到一个日记中
 *  }
 *  ...
 *  catch(异常类名 变量名){
 * }
 * 注意：
 * 1.try中可能抛出多个异常对象，那么久可以使用多个catch来处理异常对象
 * 2.如果try中产生啦异常，就会执行catch中的异常处理逻辑，执行完毕catch中的异常处理逻辑，继续执行tyr..catch 之后的代码
 *   如果没有出现异常，那么就不执行catch的异常处理逻辑，执行完try中的代码后，直接执行try..catch之后的代码
 *
 */
public class Demo04Exception {
    public static void main(String[] args) {
        try{//可能出现异常的代码
            readFile("d:\\a.tx");
        }catch (IOException e){//异常处理的逻辑代码
            //System.out.println("传递的文件后缀名不对");
            //System.out.println(e.getMessage());//文件名后缀不对
            //System.out.println(e.toString());//java.io.IOException: 文件名后缀不对
            e.printStackTrace();
            /*
            java.io.IOException: 文件名后缀不对
	        at Demo04Exception.readFile(Demo04Exception.java:42)
	        at Demo04Exception.main(Demo04Exception.java:26)
             */
        }
        System.out.println("后续代码");
    }

    /*
    如果传递的路径，不是.txt
    那么我们就抛出异常，告知调用者，文件名后缀不对
     */
    private static void readFile (String fileName) throws IOException {
        if(!fileName.endsWith(".txt")){
            throw  new IOException("文件名后缀不对");
        }
        System.out.println("路径没有问题");
    }
}
