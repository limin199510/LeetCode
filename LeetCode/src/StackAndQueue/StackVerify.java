package StackAndQueue;

import java.util.Stack;

/*给定 pushed 和 popped 两个序列，
 * 只有当它们可能是在最初空栈上进行的推入 push 和弹出 pop 操作序列的结果时，
 * 返回 true；否则，返回 false 。
 * 输入：pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 * 输出：true
 * 输入：pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
 * 输出：false
 * 0 <= pushed.length == popped.length <= 1000
 * 0 <= pushed[i], popped[i] < 1000
 * pushed 是 popped 的排列。
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
