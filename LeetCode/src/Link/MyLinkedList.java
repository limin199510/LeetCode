package Link;
class Node{
	int val;
	Node next;
	Node(){
		this.next=null;
	}
	Node(int val){
		this.val=val;
		this.next=null;
	}
	Node(int val,Node next){
		this.val=val;
		this.next=next;
	}
}
public class MyLinkedList {
	
	private Node head;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        
    }
 
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
    	int count=0;
    	Node temp=head;
        while(temp!=null&&count<=index) {
        	if(count==index) {
        		return temp.val;
        	}
        	temp=temp.next;
        	count++;
        }
        return -1;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
    	Node temp=head;
    	Node ml=new Node(val,temp);
    	head=ml;
    }   
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
    	Node temp=head;
    	while(temp.next!=null) {
    		temp=temp.next;
    	}
    	Node ml=new Node(val);
    	temp.next=ml;
    	ml.next=null;
    	
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        int count=0;
        Node temp=head;
        if(index==0) {
        	Node ml=new Node(val);
        	Node next=temp.next;
        	temp.next=ml;
        	ml.next=next;
        	
        }
        while(temp!=null&&count<index) {
        	if(count==index-1) {
        		Node ml=new Node(val);
            	Node next=temp.next;
            	temp.next=ml;
            	ml.next=next;
            	break;
        	}
        	temp=temp.next;
        	count++;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        int count=0;
        Node temp=head;
        while(temp!=null&&count<index){
        	if(count==index-1) {
        		if(temp.next!=null) {
        			Node next=temp.next.next;
        			temp.next=next;
        			break;
        		}
        		
        	}
        	temp=temp.next;
        	count++;
        }
    }
    public static void main(String[] args) {
		
	}
}
