package offer;

import java.util.ArrayList;

/*
 * ����һ����������������е�����k����㡣
 * һ�α������ʵ����
 */

public class FindKthLinked {
	
	public ListNode FindKthToTail(ListNode head,int k) {
		ListNode temp=head,pre=head;
		ArrayList<Integer> al=new ArrayList<>();
		while(temp!=null) {
			al.add(temp.val);
			temp=temp.next;
		}
		temp=head;
		int num=al.size()-k,i=0;
		while(temp!=null) {
			if(i==num)
				return temp;
			else {
				temp=temp.next;
				i++;
			}
			
		}
		return null;
    }
}
