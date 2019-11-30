package 链表;

/**
 * @author yolo
 * @date 2019/11/29-23:49
 */
public class Main03 {
    public static void main(String[] args) {
       ListNode node1=new ListNode(0);
       ListNode node2=new ListNode(1);
       ListNode node3=new ListNode(1);
       node1.next=node2;
       node2.next=node3;
       ListNode node4=new ListNode(0);
        System.out.println(plusAB(node1,node4));
    }
    public static ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        int index1=0;
        int index2=0;
        int num1=0;
        int num2=0;
       while(a!=null) {
           num1+=Math.pow(10,index1)*a.val;
           a=a.next;
           index1++;
       }
        while(b!=null) {
            num2+=Math.pow(10,index2)*b.val;
            b=b.next;
            index2++;
        }
        int sum=num1+num2;
        ListNode list=new ListNode(0);
        ListNode head=list;
        while(sum!=0){
            list.next=new ListNode(sum%10);
            list=list.next;
            sum=sum/10;
        }
        return head.next;
    }
}
