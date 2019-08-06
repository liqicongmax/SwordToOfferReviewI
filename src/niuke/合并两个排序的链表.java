package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/6 20:12
 */
public class 合并两个排序的链表 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode t=new ListNode();
        if(list1.val>list2.val){
            t=list2;
            list2=list2.next;
        }else {
            t=list1;
            list1= list1.next;
        }
        ListNode head=t;
        while(list1!=null&&list2!=null){
            if(list1.val>list2.val){
                t.next=list2;
                list2= list2.next;
                t=t.next;
            }else {
                t.next=list1;
                list1=list1.next;
                t=t.next;
            }
        }
        if(list1==null){
            t.next=list2;
        }else {
            t.next=list1;
        }
        return head;
    }
}
