import java.util.ArrayList;
import java.util.List;

/**
 * @author yolo
 * @date 2019/9/22-23:01
 */
public class TreeOrder {
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
        /**二叉树前序遍历
         * 汇总思想：
         *      根+左子树+右子树
         *      整棵树的结果=汇总（左子树+右子树）
         *
         */
        public static List<Character>preOrder3(Node root){
            if(root==null){
                return new ArrayList<>();
            }
            List<Character>left=preOrder3(root.left);
            List<Character>right=preOrder3(root.right);
            List<Character>result=new ArrayList<>();
            result.add(root.val);
            result.addAll(left);
            result.addAll(right);
            return result;
        }

        /**
         * 中序遍历-递归:
         * 遍历：
         * 左子树的中序遍历
         * 打印根
         * 右子树的中序遍历
         * @param
         */
        //遍历思想
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
       //汇总思想
        public static List<Character>inOrder3(Node root){
            if(root==null){
                return new ArrayList<>();
            }
            List<Character>left=inOrder3(root.left);
            List<Character>right=inOrder3(root.right);
            List<Character>result=new ArrayList<>();
            result.addAll(left);
            result.add(root.val);
            result.addAll(right);
            return result;
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
        //汇总思想
        public static List<Character>postOrder3(Node root){
            if(root==null){
                return new ArrayList<>();
            }
            List<Character>left=postOrder3(root.left);
            List<Character>right=postOrder3(root.right);
            List<Character>result=new ArrayList<>();
            result.addAll(left);
            result.addAll(right);
            result.add(root.val);
            return result;
        }

        /**
         * 遍历思想：
         *      一个结点加一次
         *      最后打印count
         *      每次调用前count必须清零
         * 汇总思想：
         *      根+左子树+右子树
         *      整棵树的结果=汇总（左子树+右子树）
         */
        //计算结点个数
        static int count=0;
        public static void getSize1(Node root){
            if(root==null){
                return;
            }
            count++;
            getSize1(root.left);
            getSize1(root.right);

        }
        public static int getSize2(Node root){
                if(root==null){
                    return 0;
                }
                int left=getSize2(root.left);
                int right=getSize2(root.right);
                return left+right+1;
        }
        //计算叶子结点个数

        /**
         * 计算叶子结点的个数
         * 1.遍历：
         * 2.汇总：
         * @return
         */
        //遍历：
        public static void getCount1(Node root){
            if(root==null){
                return ;
            }
            if(root.left==null&&root.right==null){
                count++;
            }
            else{
                getCount1(root.left);
                getCount1(root.right);
            }
        }
        //汇总：
        //root==null返回1
        //root.left==null&&root.left==null(root为叶子结点)返回1
        public static int getCount2(Node root){
            if(root==null){
                return 0;
            }
            if(root.left==null&&root.right==null){
                return 1;
            }
            int left=getCount2(root.left);
            int right=getCount2(root.right);
            return left+right;
        }
        //计算二叉树的高度---此题只能用汇总思想
        public static int getHeight(Node root){
                if(root==null){
                    return 0;
                }
                int left=getHeight(root.left);
                int right=getHeight(root.right);
                int max=Math.max(left,right);
                return max+1;
        }
        //计算第K层结点个数--k>=1
        //汇总解决更好
        public static int getKLevel(Node root,int k){
            if(root==null){
                return 0;
            }
            if(k==1){
                return 1;
            }
            int left=getKLevel(root.left,k-1);
            int right=getKLevel(root.right,k-1);
            return left+right;
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

    //此处private私有也可以，内部类
        //创建二叉树
        public static Node BulidTree(){
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
            System.out.println(preOrder3(root));
            list.clear();
            System.out.println(inOrder2(root));
            System.out.println(inOrder3(root));
            list.clear();
            System.out.println(postOrder2(root));
            System.out.println(postOrder3(root));
            System.out.println("结点个数："+getSize2(root));
            count=0;
            getCount1(root);
            System.out.println("叶子结点个数："+count);
            System.out.println("二叉树的高度："+getHeight(root));
            System.out.println("第k(4)层的结点个数："+getKLevel(root,4));
        }

    }

