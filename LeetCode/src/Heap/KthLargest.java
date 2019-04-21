package Heap;
/*
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。

示例 1:

输入: [3,2,1,5,6,4] 和 k = 2
输出: 5
示例 2:

输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
输出: 4
 */
public class KthLargest {
	public int findKthLargest(int[] nums, int k) {
		int mid=nums.length/2;
		for(int i=mid;i>0;i--) 
			heapAdjust(nums,i,nums.length);
		//System.out.println(nums[0]);
		if(k==1)
			return nums[0];
		int count=k;
		for(int i=nums.length;i>1;i--) {
			if(count==1)
				break;
			int temp=nums[i-1];
			nums[i-1]=nums[0];
			nums[0]=temp;
			heapAdjust(nums,1,i-1);
			count--;
		}
		return nums[0];
    }
	public void heapAdjust(int []num,int i,int len) {
		int temp=num[i-1];//存储根节点的信息
		for(int j=2*i;j<=len;j*=2) {
			if(j<len&&num[j-1]<num[j]) {
				j++;//j存储左右孩子节点中最大的那个
			}
			if(temp>=num[j-1])//如果根节点数值大于孩子节点则结束遍历
				break;
			num[i-1]=num[j-1];//找到当前最大的数值赋给根节点
			i=j;//i记录最大数值原始的存储位置
		}
		num[i-1]=temp;
	}
	public static void main(String[] args) {
		int []nums= {3,2,1,5,6,4};
		System.out.println(new KthLargest().findKthLargest(nums, 2));
	}
}
