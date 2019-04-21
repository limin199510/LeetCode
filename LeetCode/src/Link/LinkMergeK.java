package Link;
/*
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * 示例:
 * 输入:
 * [1->4->5,
 * 1->3->4,
 * 2->6]
 * 输出: 1->1->2->3->4->4->5->6
 */
public class LinkMergeK {
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
	 public ListNode mergeKLists(ListNode[] lists) {
		 if(lists.length<1)
			 return null;
		 if(lists.length==1)
			 return lists[0];
		 if(lists.length==2)
			 return mergeTwoLists(lists[0], lists[1]);
		 int mid=lists.length/2;
		 ListNode[] list1=new ListNode[mid];
		 ListNode[] list2=new ListNode[lists.length-mid];
		 int i=0,j=mid;
		 for(i=0,j=mid;i<mid&&j<lists.length;i++,j++) {
			 list1[i]=lists[i];
			 list2[i]=lists[j];
		 }
		 while(i<mid) {
			 list1[i]=lists[i];
			 i++;
		 }while(j<lists.length) {
			 list2[i]=lists[j];
			 j++;i++;
		 }
		 ListNode l1=mergeKLists(list1);
		 ListNode l2=mergeKLists(list2);
		 return mergeTwoLists(l1, l2);
	 }

}
