package offer;
/*
 * 输入一个链表，反转链表后，输出新链表的表头
 * 1234567
 */
public class ReverseLinked {
	 public ListNode ReverseList(ListNode head) {
		 ListNode pre=null;
		 ListNode preP=null;
		 while(head!=null) {
			 pre=head.next;
			 head.next=preP;
			 preP=head;
			 head=pre.next;
		 }
		 return pre;
	 }
	 public static void main(String[] args) {
			ListNode listNode =new ListNode(0);
			ListNode ln =listNode;
			for(int i=1;i<=10;i++) {
				ln.next=new ListNode(i);
				ln=ln.next;
			}
			ListNode ppre=listNode;
			ListNode pre=listNode.next;
			ListNode c=pre;c.next=ppre;
			System.out.println(pre.next.val);
			System.out.println(c.next.val);
			
			
	 }

}
