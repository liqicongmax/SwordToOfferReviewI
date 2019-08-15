package niuke;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/15 16:20
 */
public class 二叉树的深度 {
    public int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int len=1;
        int start=0;
        int count=0;
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            start++;
            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                queue.offer(node.right);
            }
            if(start==len){
                len=queue.size();
                start=0;
                count++;
            }
        }
        return count;
    }
}
