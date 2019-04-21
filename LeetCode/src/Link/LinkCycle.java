package Link;

import java.util.HashSet;
import java.util.Set;

/*
 * ����һ�������ж��������Ƿ��л���
 * Ϊ�˱�ʾ���������еĻ���
 * ����ʹ������ pos ����ʾ����β���ӵ������е�λ�ã������� 0 ��ʼ���� 
 * ��� pos �� -1�����ڸ�������û�л���
 */
public class LinkCycle {
	public Object clone() throws CloneNotSupportedException {
		Object o=super.clone();
		return o;
	}
	public boolean hasCycle(ListNode head) {
		Set<ListNode> s=new HashSet<>();
		while(head!=null) {
			if(s.contains(head))
				return true;
			else
				s.add(head);
			head=head.getNext();
		}
		return false;
	}
	 public boolean hasCycle2(ListNode head) {
		 if(head==null)
			 return false;
		 ListNode fast=head,slow=head,meet=null;
		 while(slow!=fast) {
			 if(fast==null||fast.next==null)
				 return false;
			 fast=fast.next.next;
			 slow=slow.next;
		 }
		 return true;
	 }
	 public ListNode detectCycle(ListNode head) {
		 //��head��meet��������ָ���ٶ�һ��������ʱ��Ϊ�������
		 ListNode fast=head,slow=head,meet=null;
		 while(fast!=null) {
			 slow=slow.next;
			 fast=fast.next;
			 if(fast==null) {
				 return null;
			 }
			 fast=fast.next;//fast����һ��
			 if(fast==slow) {
				 meet=fast;
				 break;
			 }
		 }
		 if(meet==null) {
			 return null;
		 }
		 while(head!=null&&meet!=null) {
			 if(head==meet)
				 return head;
			 head=head.next;
			 meet=meet.next;
		 }
		 return null;
	}
	 public ListNode detectCycle2(ListNode head) {
		 //��head��meet��������ָ���ٶ�һ��������ʱ��Ϊ�������
		 ListNode fast=head,slow=head,meet=null;
		 if(fast==null||fast.next==null)
			 return null;
		 while(fast!=null&& fast.next!=null) {
			 slow=slow.next;
			 fast=fast.next.next;
			 if(fast==slow) {
				 meet=fast;
				 break;
			 }
		 }
		 if(meet==null) {
			 return null;
		 }
		 while(head!=null&&meet!=null) {
			 if(head==meet)
				 return head;
			 head=head.next;
			 meet=meet.next;
		 }
		 return null;
	}
	 public static void main(String[] args) {
		 int []num= {1,2,3,4,5,6,7};
		 ListNode[] li=new ListNode[num.length];
		 li[0]=new ListNode(num[0]);
		 for(int i=1;i<num.length;i++) {
			 li[i]=new ListNode(num[i]);
			 li[i-1].setNext(li[i]);
		 }
		 li[num.length-1].setNext(li[2]);
		 System.out.println(new LinkCycle().detectCycle(li[0]).getVal());
	}
}
