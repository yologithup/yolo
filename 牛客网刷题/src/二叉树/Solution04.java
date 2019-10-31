package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
 * @author yolo
 * @date 2019/10/31-21:00
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 相当于二叉树的广度优先遍历
 * 链接：https://www.nowcoder.com/questionTerminal/7fe2212963db4790b57431d9ed259701?answerType=1&f=discussion
 * 来源：牛客网
 *
 * 每一次打印一个节点的时候，如果该节点有子节点，则把该节点的子节点放到一个队列的尾部
 * 接下来到对队列的头部取出最早进入队列的节点放到ArrayList 中
 * 重复前面的操作，直至队列中所有的节点都存到ArrayList中。
 */
public class Solution04 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer>list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
       while(!queue.isEmpty()){
           TreeNode temp=queue.remove();
           if(temp==null){
               continue;
           }
           list.add(temp.val);
           queue.add(temp.left);
           queue.add(temp.right);
       }
        return list;
    }
}
