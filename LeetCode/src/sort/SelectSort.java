package sort;

public class SelectSort {
	//ÿ���ҵ���С��Ԫ�� �õ�ǰԪ�����κͺ���Ƚϣ���С�ڵ�ǰԪ������߽��������ý���֮���Ԫ�غͺ���Ƚϣ�
	//һ��ѭ������֮������С�ķ���ǰ�档
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
