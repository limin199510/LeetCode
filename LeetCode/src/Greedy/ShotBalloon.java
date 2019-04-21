package Greedy;

import java.util.Arrays;
import java.util.Comparator;

/*
 * �ڶ�ά�ռ�����������ε�����
 * ����ÿ�������ṩ��������ˮƽ�����ϣ�����ֱ���Ŀ�ʼ�ͽ������ꡣ
 * ��������ˮƽ�ģ�����y���겢����Ҫ�����ֻҪ֪����ʼ�ͽ�����x������㹻�ˡ�
 * ��ʼ��������С�ڽ������ꡣƽ����������104������
 * һ֧������������x��Ӳ�ͬ����ȫ��ֱ�������
 * ������x�����һ֧��������һ�������ֱ���Ŀ�ʼ�ͽ�������Ϊ xstart��xend�� 
 * ������  xstart �� x �� xend���������ᱻ��������������Ĺ���������û�����ơ� 
 * ����һ�������֮�󣬿������޵�ǰ����
 * �������ҵ�ʹ����������ȫ��������������Ĺ�������С������
 * ����:[[10,16], [2,8], [1,6], [7,12]] ���:2
 * ����: ���ڸ����������ǿ�����x = 6���䱬[2,8],[1,6]�������򣩺� x = 11���䱬�����������򣩡�
 */
public class ShotBalloon {
	public int findMinArrowShots(int[][] points) {
		if(points==null||points.length<1)
			return 0;
		Arrays.sort(points, Comparator.comparingInt(o->o[1]));
		int end=points[0][1];
		int count=1;
		for(int i=1;i<points.length;i++) {
			if(points[i][0]<=end) {
				continue;
			}
			count++;
			end=points[i][1];
		}
		return count;
	}
	public int findMinArrowShots2(int[][] points) {
		if(points==null||points.length<1)
			return 0;
		int count=1;
		Arrays.sort(points,Comparator.comparingInt(a1->a1[0]));
		int end=points[0][1];
		for(int i=1;i<points.length;i++) {
			if(points[i][0]>end) {
				count++;
				end=points[i][1];
			}else {
				continue;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int [][]points= {{10,16}, {2,8}, {1,6}, {7,12}};
		System.out.println(new ShotBalloon().findMinArrowShots(points));
		
	}
}
