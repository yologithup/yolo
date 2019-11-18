import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author yolo
 * @date 2019/11/17-14:18
 * 问题描述
 * 　　受大西线调水工程启发，小明也准备设计一条调水的水渠。
 * 　　小明经费有限，他只能在一块有限区域内建立一条简单的水渠。
 * 　　小明首先勘探了地形，在这块地中有一处水源，必须用作水渠的起点。另外，小明还测量了一些点，包括点的位置和高度。如果两个小明测量的点之间的距离不超过 d 且高度不同，小明就可以在这两点之间建立一段水渠，让水从高处流向低处，这一段的长度为两点之间的直线距离（即将横坐标的差的平方加上纵坐标的差的平方加上高度差的平方后再开平方根）。
 * 　　小明计划只修一条主水渠，不建立分支的水渠。由于水渠能影响的范围与水渠的长度正相关，小明希望水渠尽可能长。
 * 　　请注意，水渠必须从水源开始修，并且高度应当递减。水渠的不同段可能交叉（建个桥即可）。
 * 输入格式
 * 　　输入的第一行包含一个整数 n ，表示小明已经测量的点数。
 * 　　接下来 n 行，每行三个整数 x, y, h，分别表示测量的点坐标为 (x, y)，高度为 h。这部分的第一个点即为水源，第一个点的h值大于其他点的h值。
 * 　　接下来一行包含一个整数 d。
 * 输出格式
 * 　　输出一行，包含一个实数，四舍五入保留 2 位小数，表示水渠最长能修多长。
 * 样例输入
 * 5
 * 1 1 10
 * 2 3 8
 * 4 5 9
 * 1 2 5
 * 4 5 5
 * 8
 * 样例输出
 * 10.66
 * 样例说明
 * 　　在这些点中有两个坐标为 (4, 5) 的点，这是允许的。
 * 评测用例规模与约定
 * 　　对于 30% 的评测用例，1 <= n <= 10；
 * 　　对于 60% 的评测用例，1 <= n <= 20；
 * 　　对于所有评测用例，1 <= n <= 1000，0 <= h <= 10000，0 <= x, y <= 10000，0 < d < 1e7（10的7次方）。
 * JAVA
 *     }
 *
 *
 *
 * 问题描述
 * 　　小明有一块空地，他将这块空地划分为 n 行 m 列的小块，每行和每列的长度都为 1。
 * 　　小明选了其中的一些小块空地，种上了草，其他小块仍然保持是空地。
 * 　　这些草长得很快，每个月，草都会向外长出一些，如果一个小块种了草，则它将向自己的上、下、左、右四小块空地扩展，这四小块空地都将变为有草的小块。
 * 　　请告诉小明，k 个月后空地上哪些地方有草。
 * 输入格式
 * 　　输入的第一行包含两个整数 n, m。
 * 　　接下来 n 行，每行包含 m 个字母，表示初始的空地状态，字母之间没有空格。如果为小数点，表示为空地，如果字母为 g，表示种了草。
 * 　　接下来包含一个整数 k。
 * 输出格式
 * 　　输出 n 行，每行包含 m 个字母，表示 k 个月后空地的状态。如果为小数点，表示为空地，如果字母为 g，表示长了草。
 * 样例输入
 * 4 5
 * .g...
 * .....
 * ..g..
 * .....
 * 2
 * 样例输出
 * gggg.
 * gggg.
 * ggggg
 * .ggg.
 * 评测用例规模与约定
 * 　　对于 30% 的评测用例，2 <= n, m <= 20。
 * 　　对于 70% 的评测用例，2 <= n, m <= 100。
 * 　　对于所有评测用例，2 <= n, m <= 1000，1 <= k <= 1000。
 * JAVA
 */
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int[][]arr;
        int r=input.nextInt();
        int c=input.nextInt();
        arr=method(n,m);
        System.out.println(arr[r-1][c-1]);
    }

    private static int[][] method(int n, int m) {
        int[][]arr=new int[n][m];
        int up=0;
        int right=m-1;
        int down=n-1;
        int left=0;
        int i=1;
        while(i<=n*m){
            for(int col=left;col<=right;col++){
                arr[up][col]=i;
                i++;
            }
            up++;
            if(up>down){
                break;
            }
            for(int row=up;row<=down;row++){
                arr[row][right]=i;
                i++;
            }
            right--;
            if(right<left){
                break;
            }
            for(int col=right;col>=left;col--){
                arr[down][col]=i;
                i++;
            }
            down--;
            if(down<up){
                break;
            }
            for(int row=down;row>=up;row--){
                arr[left][row]=i;
                i++;
            }
            left++;
            if(left>right){
                break;
            }
        }
        return arr;
    }
}
