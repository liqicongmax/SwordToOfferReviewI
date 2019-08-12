package niuke;

import java.util.ArrayList;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/7 8:51
 */
public class 二叉树中和为某一值的路径 {
    /**
     * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
     * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
     * (注意: 在返回值的list中，数组长度大的数组靠前)
     * @param root
     * @param target
     * @return
     */
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target){
        ArrayList<Integer> temp=new ArrayList<>();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        temp.add(root.val);
        target-=root.val;
        if(target==0&&root.left==null&&root.right==null){
            list.add(new ArrayList<>(temp));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        temp.remove(temp.size()-1);
        return list;
    }
}
