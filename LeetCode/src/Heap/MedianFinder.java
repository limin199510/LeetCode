package Heap;

import java.util.PriorityQueue;

public class MedianFinder {
	 /** initialize your data structure here. */
	PriorityQueue<Integer> big;
	PriorityQueue<Integer> small;
    public MedianFinder() {
    	//lambda表达式，接收两个参数a1和a2 a2>a1返回整数否则返回负数或0.
    	big=new PriorityQueue<>((a1, a2) -> a2 - a1);
    	small=new PriorityQueue<>();
    } 
    public void addNum(int num) {
    	if(big.isEmpty()) {
    		big.offer(num);
    		return;
    	}
    	if(num>big.peek()) {
    		small.offer(num);
    	}else {
    		big.offer(num);
    	}
    	if(big.size()-small.size()>1) {
    		small.offer(big.poll());
    	}else if(small.size()-big.size()>1) {
    		big.offer(small.poll());
    	}
    	
    }
    public double findMedian() {
    	int bigLen=big.size();
    	int smallLen=small.size();
    	double num=-1;
    	if(bigLen==smallLen) {
    		if(bigLen==0)
    			return 0;
    		num=(big.peek()+small.peek())/2.0;
    		return num;
    	}else if(bigLen>smallLen) {
    		num=big.peek();
    	}else {
    		num=small.peek();
    	}
        return num;
    }
       
	public static void main(String[] args) {
		MedianFinder m=new MedianFinder();
		m.addNum(-1);
		//System.out.println(m.findMedian());
		m.addNum(-2);
		//System.out.println(m.findMedian());
		m.addNum(-3);
		System.out.println(m.findMedian());
		
	}

}
