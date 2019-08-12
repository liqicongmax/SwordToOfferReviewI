package niuke;

import java.util.Stack;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/7 9:12
 */
public class 二叉搜索树和双向链表 {
    /**
     * 二叉搜索树转双向链表
     * @param pRootOfTree
     * @return
     */
    public TreeNode Convert(TreeNode pRootOfTree) {
        TreeNode root=pRootOfTree;
        Stack<TreeNode> stack=new Stack<>();
        if(root==null){
            return null;
        }
        TreeNode start=null;
        while(!stack.isEmpty()||root!=null){
            while(root!=null){
                stack.push(root);
                root=root.right;
            }
            root=stack.pop();
            if(start==null){
                start=root;
            }else{
                start.left=root;
                root.right=start;
                start=root;
            }
            root=root.left;
        }
        return start;
    }
}
