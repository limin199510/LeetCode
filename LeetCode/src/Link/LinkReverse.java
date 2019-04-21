package Link;

public class LinkReverse {
	public ListNode reverseLink(ListNode head) {
		ListNode new_head=null;
		while(head!=null) {
			ListNode next=head.getNext();//备份head的后续节点 next节点不断后移
			head.setNext(new_head);//将头结点的next节点置为新头结点
			new_head=head;//新头结点后移
			head=next;//head节点后移
		}
		return new_head;
	}
	//对m~n范围内的节点逆序
	public ListNode reverseLink2(ListNode head,int m,int n) {
		ListNode pre_head=null;
		ListNode result=head;
		int change=n-m+1;
		while(head!=null&&m>1) {
			pre_head=head;
			head=head.getNext();
			m--;
		}
		ListNode modify_head=head;
		ListNode new_head=null;
		while(head!=null&&change>0) {
			ListNode next=head.getNext();
			head.setNext(new_head);
			new_head=head;
			head=next;
			change--;
		}
		modify_head.setNext(head);	
		if(pre_head!=null) {
			pre_head.setNext(new_head);
		}else {
			result=new_head;//m=1的情况
		}
		return result;
	}
	
	public static void main(String[] args) {
		int []num= {1,2,3,4,5};
		ListNode[] li=new ListNode[num.length];
		li[0]=new ListNode(num[0]);
		for(int i=1;i<num.length;i++) {
			li[i]=new ListNode(num[i]);
			li[i-1].setNext(li[i]);
		}
		li[num.length-1].setNext(null);
		ListNode head=new LinkReverse().reverseLink2(li[0],2,4);
		while(head!=null) {
			System.out.println(head.getVal());
			head=head.getNext();
		}
	}

}
