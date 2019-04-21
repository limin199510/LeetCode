package No16March;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
	public int [] so1(int []nums,int target) {
		Map <Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int search=target-nums[i];
			if(map.containsKey(search)&&map.get(search)!=i) {
				return new int[] {i,map.get(search)};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
