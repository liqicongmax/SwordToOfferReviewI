package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/6 20:01
 */
public class 链表倒数第K个节点 {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode t1 = head;
        ListNode t2 = head;
        for (int i = 0; i < k; i++) {
            if (t1 == null) {
                return null;
            }
            t1 = t1.next;

        }
        while (t1 != null) {
            t1 = t1.next;
            t2 = t2.next;
        }
        return t2;
    }

}
