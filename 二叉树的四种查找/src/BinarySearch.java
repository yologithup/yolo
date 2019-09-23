/**
 * @author yolo
 * @date 2019/9/23-21:34
 *
 *      * 二叉树的四种查找
 *      *      1.查找val所在的结点,没有找到返回null
 *      *      按照根--左子树--右子树的顺序进行查找
 *      *      （1）返回是否找到--true/false
 *      *      （2）返回结点--node/null
 *      *      2.查找node结点，找打同一个返回true，没找到返回false
 *      *      3.判断tree2是否为tree1的子树（利用两个树相同的原理）
 *      * @return
 *
 */

public class BinarySearch {
    private static class Node{
        private char val;
        private Node left=null;
        private Node right=null;
        private Node(char val){
            this.val=val;
        }

        @Override
        public String toString() {
            return String.format("%c",val);
        }
    }

    //查找val所在的结点--返回结点
    public static Node find1(Node root,int val){
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        Node left=find1(root.left,val);
        //先去左子树找，没找到直接返回，让右子树直接去找，不用判断它是否找到
        if(left!=null){
            return left;
        }
        return find1(root.right,val);
    }
    //查找val--返回true/false
    public static boolean find2(Node root,int val){
        if(root==null){
            return false;
        }
        if(root.val==val){
            return true;
        }
        boolean left=find2(root.left,val);
        if(left!=false){
            return true;
        }

        boolean right=find2(root.right,val);
        if(right==true){
            return true;
        }
        return find2(root.right,val);

    }
    //查找node结点--返回true/false
    public static boolean find3(Node root,Node node){
        if(root==null){
            return false;
        }
        if(root==node){
            return true;
        }
        boolean left=find3(root.left,node);
        if(left!=false){
            return true;
        }
        return find3(root.right,node);
    }
    public static boolean find4(Node tree1,Node tree2){
        if(tree1==null){
            return false;
        }
        if(isSame(tree1,tree2)){
            return true;
        }
        if(find4(tree1.left,tree2)){
            return true;
        }
        return find4(tree1.right,tree2);
    }

    private static boolean isSame(Node tree1, Node tree2) {
        if(tree1==null||tree2==null){
            return true;
        }
        if(tree1==null||tree2==null){
            return false;
        }
        return tree1.val==tree2.val
                &&isSame(tree1.left,tree2.left)
                &&isSame(tree1.right,tree2.right);
    }

}
