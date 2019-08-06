package niuke;

import java.util.Stack;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/6 20:57
 */
public class 栈的压入和弹出序列 {
    public boolean IsPopOrder(int [] pushA,int [] popA){
        if(pushA.length==0||popA.length==0||pushA.length!=popA.length){
            return false;
        }
        Stack<Integer> stack=new Stack<>();
        int index=0;
        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while(!stack.isEmpty()&&popA[index]==stack.peek()){
                stack.pop();
                ++index;
            }
        }
        return stack.isEmpty();
    }
}
