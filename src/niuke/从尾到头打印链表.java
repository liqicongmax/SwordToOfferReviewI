package niuke;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/6 16:47
 */
public class 从尾到头打印链表 {
    ArrayList<Integer> list=new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        if(listNode==null){
            return list;
        }
        if(listNode!=null){
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }
}
