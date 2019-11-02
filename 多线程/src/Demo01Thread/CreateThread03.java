package Demo01Thread;

/**
 * @author yolo
 * @date 2019/11/2-15:07
 */
public class CreateThread03  {
    static class  myThread1 extends Thread{
        @Override
        public void run() {
            double sum1=(1+1000000)/2.0;
            System.out.println("1+2+3....="+sum1);
        }
    }
    static class myThread2 extends Thread{
        @Override
        public void run() {
            long sum=0;
            for (int i = 0; i <100000 ; i=i+2) {
                sum+=i;
            }
            System.out.println("1+3+5+....="+sum);
        }
    }

    static class myThread3 extends Thread{
        @Override
        public void run() {

            long sum=0;
            for (int i = 0; i < 1000001; i++) {
                sum+=i*i;
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        myThread1 thread1=new myThread1();
        myThread2 thread2=new myThread2();
        myThread3 thread3=new myThread3();
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
