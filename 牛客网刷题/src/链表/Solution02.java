package 链表;

/**
 * @author yolo
 * @date 2019/10/28-21:05
 * 反转链表
 */
public class Solution02 {
    public ListNode ReverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode cur=head;
        ListNode result=null;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=result;
            result=cur;
            cur=temp;
        }
        return result;
    }
}
