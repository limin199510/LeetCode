package offer;
/*
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
 * �����������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������
 */
public class Jump {
	public int JumpFloor(int target) {
        int pre=2,prePre=1;
        int step=0,count=3;
        if(target==1)
        	return 1;
        if(target==2)
        	return 2;
        while(count<=target) {
        	step=pre+prePre;
        	prePre=pre;
        	pre=step;
        	count++;
        }
        return step;  
    }
	public static void main(String[] args) {
		
	}

}
