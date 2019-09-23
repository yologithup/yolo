/**
 * @author yolo
 * @date 2019/9/23-21:29
 */
public class BiinaryTree {
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

}
