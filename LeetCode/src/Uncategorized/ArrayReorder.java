package offer;
/*
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿�֣�
 * ���е�ż��λ������ĺ�벿�֣�����֤������������
 * ż����ż��֮������λ�ò��䡣
 */
public class ArrayReorder {
	public void reOrderArray(int [] array) {
		int left=0;
		int index[]=new int[array.length];
		int val[]=new int[array.length];
		int i=0;
		while(left<array.length) {
			if(array[left]%2==0) {
				index[i]=left;
				val[i]=array[left];
				i++;	
			}else {
				if(i!=0) {//֤��ǰ���Ѿ����ֿ�λ�ô���������
					array[index[0]]=array[left];
					int temp=left;
					int j=i;
					while(j>0) {
						array[temp]=val[j-1];
						index[j-1]=temp;
						temp--;j--;
					}
				}
			}
			left++;
		}
    }
}
