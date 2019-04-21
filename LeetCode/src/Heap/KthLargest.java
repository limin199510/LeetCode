package Heap;
/*
 * ��δ������������ҵ��� k ������Ԫ�ء���ע�⣬����Ҫ�ҵ������������ĵ� k ������Ԫ�أ������ǵ� k ����ͬ��Ԫ�ء�

ʾ�� 1:

����: [3,2,1,5,6,4] �� k = 2
���: 5
ʾ�� 2:

����: [3,2,3,1,2,4,5,5,6] �� k = 4
���: 4
 */
public class KthLargest {
	public int findKthLargest(int[] nums, int k) {
		int mid=nums.length/2;
		for(int i=mid;i>0;i--) 
			heapAdjust(nums,i,nums.length);
		//System.out.println(nums[0]);
		if(k==1)
			return nums[0];
		int count=k;
		for(int i=nums.length;i>1;i--) {
			if(count==1)
				break;
			int temp=nums[i-1];
			nums[i-1]=nums[0];
			nums[0]=temp;
			heapAdjust(nums,1,i-1);
			count--;
		}
		return nums[0];
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
		int []nums= {3,2,1,5,6,4};
		System.out.println(new KthLargest().findKthLargest(nums, 2));
	}
}
