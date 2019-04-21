package sort;

public class BubbleSort {
	//相邻元素比较，每次将最大的元素放在后面
	public int[] sortArray(int[] num) {
		int []numSorted=new int[num.length];
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length-i-1;j++) {
				if(num[j]>num[j+1]) {
					int temp=num[j+1];
					num[j+1]=num[j];
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
