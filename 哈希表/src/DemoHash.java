/**
 * @author yolo
 * @date 2019/10/13-11:49
 * HashMap:
 *   1.内部数据结构是数组
 *   2.关键字经历变换（hash函数）得到int类型的值（哈希值key）
 *   3.int类型的hash
 *   哈希冲突（碰撞）：
 *      1.越少越好
 *      2.理论上哈希冲突不可能避免（数组容量n,要放的数据m----m>>n）
 *   避免哈希冲突：
 *      1.哈希函数的设计（尽可能让出来的下标均匀分布）
 *          尽可能多的用相应的值，使其更好的均匀
 *      2.负载因子的调节
 *          负载因子：哈希表中元素个数➗数组长度
 *          数据个数不可变，所以把数组的长度变大
 *          事先规定好一个阈值，来控制resize
 *   当哈希冲突时应该如何处理：
 *      1.线性探测法
 *      2.二次（二次方）探测法
 *      3.拉链发
 *
 *
 *    查找成功的平均查找速度：（即查找哈希表中元所有素次数之和➗哈希表元素个数）
 *    查找失败的平均查找速度：（即查找所有不存在于哈希表中的元素次数之和➗数组长度）
 *
 */

public class DemoHash {

    class SetNode {
        int key;
        SetNode next;

        public SetNode(int key) {
            this.key = key;
        }
    }
    class MapNode{
        int key;
        int val;
        MapNode next;

        public MapNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    private SetNode[]arr;
    private int size;//当前数据个数
    //纯key
    public boolean add(int key){
        SetNode node=new SetNode(key);
        int index=key/arr.length;
        SetNode head=arr[index];
        if(head==null){
            head=node;
        }
        SetNode cur=head;
        SetNode pre=null;
        while(cur!=null){
            if(cur.key!=key){
                pre=cur;
                cur=cur.next;
            }
            else
                break;
        }
        if(cur==null){
            pre.next=node;
        }
        else {
            return false;
        }
        return true;
    }
}
