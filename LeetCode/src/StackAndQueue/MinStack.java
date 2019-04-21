package StackAndQueue;

import java.util.Stack;


/*
 * ����ջ�����ݽṹ��
 * ���ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1������
 */
public class MinStack {
    private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
    /** initialize your data structure here. */
    public MinStack() {
        stackData=new Stack<>();
		stackMin=new Stack<>();
        
    }
    public void push(int x) {
       stackData.push(x);
       if(stackMin.isEmpty())
    	   stackMin.push(x);
       else {
    	   if(stackMin.peek()>=x)
    		   stackMin.push(x);
       }
    } 
    public void pop() {
         if(!stackData.isEmpty()) {
        	 int x=stackData.pop();
        	 if(x==stackMin.peek())
        		 stackMin.pop();
         }
    }
    public int top()  {
        if(!stackData.isEmpty()) {
        	return stackData.peek();
        }
        return -1;
    }
    
    public int getMin() {
        if(stackMin.isEmpty())
			 return -1;
		return stackMin.peek();	 
    }
    public static void main(String[] args) throws Exception {
		MinStack ms=new MinStack();
		ms.push(0);
		ms.push(-2);
		ms.pop();	
		System.out.println(ms.getMin());
		ms.pop();
		ms.top();
		System.out.println(ms.getMin());
	}
}
