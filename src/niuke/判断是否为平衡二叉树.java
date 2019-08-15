package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/15 16:37
 */
public class 判断是否为平衡二叉树 {
    /**
     * 品
     * @param root
     * @return
     */
    public boolean IsBalanced_Solution(TreeNode root){
        if(root==null){
            return true;
        }
        return maxDepth(root)!=-1;
    }
    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=maxDepth(root.left);
        if(left==-1){
            return -1;
        }
        int right=maxDepth(root.right);
        if(right==-1){
            return -1;
        }
        return Math.abs(left-right)>1?-1:Math.max(left,right)+1;
    }
}
