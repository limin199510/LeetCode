package offer;
/*
 * 输入两个单调递增的链表，
 * 输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 */
public class LinkedMerge {
	 public ListNode Merge(ListNode list1,ListNode list2) {
	        ListNode list=new ListNode(-1);
	        ListNode current=list;
	        while(list1!=null&&list2!=null) {
	        	if(list1.val<=list2.val) {
	        		current.next=list1;
	        		current=current.next;
	        		list1=list1.next;
	        	}else {
	        		current.next=list2;
	        		current=current.next;
	        		list2=list2.next;
	        	}
	        }
	        if(list1!=null) {
	        	while(list1!=null) {
	        		current.next=list1;
	        		current=current.next;
	        		list1=list1.next;
	        	}
	        }else {
	        	while(list2!=null) {
	        		current.next=list2;
	        		current=current.next;
	        		list2=list2.next;
	        	}
	        }
	        return list.next;
	 }
}
