package Link;
/*
 * 给定一个链表和一个特定值 x，对链表进行分隔，
 * 使得所有小于 x 的节点都在大于或等于 x 的节点之前。
 * 你应当保留两个分区中每个节点的初始相对位置。
 * 输入: head = 1->4->3->2->5->2, x = 3 
 * 输出: 1->2->2->4->3->5
 * 第一个大于x的节点和第一个小于x的节点
 * 1 x=2
 */
public class LinkDivide {
	public ListNode partition(ListNode head, int x) {
		//定义变量保存未修改的头结点。
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
