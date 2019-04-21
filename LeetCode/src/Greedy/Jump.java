package Greedy;
/*
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 判断你是否能够到达最后一个位置。
 * 示例 1:输入: [2,3,1,1,4]输出: true
 * 解释: 从位置 0 到 1 跳 1 步, 然后跳 3 步到达最后一个位置。
 * 示例 2:输入: [3,2,1,0,4]输出: false
 * 解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
 */
public class Jump {
	public boolean canJump(int[] nums) {
		int index=0;
		for(int i=0;i<nums.length;) {
			if(i+nums[i]>index)
				index=i+nums[i];//记录当前最多可以到达的位置
			if(i+nums[i]>=nums.length-1) {
				return true;//如果当前跳的位置已经超越了最后一个数 则返回true
			}else if(nums[i]!=0){
				i++;//只要当前跳跃的步数不为0 则继续下一个位置
			}else  {//如果当前位置的跳跃步数为0，则要看最多可以到达的位置是否能够漫过0这个位置。
				if(index>i) {
					i++;
				}else {
					return false;
				}
			}
		}
        return false;
    }
	public static void main(String[] args) {
		int []nums= {1,1,2,2,0,1,1};
		System.out.println(new Jump().canJump(nums));
		//[1,1,2,2,0,1,1]
	}
}
