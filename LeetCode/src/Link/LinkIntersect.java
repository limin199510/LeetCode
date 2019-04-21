package Link;

import java.util.HashSet;
import java.util.Set;
//编写一个程序，找到两个单链表相交的起始节点。
public class LinkIntersect {
	public ListNode twoLinkIntersect(ListNode l1,ListNode l2){
		ListNode t1=l1,t2=l2;
		int len1=0,len2=0;
		while(t1!=null&&t2!=null) {
			len1++;
			len2++;
			t1=t1.getNext();
			t2=t2.getNext();
		}
		if(t1!=null) {
			while(t1!=null) {
				len1++;
				t1=t1.getNext();
			}
		}else if(t2!=null) {
			while(t2!=null) {
				len2++;
				t2=t2.getNext();
			}
		}
		if(len1==0||len2==0)
			return null;	
		if(len1>len2) {
			t1=remove(l1,len1-len2);
			t2=l2;
		}else if(len1<len2) {
			t2=remove(l2,len2-len1);
			t1=l1;
		}else {
			t1=l1;t2=l2;
		}
		while(t1!=null) {
			if(t1==t2)
				return t1;
			else {
				t1=t1.getNext();
				t2=t2.getNext();
			}
		}
		return null;
	}
	public ListNode remove(ListNode l,int gap) {
		ListNode ln=l;
		while(l!=null&&gap>0) {
			ln=ln.getNext();
			gap--;
		}
		return ln;
	}
	public static void main(String[] args) {
		int []num= {1,2,3,4,5};
		int []num1= {3,4,5,6,7,8,9};
		int []co= {10,11,12};
		ListNode[] li=new ListNode[num.length];
		ListNode[] li1=new ListNode[num1.length];
		ListNode[] co1=new ListNode[co.length];
		li[0]=new ListNode(num[0]);
		li1[0]=new ListNode(num1[0]);
		co1[0]=new ListNode(co[0]);
		for(int i=1;i<num1.length;i++) {
			if(i<num.length) {
				li[i]=new ListNode(num[i]);
				li[i-1].setNext(li[i]);
			}
			if(i<co.length) {
				co1[i]=new ListNode(co[i]);
				co1[i-1].setNext(co1[i]);
			}
			li1[i]=new ListNode(num1[i]);
			li1[i-1].setNext(li1[i]);
		}
		li[num.length-1].setNext(co1[0]);
		li1[num1.length-1].setNext(co1[0]);
		co1[co.length-1].setNext(null);
		ListNode ln=new LinkIntersect().twoLinkIntersect(li[0], li1[0]);
		if(ln!=null) {
			System.out.println(ln.getVal());
		}
	}

}
