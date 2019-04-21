package StackAndQueue;

import java.util.Stack;

public class MinStack2 {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	public MinStack2() {
		stackData=new Stack<>();
		stackMin=new Stack<>();
	}
	public void push(int x) {
		stackData.push(x);
		if(stackMin.isEmpty())
			stackMin.push(x);
		else {
			if(stackMin.peek()>x)
				stackMin.push(x);
			else
				stackMin.push(stackMin.peek());
		}
	}
	public void pop() {
		if(!stackData.isEmpty()) {
			stackData.pop();
			stackMin.pop();
		}
	}
	public int top() {
        if(!stackData.isEmpty())
        	return stackData.peek();
        return -1;
    }
    
    public int getMin() {
        if(!stackMin.isEmpty())
        	return stackMin.peek();
        return -1;
    }

}
