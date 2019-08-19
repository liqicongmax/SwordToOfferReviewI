package niuke;

import java.util.Stack;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/19 16:48
 */
public class 二叉搜索树的第k个节点 {
    TreeNode KthNode(TreeNode root, int k){
        if(root==null||k<1){
            return null;
        }
        Stack<TreeNode> stack=new Stack<>();
        int t=0;
        while(!stack.isEmpty()||root!=null){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            t++;
            if(t==k){
                return root;
            }
            root=root.right;
        }
        return null;
    }
}
