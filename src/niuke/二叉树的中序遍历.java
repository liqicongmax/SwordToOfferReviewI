package niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/6 21:55
 */
public class 二叉树的中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Stack<TreeNode> stack=new Stack<>();
        while(!stack.isEmpty()||root!=null){
            while(root!=null){//先用一个栈倒着存从根节点到最左的节点
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            list.add(root.val);
            root=root.right;
        }
        return  list;
    }
}
