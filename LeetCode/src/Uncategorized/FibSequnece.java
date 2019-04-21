package offer;
/*
 * 斐波那契数列
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，
 * 377，610，987，1597，2584，4181，6765，10946，17711，28657
 * 大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0）。n<=39
 */

public class FibSequnece {
	public int Fibonacci(int n) {
		int a[]=new int[n+1];
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		a[0]=0;a[1]=1;
		for(int i=2;i<=n;i++ )
			a[i]=a[i-1]+a[i-2];
		return a[n];
    }
	public int Fibonacci2(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		int result=0;
		int pre=1,prePre=0;
		for(int i=2;i<=n;i++ ) {
			result=pre+prePre;
			prePre=pre;
			pre=result;
		}
			
		return result;
    }
	
	public static void main(String[] args) {
		
	}

}
