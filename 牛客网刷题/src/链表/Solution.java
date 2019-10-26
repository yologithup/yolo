package 链表;

import java.util.ArrayList;

/**
 * @author yolo
 * @date 2019/10/26-21:21
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
  class ListNode {
      int val;
      ListNode next = null;
      ListNode(int val) {
          this.val = val;
      }
  }
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> temp=new ArrayList<>();
        ListNode cur=listNode;
        while (cur!=null){
            temp.add(cur.val);
            cur=cur.next;
        }
        int index=temp.size()-1;
        ArrayList<Integer>result=new ArrayList<>();
        while(index>=0){
            result.add(temp.get(index));
            index--;
        }
        return result;
    }
}
