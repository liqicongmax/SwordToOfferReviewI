package niuke;

import java.util.Stack;

/**
 * @author liqicong@myhexin.com
 * @date 2019/8/6 20:42
 */
public class 包含min函数的栈 {
    Stack<Integer> stack=new Stack<>();
    int min=Integer.MIN_VALUE;
    public void push(int node) {
        if(stack.isEmpty()){
            min=node;
        }
        stack.push(node);
        if(node<min){
            min=node;
        }
    }

    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        if(stack.peek()!=min){
            stack.pop();
        }else {
            //重新计算min值
            stack.pop();
            Stack<Integer> temp=stack;
            int newmin=temp.pop();
            while(!temp.isEmpty()){
                int cur=temp.pop();
                if(newmin>cur){
                    newmin=cur;
                }
            }
            min=newmin;
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min;
    }
}
