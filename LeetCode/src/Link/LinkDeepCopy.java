package Link;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
/*
 * 给定一个链表，每个节点包含一个额外增加的随机指针，
 * 该指针可以指向链表中的任何节点或空节点。
 * 要求返回这个链表的深拷贝。
 */
public class LinkDeepCopy {
	public ListNode copyRandomList(ListNode head) {
		Map<ListNode,Integer> node_map=new HashMap<>();
		ArrayList<ListNode> node_list=new ArrayList<>();
		ListNode ptr=head;
		node_list.add(new ListNode(ptr.val));//新建节点。
		node_map.put(ptr, 0);
		int i=1;
		ptr=ptr.next;
		while(ptr!=null) {
			node_list.add(new ListNode(ptr.val));//新建节点。
			node_map.put(ptr, i);
			node_list.get(i-1).next=node_list.get(i);
			ptr=ptr.next;
			i++;
		}
		node_list.get(i-1).next=null;
		ptr=head;
		i=0;
		while(ptr!=null) {
			if(ptr.rand!=null) {
				int index=node_map.get(ptr.rand);
				node_list.get(i).rand=node_list.get(index);
			}else {
				node_list.get(i).rand=null;
			}
			i++;
			ptr=ptr.next;
		}
        return node_list.get(0);
    }
	public static void main(String[] args) {
		 int []num= {1,4,3,2,5,6};
		 ListNode[] li=new ListNode[num.length];
		 li[0]=new ListNode(num[0]);
		 Random rand=new Random();
		 for(int i=1;i<num.length;i++) { 
			 li[i]=new ListNode(num[i]);
			 li[i-1].setNext(li[i]);
		 }
		 for(int i=0;i<num.length;i++) {
			 int index=rand.nextInt(num.length);
			 li[i].rand=li[index];
		 }
		 li[num.length-1].setNext(null);
		 ListNode t=li[0];
		 t.next.val=5;
		 System.out.println(li[0].next.val);
	}
}
