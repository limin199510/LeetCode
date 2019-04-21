package Link;

public class ListNode {
	int val;
	ListNode next;
	ListNode rand;
	public ListNode(int val){
		this.val=val;
		this.next=null;
		this.rand=null;
	}
	public int getVal() {
		return val;
	}
	public ListNode getNext() {
		return next;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
}
