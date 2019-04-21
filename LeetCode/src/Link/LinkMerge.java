package Link;
/*
 * 将两个有序链表合并为一个新的有序链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的。 
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class LinkMerge {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head=new ListNode(0);
		ListNode result=head;
		while(l1!=null&&l2!=null) {
			if(l1.val>l2.val) {
				head.next=l2;
				head=head.next;
				l2=l2.next;
			}else {
				head.next=l1;
				head=head.next;
				l1=l1.next;
			}
		}
		while(l1!=null) {
			head.next=l1;
			head=head.next;
			l1=l1.next;
		}while(l2!=null) {
			head.next=l2;
			head=head.next;
			l2=l2.next;
		}
		head.next=null;
		return result.next;
    }
	public static void main(String[] args) {
		int []num= {1,2,4};
		int []num1= {1,3,4};
		ListNode[] li=new ListNode[num.length];
		ListNode[] li1=new ListNode[num1.length];
		li[0]=new ListNode(num[0]);
		li1[0]=new ListNode(num1[0]);
		for(int i=1;i<num1.length;i++) {
			if(i<num.length) {
				li[i]=new ListNode(num[i]);
				li[i-1].setNext(li[i]);
			}
			li1[i]=new ListNode(num1[i]);
			li1[i-1].setNext(li1[i]);
		}
		li[num.length-1].next=null;
		li1[num.length-1]=null;
		System.out.println(new LinkMerge().mergeTwoLists(li[0], li1[0]).val);
	}

}
