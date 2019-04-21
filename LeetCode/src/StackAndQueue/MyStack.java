package StackAndQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

/*
 * ʹ�ö���ʵ��ջ�����в�����
 * push(x) -- Ԫ�� x ��ջ
 * pop() -- �Ƴ�ջ��Ԫ��
 * top() -- ��ȡջ��Ԫ��
 * empty() -- ����ջ�Ƿ�Ϊ��
 * ע��:
 * ��ֻ��ʹ�ö��еĻ�������-- Ҳ���� push to back, 
 * peek/pop from front, size, �� is empty ��Щ�����ǺϷ��ġ�
 * ����ʹ�õ�����Ҳ��֧�ֶ��С� 
 * �����ʹ�� list ���� deque��˫�˶��У���ģ��һ������ , ֻҪ�Ǳ�׼�Ķ��в������ɡ�
 * ����Լ������в���������Ч�ģ�����, ��һ���յ�ջ������� pop ���� top ��������
 */
public class MyStack {
	private Queue<Integer> queu;
	 /** Initialize your data structure here. */
    public MyStack() { 
    	queu=new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	Queue<Integer> tempQ=new LinkedList<>();
    	tempQ.offer(x);
    	while(queu.isEmpty()==false) {
    		tempQ.offer(queu.poll());
    	}
    	while(tempQ.isEmpty()==false) {
    		queu.offer(tempQ.poll());
    	}
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	int x=-1;
    	if(empty()!=true)
    		x=queu.poll();
        return x;
    }
    
    /** Get the top element. */
    public int top() {
    	int x=-1;
    	if(empty()!=true)
    		x=queu.peek();
        return x;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
    	return queu.isEmpty();        
    }
    public static void main(String[] args) {
    	 MyStack obj = new MyStack();
    	 obj.push(1);
    	 obj.push(2);
    	 obj.push(3);
    	 System.out.println(obj.top());
    	 System.out.println(obj.pop());
    	 System.out.println(obj.pop());
    	 System.out.println(obj.pop());
    	 System.out.println(obj.pop());
    	 
	}
}
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */