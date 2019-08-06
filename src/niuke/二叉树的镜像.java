package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/6 20:24
 */
public class 二叉树的镜像 {
    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        while(root!=null){
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            Mirror(root.left);
            Mirror(root.right);
        }
    }
}
