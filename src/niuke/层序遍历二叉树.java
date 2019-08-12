package niuke;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/6 21:46
 */
public class 层序遍历二叉树 {
    public ArrayList<ArrayList<Integer>> breadthFirstTraversal(TreeNode root){
        ArrayList<Integer> temp=new ArrayList<>();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int length=1;
        int count=0;
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            temp.add(node.val);
            count++;

            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                queue.offer(node.right);
            }
            if(count==length){
                list.add(temp);
                temp=new ArrayList<>();
                length= queue.size();
                count=0;
            }
        }
        return list;
    }
}
