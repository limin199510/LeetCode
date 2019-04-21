package Heap;
/*
 * ��δ������������ҵ��� k ������Ԫ�ء�
 * ��ע�⣬����Ҫ�ҵ������������ĵ� k ������Ԫ�أ������ǵ� k ����ͬ��Ԫ�ء�
 * ����: [3,2,1,5,6,4] �� k = 2
 * ���: 5
 * ����: [3,2,3,1,2,4,5,5,6] �� k = 4
 * ���: 4
 * ����Լ��� k ������Ч�ģ��� 1 �� k �� ����ĳ���
 */
public class HeapBuild {
	public void buildBigHeap(int []num) {
		int mid=num.length/2;
		for(int i=mid;i>0;i--) 
			heapAdjust(num,i,num.length);
		for(int i=num.length;i>1;i--) {
			int temp=num[i-1];
			num[i-1]=num[0];
			num[0]=temp;
			heapAdjust(num,1,i-1);
		}
	}
	public void heapAdjust(int []num,int i,int len) {
		int temp=num[i-1];//�洢���ڵ����Ϣ
		for(int j=2*i;j<=len;j*=2) {
			if(j<len&&num[j-1]<num[j]) {
				j++;//j�洢���Һ��ӽڵ��������Ǹ�
			}
			if(temp>=num[j-1])//������ڵ���ֵ���ں��ӽڵ����������
				break;
			num[i-1]=num[j-1];//�ҵ���ǰ������ֵ�������ڵ�
			i=j;//i��¼�����ֵԭʼ�Ĵ洢λ��
		}
		num[i-1]=temp;
	}
	public static void main(String[] args) {
		HeapBuild hb=new HeapBuild();
		int []num= {50,10,10,90,30,30,70,70,40,40,80,60,20};
		hb.buildBigHeap(num);
		for(int i=0;i<num.length;i++)
			System.out.println(num[i]);
	}
	

}
