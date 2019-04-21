package StackAndQueue;
/*
 * ���ʵ��˫�˶��С�
 * ���ʵ����Ҫ֧�����²�����
 * MyCircularDeque(k)�����캯��,˫�˶��еĴ�СΪk��
 * insertFront()����һ��Ԫ����ӵ�˫�˶���ͷ���� ��������ɹ����� true��
 * insertLast()����һ��Ԫ����ӵ�˫�˶���β������������ɹ����� true��
 * deleteFront()����˫�˶���ͷ��ɾ��һ��Ԫ�ء� ��������ɹ����� true��
 * deleteLast()����˫�˶���β��ɾ��һ��Ԫ�ء���������ɹ����� true��
 * getFront()����˫�˶���ͷ�����һ��Ԫ�ء����˫�˶���Ϊ�գ����� -1��
 * getRear()�����˫�˶��е����һ��Ԫ�ء� ���˫�˶���Ϊ�գ����� -1��
 * isEmpty()�����˫�˶����Ƿ�Ϊ�ա�
 * isFull()�����˫�˶����Ƿ����ˡ�
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
    //��һ��Ԫ����ӵ�˫�˶���ͷ���� ��������ɹ����� true��
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
