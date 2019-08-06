package niuke;

import java.util.Stack;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/6 18:53
 */
public class 两个栈实现一个队列 {
    /**
     * 栈先进后出,队列先进先出
     */
    Stack<Integer> stack1 = new Stack<Integer>();//用来保存值
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        if(stack1.isEmpty()) {
            stack1.push(node);
        }
    }

    public int pop() {
        if(stack1.isEmpty()&&stack2.isEmpty()){
            return -1;
        }
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
