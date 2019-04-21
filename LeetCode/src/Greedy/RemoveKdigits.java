package Greedy;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import javax.print.attribute.HashAttributeSet;

/*
 * ����һ�����ַ�����ʾ�ķǸ����� num���Ƴ�������е� k λ���֣�
 * ʹ��ʣ�µ�������С��
 * ע��:num �ĳ���С�� 10002 �� �� k��num ��������κ�ǰ���㡣
 * ʾ�� 1 :����: num = "1432219", k = 3 ���: "1219"
 * ����: �Ƴ����������� 4, 3, �� 2 �γ�һ���µ���С������ 1219��
 * ʾ�� 2 :
 * ����: num = "10200", k = 1 ���: "200"
 * ����: �Ƶ���λ�� 1 ʣ�µ�����Ϊ 200. ע������������κ�ǰ���㡣
 * ʾ�� 3 :����: num = "10", k = 2 ���: "0" 
 * ����: ��ԭ�����Ƴ����е����֣�ʣ��Ϊ�վ���0��
 */
public class RemoveKdigits {
	public String removeKdigits(String num, int k) {
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<num.length();i++) {
			int n=Integer.parseInt(num.charAt(i)+"");
			while(!stack.isEmpty()&&k!=0&&n<stack.peek()) {
				stack.pop();
				k--;
			}
			if(n!=0||!stack.isEmpty()) {
				stack.push(n);
			}
		}
		 // �����꣬���ǻ�ûȥ��k������
        while (!stack.isEmpty() && k!=0)
        {
            stack.pop();
            k--;
        }
        if (stack.isEmpty()) stack.push(0); 
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<stack.size(); i++) sb.append(stack.get(i));
        return sb.toString();
	}
	public static void main(String[] args) {
		String num = "10200";
		System.out.println(new RemoveKdigits().removeKdigits(num, 2));
	}

}
