package Greedy;
/*
 * ����һ���Ǹ��������飬�����λ������ĵ�һ��λ�á�
 * �����е�ÿ��Ԫ�ش������ڸ�λ�ÿ�����Ծ����󳤶ȡ�
 * �ж����Ƿ��ܹ��������һ��λ�á�
 * ʾ�� 1:����: [2,3,1,1,4]���: true
 * ����: ��λ�� 0 �� 1 �� 1 ��, Ȼ���� 3 ���������һ��λ�á�
 * ʾ�� 2:����: [3,2,1,0,4]���: false
 * ����: �������������ܻᵽ������Ϊ 3 ��λ�á�����λ�õ������Ծ������ 0 �� ��������Զ�����ܵ������һ��λ�á�
 */
public class Jump {
	public boolean canJump(int[] nums) {
		int index=0;
		for(int i=0;i<nums.length;) {
			if(i+nums[i]>index)
				index=i+nums[i];//��¼��ǰ�����Ե����λ��
			if(i+nums[i]>=nums.length-1) {
				return true;//�����ǰ����λ���Ѿ���Խ�����һ���� �򷵻�true
			}else if(nums[i]!=0){
				i++;//ֻҪ��ǰ��Ծ�Ĳ�����Ϊ0 �������һ��λ��
			}else  {//�����ǰλ�õ���Ծ����Ϊ0����Ҫ�������Ե����λ���Ƿ��ܹ�����0���λ�á�
				if(index>i) {
					i++;
				}else {
					return false;
				}
			}
		}
        return false;
    }
	public static void main(String[] args) {
		int []nums= {1,1,2,2,0,1,1};
		System.out.println(new Jump().canJump(nums));
		//[1,1,2,2,0,1,1]
	}
}
