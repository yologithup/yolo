import java.util.ArrayList;
import java.util.List;

public class TreeSearch {
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
        //递归找条件：一定在形参里找
        /**
         * 前序遍历-递归
         *打印根
         *左子树的前序遍历
         *右子树的前序遍历
         *右子树的前序遍历
         */
        public static void preOrder1(Node root){
            if(root==null){
                return;
            }
            System.out.println(root);
            preOrder1(root.left);
            preOrder1(root.right);
        }
        //所有的记录均不能在递归的函数体里,q且每次调用前必须清空
        public static List<Character> list=new ArrayList<>();
        public static List<Character>preOrder2(Node root){
            if(root==null){
                return list;
            }
            list.add(root.val);
            preOrder2(root.left);
            preOrder2(root.right);
            return list;
        }

        /**
         * 中序遍历-递归
         * 左子树的中序遍历
         * 打印跟
         * 右子树的中序遍历
         * @param
         */
        public static void inOrder1(Node root){
            if(root==null){
                return;
            }
            inOrder1(root.left);
            System.out.println(root);
            inOrder1(root.right);
        }
        public static List<Character>inOrder2(Node root){
            if(root==null){
                return list;
            }
            inOrder2(root.left);
            list.add(root.val);
            inOrder2(root.right);
            return list;
        }
        /**
         * 后序遍历-递归
         * 左子树的右子树的前序遍历
         * 右子树的后序遍历
         * 打印根节点
         * @param root
         */
        public static void postOrder1(Node root){
            if(root==null){
                return;
            }
            postOrder1(root.left);
            postOrder1(root.right);
            System.out.println(root);
        }
        public static List<Character>postOrder2(Node root){
            if(root==null){
                return null;
            }
            postOrder2(root.left);
            postOrder2(root.right);
            list.add(root.val);
            return list;

        }
        //计算结点个数

        /**
         * 遍历思想
         * 一个结点加一次
         * 最后打印count
         * 每次调用前count必须清零
         */
        static int count=0;
        public static void getSize1(Node root){
            if(root==null){
                return;
            }
            count++;
            getSize1(root.left);
            getSize1(root.right);

        }
        public static Node BulidTree(){//此处private私有也可以，内部类
            Node a=new Node('a');Node b=new Node('b');
            Node c=new Node('c');Node d=new Node('d');
            Node e=new Node('e');Node f=new Node('f');
            Node g=new Node('g');Node h=new Node('h');
            a.left=b;b.left=d;b.right=e;
            e.right=h;a.right=c;c.left=f;c.right=g;
            return a;
        }
        public static void main(String[] args) {
            Node root=BulidTree();
            list.clear();
            System.out.println(preOrder2(root));
            list.clear();
            System.out.println(inOrder2(root));
            list.clear();
            System.out.println(postOrder2(root));
        }

    }

