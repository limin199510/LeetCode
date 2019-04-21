package StackAndQueue;
/*
 * 设计实现双端队列。
 * 你的实现需要支持以下操作：
 * MyCircularDeque(k)：构造函数,双端队列的大小为k。
 * insertFront()：将一个元素添加到双端队列头部。 如果操作成功返回 true。
 * insertLast()：将一个元素添加到双端队列尾部。如果操作成功返回 true。
 * deleteFront()：从双端队列头部删除一个元素。 如果操作成功返回 true。
 * deleteLast()：从双端队列尾部删除一个元素。如果操作成功返回 true。
 * getFront()：从双端队列头部获得一个元素。如果双端队列为空，返回 -1。
 * getRear()：获得双端队列的最后一个元素。 如果双端队列为空，返回 -1。
 * isEmpty()：检查双端队列是否为空。
 * isFull()：检查双端队列是否满了。
 */
public class QueueCycle {
	/** Adds an item at the front of Deque. Return true if the operation is successful. */
    private int front;
    private int rear;
    private int size;
    private int[] queue;
    public QueueCycle(int k){
    	queue=new int[k];
    	
    }
    //将一个元素添加到双端队列头部。 如果操作成功返回 true。
	public boolean insertFront(int value) {
		if(isFull()) {
			return false;
		}
		if(front==0) {
			front=queue.length-1;		
		}else {
			front=front-1;
		}
		queue[front]=value;
		size++;
		return true;
        
    }
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
    	if(isFull())
    		return false;
        queue[rear]=value;
        rear=(rear+1)%queue.length;
        size++;
        return true;
        
    }
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(isEmpty())
        	return false;
        front=(front+1)%queue.length;
        size--;
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
    	if(isEmpty())
    		return false;
    	size--;
    	if(rear==0)
    		rear=queue.length-1;
    	else {
    		rear=rear-1;
    	}
    	return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if(isEmpty())
        	return -1;
        else {
        	return queue[front];
        }
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
    	if (isEmpty())
            return -1;
        return rear == 0 ? queue[queue.length - 1] : queue[rear - 1];
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size==0;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return queue.length==size;
    }

}
