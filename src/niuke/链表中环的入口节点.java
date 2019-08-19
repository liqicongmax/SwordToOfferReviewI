package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/19 13:40
 */
public class 链表中环的入口节点 {
    /**
     * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
     * @param pHead 链表起点
     * @return
     */

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode p1=pHead;
        ListNode p2=pHead;
        while(p1!=null&&p2.next!=null){
            p1=p1.next;
            p2=p2.next.next;
            if(p1==p2){
                //找到环节点
                int len=1;
                int val=p1.val;
                while(true){
                    p1=p1.next;
                    if(p1.val==val){
                        break;
                    }
                    len++;
                }
                p1=pHead;
                p2=pHead;
                while (len>0){
                    p1=p1.next;
                    len--;
                }
                while(p1!=p2){
                    p1=p1.next;
                    p2=p2.next;
                }
                return p1;
            }
        }

        return null;
    }
}
