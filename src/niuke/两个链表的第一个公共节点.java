package niuke;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/13 10:51
 */
public class 两个链表的第一个公共节点 {
    public ListNode FindFirstCommonNode(ListNode node1, ListNode node2){
        int len1=getLength(node1);
        int len2=getLength(node2);
        if(len1>len2){
            for(int i=0;i<len1-len2;i++){
                node1=node1.next;
            }
        }else{
            for(int i=0;i<len2-len1;i++){
                node2=node2.next;
            }
        }
        while(node1!=null&&node2!=null){
            if(node1==node2){
                return node1;
            }
            node1=node1.next;
            node2=node2.next;
        }
        return null;
    }

    private int getLength(ListNode node){
        int count=0;
        while(node!=null){
            count++;
            node=node.next;
        }
        return count;
    }
}
