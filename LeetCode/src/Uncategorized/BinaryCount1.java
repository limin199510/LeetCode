package offer;
/*
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class BinaryCount1 {
	public int NumberOf1(int n) {
		int count=0;
		while(n!=0) {
			count+=n&1;
			n=n>>>1;
		}
		return count;	    
    }
	public static void main(String[] args) {
		int n=10;
		int count=0;
		while(n != 0){
		   count += n & 1;
		   System.out.println(count);
		   n = n >> 1;
		   System.out.println(n);
		}
		System.out.println(count);
	}

}
