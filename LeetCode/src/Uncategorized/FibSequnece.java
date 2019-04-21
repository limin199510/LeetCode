package offer;
/*
 * 쳲���������
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233��
 * 377��610��987��1597��2584��4181��6765��10946��17711��28657
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n��
 * �������쳲��������еĵ�n���0��ʼ����0��Ϊ0����n<=39
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
