package Greedy;
/*
 * ����һ���Ǹ��������飬�����λ������ĵ�һ��λ�á�
 * �����е�ÿ��Ԫ�ش������ڸ�λ�ÿ�����Ծ����󳤶ȡ�
 * ���Ŀ����ʹ�����ٵ���Ծ����������������һ��λ�á�
 * ʾ��:����: [2,3,1,1,4] ���: 2
 * ����: �������һ��λ�õ���С��Ծ���� 2��
 * ���±�Ϊ 0 �����±�Ϊ 1 ��λ�ã��� 1 ����Ȼ���� 3 ��������������һ��λ�á�
 * ˵��:���������ǿ��Ե�����������һ��λ�á�
 */
//��ǰ�����λ�� ��һ�ε����λ��
public class Jump2 {
	public int jump1(int[] nums) {
		if(nums==null||nums.length<2)
			return 0;
		int current=nums[0];
		int pre=nums[0];
		int count=1;
		for(int i=1;i<nums.length;i++) {
			if(i>current) {
				current=pre;
				count++;
			}
			pre=Math.max(i+nums[i], pre);
		}
		return count;
	}
	public int jump(int[] nums) {
		int reach=0;
		int nextreach=nums[0];
		int count=0;
		if(nums.length==1)
			return 0;
		for(int i=0;i<nums.length;i++) {
			nextreach=Math.max(i+nums[i], nextreach);//��ǰ���Ե������Զ��λ��
			if(nextreach>=nums.length-1) {
				count++;
				return count;
			}
			if(i==reach) {
				count++;
				reach=nextreach;
			}
		}
        return count;
    }
	public int jump2(int[] nums) {
		if(nums.length<2)
			return 0;
		int current=nums[0];
		int pre=nums[0];
		int step=1;
		for(int i=1;i<nums.length;i++) {
			if(i>current) {//���޷�����ǰ�ƶ��ˣ��������Ծ��
				step++;
				current=pre;
			}
			if(pre<nums[i]+i) {
				pre=nums[i]+i;
			}
		}
		return step;
    }
	public static void main(String[] args) {
		int nums[]= {7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
		System.out.println(new Jump2().jump2(nums));
		//[0] [1,2] [1,2,1,1,1] [7,0,9,6,9,6,1,7,9,0,1,2,9,0,3]
	}
}
