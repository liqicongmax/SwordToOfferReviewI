package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/19 16:24
 */
public class 对称的二叉树 {
    /**
     * @param root
     * @return
     */
    boolean isSymmetrical(TreeNode root) {
        if (root == null) {
            return true;
        }
        return check(root.left, root.right);
    }

    boolean check(TreeNode node1, TreeNode node2) {
        if (node1 == null) {
            return node2 == null;
        }
        if (node2 == null) {
            return false;
        }
        if (node1.val != node2.val) {
            return false;
        }
        return check(node1.left, node2.right) && check(node1.right, node2.left);
    }
}
