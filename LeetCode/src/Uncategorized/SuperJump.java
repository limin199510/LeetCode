package offer;
/*
 * һֻ����һ�ο�������1��̨�ף�
 * Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
 */
public class SuperJump {
	 public int JumpFloorII(int target) {
	        int result=1;
	        for(int i=1;i<target;i++)
	            result*=2;
	        return result;
	    }

}
