package Recall;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * ����һ������ candidates ��һ��Ŀ���� target ��
 * �ҳ� candidates �����п���ʹ���ֺ�Ϊ target ����ϡ�
 * candidates �е�ÿ��������ÿ�������ֻ��ʹ��һ�Ρ�
 * �������֣�����Ŀ������������������
 * �⼯���ܰ����ظ�����ϡ� 
 * ����: candidates = [10,1,2,7,6,1,5], target = 8,
	����⼯Ϊ:
	[
	  [1, 7],
	  [1, 2, 5],
	  [2, 6],
	  [1, 1, 6]
	]
	����: candidates = [2,5,2,1,2], target = 5,
	����⼯Ϊ:
	[
	  [1,2,2],
	  [5]
	]
 */
public class CombineSum {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> s=new HashSet<>();
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> li=new ArrayList<Integer>();
        list.add(li);
        for(int i=0;i<candidates.length;i++) {
        	for(int j=0;j<list.size();j++) {
        		List<Integer> l=new ArrayList<Integer>();
        		l.addAll(list.get(j));
        		l.add(candidates[i]);
        		int result=0;
        		for(int k=0;k<l.size();k++) {
        			result+=l.get(k);
        		}
        		if(result==target)
        			s.add(l);
        		list.add(l);
        	}
        }
        return list;
    }
}
