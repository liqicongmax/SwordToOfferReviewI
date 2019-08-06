package niuke;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/6 18:35
 */
public class 重建二叉树 {
    /**
     * 前序中序重建二叉树
     * @param pre
     * @param in
     * @return
     */
    public TreeNode reConstructBinaryTree(int [] pre,int [] in){
        if(pre.length==0||in.length==0){
            return null;
        }
        TreeNode root=new TreeNode(pre[0]);
        for(int i=0;i<in.length;i++){
            if(pre[0]==in[i]){//找到这个头结点在中序遍历的位置,开始左右两边的递归
                root.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1), Arrays.copyOfRange(in,0,i));
                root.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return root;
    }

    /**
     * 中序后序重建二叉树
     * @param after
     * @param in
     * @return
     */
    public TreeNode reConstructTree(int[] in,int[] after){
        if(after.length==0||in.length==0){
            return null;
        }
        TreeNode root=new TreeNode(after[after.length-1]);
        for(int i=0;i<in.length;i++){
            if(after[after.length-1]==in[i]){
                root.left=reConstructTree(Arrays.copyOfRange(in,0,i),Arrays.copyOfRange(after,0,i));
                root.right=reConstructTree(Arrays.copyOfRange(in,i+1,in.length),Arrays.copyOfRange(after,i,after.length-1));//因为后序中头结点出现的位置在最后一个
            }
        }
        return root;
    }
}
