package offer;
/*
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
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
