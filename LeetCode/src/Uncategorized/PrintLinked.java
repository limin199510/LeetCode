package offer;

import java.util.ArrayList;

/*
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * 
 */
class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val=val;
	}
}
public class PrintLinked {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	ArrayList<Integer> al=new ArrayList<>();
    	ArrayList<Integer> result=new ArrayList<>();
    	ListNode ln=listNode;
    	while(ln!=null) {
    		al.add(ln.val);
    		ln=ln.next;
    	}
    	for(int i=al.size()-1;i>=0;i--)
    		result.add(al.get(i));
    	return result;
    }
    public static void main(String[] args) {
		ListNode listNode =new ListNode(0);
		ListNode ln =listNode;
		for(int i=1;i<=10;i++) {
			ln.next=new ListNode(i);
			ln=ln.next;
		}
		PrintLinked pl=new PrintLinked();
		ArrayList<Integer> al=pl.printListFromTailToHead(listNode);
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
	}
}
