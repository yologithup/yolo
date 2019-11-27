package 链表;

/**
 * @author yolo
 * @date 2019/11/27-22:08
 * 题目描述
 * 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
 *
 * 给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。
 * 注意：分割以后保持原来的数据顺序不变。
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
       return smallHead.next;
    }
}
