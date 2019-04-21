package offer;

import java.util.HashMap;
import java.util.Map;

/*
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
 * 如果不存在则输出0。
 */
/*
 * 1、从头遍历，存在相同的数字就加1.
 * 2、要注意边界条件  比如数组长度为1时
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
