package 链表;

/**
 * @author yolo
 * @date 2019/11/27-22:08
 */
public class Main02 {
    public ListNode partition(ListNode pHead, int x) {
       ListNode small=new ListNode(0);
       ListNode large=new ListNode(0);
       ListNode smallHead=small;
       ListNode largeHaed=large;
       while (pHead!=null){
           ListNode temp=pHead.next;
           pHead.next=null;
           if(pHead.val<x){
               small.next=pHead;
               small=small.next;
           }else {
               large.next=pHead;
               large=large.next;
           }
           pHead=temp;
       }
       small.next=largeHaed.next;
       return smallHead;
    }
}
