package 第二次;

/**
 * @author yolo
 * @date 2019/12/1-9:35
 * 合并两个有序链表
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * public class ListNode {
 *      int val;
 *      ListNode next;
 *      ListNode(int x) { val = x; }
 *  }
 */
public class Main02 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode result=new ListNode(0);
        ListNode head=result;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                ListNode temp=new ListNode(list1.val);
                result.next=temp;
                list1=list1.next;
            }else {
                ListNode temp=new ListNode(list2.val);
                result.next=temp;
                list2=list2.next;
            }
            result=result.next;
        }
        if(list1==null){
            result.next=list2;
        }
        if(list2==null){
            result.next=list1;
        }
        return head.next;
    }
}
