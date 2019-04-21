package offer;

import java.util.HashMap;
import java.util.Map;

/*
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2��
 * ��������������0��
 */
/*
 * 1����ͷ������������ͬ�����־ͼ�1.
 * 2��Ҫע��߽�����  �������鳤��Ϊ1ʱ
 */
public class CountNum {
	public int MoreThanHalfNum_Solution(int [] array) {
		Map<Integer,Integer> numMap=new HashMap<>();
		int max=-1;
		if(array.length==1)
			return array[0];
		for(int i=0;i<array.length;i++) {
			if(numMap.containsKey(array[i])) {
				int count=numMap.get(array[i])+1;
				if(count>array.length/2)
					return array[i];
				numMap.put(array[i], count);
			}else {
				numMap.put(array[i], 1);
				
			}
		}
		return 0;
    }
	public static void main(String[] args) {
		Map<Integer,Integer> numMap=new HashMap<>();
		numMap.put(1, 1);
		numMap.put(1, 2);
		System.out.println(numMap.get(1));
	}
}
