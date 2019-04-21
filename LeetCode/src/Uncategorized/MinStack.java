package offer;

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
        if(stackMin.isEmpty())
			 stackMin.push(x);
		 else if(x<=getMin())
			 stackMin.push(x);
		 stackData.push(x); 
    }
    
    public void pop() {
         if(stackData.isEmpty())
			 return;
		 int value=stackData.pop();
		 if(value==getMin())
			 stackMin.pop();
        
    }
    
    public int top()  {
        if(stackData.isEmpty())
			 return -1;
        return stackData.peek();
        
    }
    
    public int getMin() {
        if(stackMin.isEmpty())
			 return -1;
		 return stackMin.peek();	 
    }
    public static void main(String[] args) throws Exception {
		MinStack ms=new MinStack();
		ms.push(-2);
		ms.push(0);
		ms.push(-3);
		System.out.println(ms.getMin());
		ms.pop();
		ms.top();
		System.out.println(ms.getMin());
	}
}
