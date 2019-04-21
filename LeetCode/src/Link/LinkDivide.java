package Link;
/*
 * ����һ�������һ���ض�ֵ x����������зָ���
 * ʹ������С�� x �Ľڵ㶼�ڴ��ڻ���� x �Ľڵ�֮ǰ��
 * ��Ӧ����������������ÿ���ڵ�ĳ�ʼ���λ�á�
 * ����: head = 1->4->3->2->5->2, x = 3 
 * ���: 1->2->2->4->3->5
 * ��һ������x�Ľڵ�͵�һ��С��x�Ľڵ�
 * 1 x=2
 */
public class LinkDivide {
	public ListNode partition(ListNode head, int x) {
		//�����������δ�޸ĵ�ͷ��㡣
		ListNode small_head=null,small_next=null;
		ListNode max_head=null,max_next=null;
		while(head!=null) {
			if(head.val<x) {
				if(small_next!=null) {
					small_next.next=head;
					small_next=small_next.next;
				}else {
					small_head=head;
					small_next=small_head;
				}				
			}else {
				if(max_next!=null) {
					max_next.next=head;
					max_next=max_next.next;
				}else {
					max_head=head;
					max_next=max_head;
				}	
			}
			head=head.next;
			if(head==null) {
				if(max_next!=null)
					max_next.next=null;
				if(small_next!=null) {	
					small_next.next=max_head;
					return small_head;
				}else {
					return max_head;
				}
			}
		}
        return null;
    }
	public static void main(String[] args) {
		 int []num= {1,4,3,2,5,2};
		 ListNode[] li=new ListNode[num.length];
		 li[0]=new ListNode(num[0]);
		 for(int i=1;i<num.length;i++) {
			 li[i]=new ListNode(num[i]);
			 li[i-1].setNext(li[i]);
		 }
		 li[num.length-1].setNext(null);
		
		 ListNode l=new LinkDivide().partition(li[0], 3);
		 while(l!=null) {
			 System.out.println(l.getVal());
			 l=l.next;
		 }

	}

}
