package sort;

public class InsertSort {
	public int[] sortArray(int[] num) {
		//ֱ�Ӳ����������ź����б���Ϊ1���ӵڶ����㿪ʼ,���õ��ֵС��ǰһ��ֵ���ͽ�ǰһ��ֵλ�ú���
		//ֱ�������ƶ�ʱ���õ���롣
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
		//�۰��������
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
