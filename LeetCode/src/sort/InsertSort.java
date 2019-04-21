package sort;

public class InsertSort {
	public int[] sortArray(int[] num) {
		//直接插入排序，已排好序列表长度为1，从第二个点开始,若该点的值小于前一个值，就将前一个值位置后移
		//直到不能移动时将该点插入。
		for(int i=1;i<num.length;i++) {
			int temp=num[i];
			int j=i;
			while(j>0&&num[j-1]>temp) {
				num[j]=num[j-1];
				j--;
			}
			num[j]=temp;
		}
		return num;
	}
	public int[] sortArray2(int[] num) {
		//折半插入排序
		for(int i=1;i<num.length;i++) {
			int temp=num[i];
			int j=i;
			while(j>0&&num[j-1]>temp) {
				num[j]=num[j-1];
				j--;
			}
			num[j]=temp;
		}
		return num;
	}
}
