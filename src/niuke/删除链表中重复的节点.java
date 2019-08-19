package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/19 14:18
 */
public class 删除链表中重复的节点 {
    /**
     * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
     *
     * @param root
     * @return
     */
    public ListNode deleteDuplication(ListNode root) {
        if (root == null) {
            return null;
        }
        ListNode cur = root;
        ListNode pre = null;
        while (cur!=null&&cur.next != null) {
            while (cur.next != null && cur.val != cur.next.val) {
                pre = cur;
                cur = cur.next;
            }
            while(cur!=null&&cur.next!=null&&cur.val==cur.next.val){
                int val=cur.val;
                if(cur.val==root.val){
                    while(cur!=null&&cur.val==val){
                        cur=cur.next;
                        root=root.next;
                    }
                }else{
                    while(cur!=null&&val==cur.val){
                        cur=cur.next;
                    }
                    pre.next=cur;
                }
            }
        }
        return root;
    }
}