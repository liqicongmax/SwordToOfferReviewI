package niuke;

import java.util.Stack;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/20 11:07
 */
public class 机器人的运动范围 {
    /**
     * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
     * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
     * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
     * @param threshold 能走的最多的格数的数位和
     * @param rows 行
     * @param cols 列
     * @return 能到达的格子数
     */
    public static int movingCount(int threshold, int rows, int cols){
        if(threshold<0){
            return 0;
        }
        int[][] next={{0,1,0,-1},{1,0,-1,0}
        };//上下左右的移动方向
        boolean[] checked=new boolean[rows*cols];
        Stack<Integer> stack=new Stack<>();
        checked[0]=true;
        int count=0;
        stack.push(0);
        while(!stack.isEmpty()){
            int now=stack.pop();
            count++;
            for(int i=0;i<4;i++){
                int x=now%cols+next[0][i];
                int y=now/cols+next[1][i];
                int sum=cal(x)+cal(y);
                if(x>=0&&x<cols&&y>=0&&y<rows&&sum<threshold&&!checked[x+y*cols]){
                    stack.push(x+y*cols);
                    checked[x+y*cols]=true;
                }
            }
        }
        return count;
    }

    public static int cal(int x){
        int count=0;
        while(x>0){
            int temp=x-x/10*10;
            x=x/10;
            count+=temp;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(cal(3234));
    }

}
