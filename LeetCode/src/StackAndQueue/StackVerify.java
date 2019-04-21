package StackAndQueue;

import java.util.Stack;

/*���� pushed �� popped �������У�
 * ֻ�е����ǿ������������ջ�Ͻ��е����� push �͵��� pop �������еĽ��ʱ��
 * ���� true�����򣬷��� false ��
 * ���룺pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 * �����true
 * ���룺pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
 * �����false
 * 0 <= pushed.length == popped.length <= 1000
 * 0 <= pushed[i], popped[i] < 1000
 * pushed �� popped �����С�
 */
public class StackVerify {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
    	Stack<Integer> stack=new Stack<>();
    	if(pushed==null||popped==null)
    		return false;
    	if(pushed.length!=popped.length)
    		return false;
    	int index=0;
    	for(int i=0;i<pushed.length;i++) {
    		stack.push(pushed[i]);
    		while(!stack.isEmpty()&&popped[index]==stack.peek()) {
    			stack.pop();
    			index++;
    		}
    	}
        return stack.isEmpty();
    }
}
