package offer;

import java.util.Stack;

/*
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 * 
 * */
public class StackQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>(); 
    public void push(int node) {
    	stack1.add(node); 
    }
    public int pop() throws Exception {
    	if(stack1.isEmpty()&& stack2.isEmpty()) {
    		throw new Exception("Queue is Empty"); 
    	}else if(stack2.isEmpty()) {
    		while(!stack1.isEmpty()) {
    			stack2.add(stack1.pop());
    		}
    		
    	}
    	return stack2.pop();
    }
}
