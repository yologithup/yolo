package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
 * @author yolo
 * @date 2019/10/31-21:00
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 相当于二叉树的广度优先遍历
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
