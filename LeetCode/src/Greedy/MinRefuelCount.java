package Greedy;

import java.util.PriorityQueue;

/*
 * ������������ʻ��Ŀ�ĵأ���Ŀ�ĵ�λ�ڳ���λ�ö��� target Ӣ�ﴦ��
 * ��;�м���վ��ÿ�� station[i] ����һ������վ����λ�ڳ���λ�ö��� station[i][0] Ӣ�ﴦ�������� station[i][1] �����͡�
 * ����������������������޵ģ���������� startFuel ��ȼ�ϡ���ÿ��ʻ 1 Ӣ��ͻ��õ� 1 �����͡�
 * �������������վʱ��������ͣ�������ͣ����������ʹӼ���վת�Ƶ������С�
 * Ϊ�˵���Ŀ�ĵأ���������Ҫ����ͼ��ʹ����Ƕ��٣�����޷�����Ŀ�ĵأ��򷵻� -1 ��
 * ע�⣺��������������վʱʣ��ȼ��Ϊ 0������Ȼ������������͡�
 * �����������Ŀ�ĵ�ʱʣ��ȼ��Ϊ 0����Ȼ��Ϊ���Ѿ�����Ŀ�ĵء�
 */
public class MinRefuelCount {
	//����������ʱѡ�����
	public int minRefuelStops(int target, int startFuel, int[][] stations) {
		PriorityQueue<Integer> big=new PriorityQueue<>((a1, a2) -> a2 - a1);
		if(startFuel>=target)
			return 0;
		if(stations==null||stations.length<1||startFuel<stations[0][0])
			return -1;
		int count=0;
		int p=startFuel-stations[0][0];//�����һ������վ���ʣ��������
		big.offer(stations[0][1]);//����һ������վ����������ӽ�����
		for(int i=1;i<=stations.length;i++) {//�ж��Ƿ��ܹ������i������վ
			int d;
			if(i==stations.length)
				d=target-stations[stations.length-1][0];
			else
				d=stations[i][0]-stations[i-1][0];//��i������վ�͵�i-1������վ֮��ľ���
			while(p<d&&!big.isEmpty()) {
				p+=big.poll();//��ǰ�������޷������i������վ ��Ҫ����,����ѡ���������ļ���վ
				count++;
			}
			if(p>=d) {//��ǰ�������㹻�������վi
				if(i==stations.length)
					return count;
				big.offer(stations[i][1]);
				p=p-d;
			}else {//��������֮�����޷��������վi˵���޷������յ�
				return -1;
			}
		}
		return count;
    }
}
