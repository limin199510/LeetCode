package Recall;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * 说明：解集不能包含重复的子集。
 * 输入: nums = [1,2,3]
 * 输出:[[3],[1],[2],[1,2,3],[1,3],[2,3],[1,2],[]]
 */
public class Subset {
	 public List<List<Integer>> subsets(int[] nums) {
	        int n = nums.length;
	        List<List<Integer>> r = new ArrayList<List<Integer>>();
	        r.add(new ArrayList<Integer>());
	        for (int i = 0; i < n; i++) {
	            int length = r.size();
	            for (int j = 0; j < length; j++) {
	                List<Integer> a = new ArrayList<Integer>();
	                a.addAll(r.get(j));
	                a.add(nums[i]);
	                r.add(a);
	            }
	        }
	        return r;
	    }
	 public List<List<Integer>> subsets2(int[] nums) {
		 List<List<Integer>> re=new LinkedList<>();
		 re.add(new LinkedList<Integer>());
		 generate(nums,0,new LinkedList<Integer>(),re);
		 return re;
	 }
	  public void generate(int []nums,int index,LinkedList<Integer> li,List<List<Integer>> re) {
		  if(index>=nums.length)
			  return;
		  li.add(nums[index]);
		  re.add(new LinkedList<Integer>(li));
		  generate(nums,index+1,new LinkedList<Integer>(li),re); 
		  li.removeLast();
		  generate(nums,index+1,new LinkedList<Integer>(li),re); 
		
	  }
	  public static List<List<Integer>> subsets1(int[] nums) {
	        List<List<Integer>> ans = new LinkedList<>();
	        for (int i = 0; i <= nums.length; i++) {
	            dsf(ans, new LinkedList<>(), i, nums, 0);
	        }
	        return ans;
	    }
	    private static void dsf(List<List<Integer>> ans, LinkedList<Integer> item, int count, int[] nums,int index) {
	        if (item.size() == count){
	            ans.add(new ArrayList<>(item));
	            return;
	        }

	        for (int i = index; i < nums.length; i++) {
	            item.add(nums[i]);
	            dsf(ans, item, count, nums, i + 1);
	            item.removeLast();
	        }
	        
	    }
	    public List<List<Integer>> subsets3(int[] nums) {
	    	List<List<Integer>> list = new LinkedList<>();
	    	int all=(int) Math.pow(2, nums.length);
	    	for(int i=0;i<all;i++) {
	    		List<Integer> li=new LinkedList<>();
	    		for(int j=0;j<nums.length;j++) {
	    			if((i&(int)Math.pow(2, j))!=0)
	    				li.add(nums[j]);
	    		}
	    		list.add(li);
	    	}
	    	return list;
	    }
	public static void main(String[] args) {
		int []nums= {1,2,3,4};
		List<List<Integer>> l=new Subset().subsets3(nums);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	}

}
