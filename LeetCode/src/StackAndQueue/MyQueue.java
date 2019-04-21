package StackAndQueue;

import java.util.Stack;

/*
 * 使用栈实现队列的下列操作：
 * push(x) -- 将一个元素放入队列的尾部。
 * pop() -- 从队列首部移除元素。
 * peek() -- 返回队列首部的元素。
 * empty() -- 返回队列是否为空。
 * 示例:
 * MyQueue queue = new MyQueue();
 * queue.push(1);
 * queue.push(2);  
 * queue.peek();  // 返回 1
 * queue.pop();   // 返回 1
 * queue.empty(); // 返回 false
 * 说明:
 * 你只能使用标准的栈操作 -- 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。
 * 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
 * 假设所有操作都是有效的 （例如，一个空的队列不会调用 pop 或者 peek 操作）。
 */
public class MyQueue {
	private Stack<Integer> stack;
	 /** Initialize your data structure here. */
    public MyQueue() {
        stack=new Stack<>();
    }
    /** Push element x to the back of queue. */
    public void push(int x) {
    	Stack<Integer> tempS=new Stack<>();
        while(!stack.isEmpty()) {
        	tempS.push(stack.pop());
        }
        tempS.push(x);//确保新加入的元素在栈的最顶端
        while(!tempS.isEmpty()) {  	
        	stack.push(tempS.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	int x=-1;
        if(empty()==false) {
        	x=stack.pop();
        }
        return x;
    }
    
    /** Get the front element. */
    public int peek() {
        int x=-1;
        if(empty()==false) {
        	x=stack.peek();
        }
        return x;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(stack.isEmpty())
        	return true;
        else
        	return false;
    }
    public static void main(String[] args) {
		MyQueue mq=new MyQueue();
		mq.push(1);
		mq.push(2);
		System.out.println(mq.pop());
		System.out.println(mq.empty());
    
    	
	}
}
