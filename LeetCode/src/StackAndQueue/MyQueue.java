package StackAndQueue;

import java.util.Stack;

/*
 * ʹ��ջʵ�ֶ��е����в�����
 * push(x) -- ��һ��Ԫ�ط�����е�β����
 * pop() -- �Ӷ����ײ��Ƴ�Ԫ�ء�
 * peek() -- ���ض����ײ���Ԫ�ء�
 * empty() -- ���ض����Ƿ�Ϊ�ա�
 * ʾ��:
 * MyQueue queue = new MyQueue();
 * queue.push(1);
 * queue.push(2);  
 * queue.peek();  // ���� 1
 * queue.pop();   // ���� 1
 * queue.empty(); // ���� false
 * ˵��:
 * ��ֻ��ʹ�ñ�׼��ջ���� -- Ҳ����ֻ�� push to top, peek/pop from top, size, �� is empty �����ǺϷ��ġ�
 * ����ʹ�õ�����Ҳ��֧��ջ�������ʹ�� list ���� deque��˫�˶��У���ģ��һ��ջ��ֻҪ�Ǳ�׼��ջ�������ɡ�
 * �������в���������Ч�� �����磬һ���յĶ��в������ pop ���� peek ��������
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
        tempS.push(x);//ȷ���¼����Ԫ����ջ�����
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
