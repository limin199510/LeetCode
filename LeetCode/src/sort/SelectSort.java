package sort;

public class SelectSort {
	//每次找到最小的元素 拿当前元素依次和后序比较，若小于当前元素则二者交换，再用交换之后的元素和后序比较，
	//一次循环结束之后会把最小的放在前面。
	public int[] sortArray(int[] num) {
		for(int i=0;i<num.length-1;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		return num;
	}
	public static void main(String[] args) {
		int []num= {2,1,3,2,6,1,0,4,7};
		int []num1=new BubbleSort().sortArray(num);
		for(int i=0;i<num1.length;i++)
			System.out.println(num1[i]);
	}
}
