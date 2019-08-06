package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/6 20:05
 */
public class 反转链表 {
    /**
     * 反转链表输出表头
     * @param root
     * @return
     */
    public ListNode ReverseList(ListNode root){
        if(root==null){
            return null;
        }
        ListNode cur=root;
        ListNode pre=null;
        while(cur!=null){
            ListNode temp=cur.next;
            if(cur.next==null){
                cur.next=pre;
                return cur;
            }
            cur.next=pre;//先把cur的下个节点指定到pre
            pre=cur;//更新pre节点,作为下次使用
            cur=temp;//还原cur节点的位置
        }
        return null;
    }
}
