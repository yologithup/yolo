package 线程安全;

import java.util.Objects;

/**
 * @author yolo
 * @date 2019/11/17-18:19
 * 实现循环队列
 * 可以建立两个等待集
 */
public class MyQueue {
    private int[]arr=new int[10];
    private int front=0;
    private int rear=0;
    private int size=0;
    private Objects full=new Objects();

    public synchronized void put(int message) throws InterruptedException {
        while(size==arr.length){
            wait();
        }
        arr[rear]=message;
        rear=(rear+1)%arr.length;
        size++;
        notifyAll();//从等等待集唤醒任意一个线程
    }
    public synchronized void take()throws InterruptedException{
        if(size==0){
            wait();
        }
        front=(front+1)%arr.length;
        size--;
        notifyAll();
    }
}
