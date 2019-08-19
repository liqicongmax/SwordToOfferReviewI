package niuke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/19 16:36
 */
public class 按之字型打印二叉树 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode root){
        ArrayList<Integer> temp=new ArrayList<>();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int reverse=1;
        int len=1;
        int start=0;
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            temp.add(node.val);
            start++;
            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                queue.offer(node.right);
            }
            if(start==len){
                len=queue.size();
                if(reverse==-1){
                    Collections.reverse(temp);
                }
                list.add(temp);
                temp=new ArrayList<>();
                start=0;
                reverse*=-1;
            }
        }
        return list;
    }
}
