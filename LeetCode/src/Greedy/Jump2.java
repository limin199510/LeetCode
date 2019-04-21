package Greedy;
/*
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 * 示例:输入: [2,3,1,1,4] 输出: 2
 * 解释: 跳到最后一个位置的最小跳跃数是 2。
 * 从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
 * 说明:假设你总是可以到达数组的最后一个位置。
 */
//当前到达的位置 下一次到达的位置
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
			nextreach=Math.max(i+nums[i], nextreach);//当前可以到达的最远的位置
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
			if(i>current) {//若无法再向前移动了，则更新跳跃。
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
