package No16March;
/*
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 你可以假设 nums1 和 nums2 不会同时为空。
 */
public class MedianNum {
	public double existZero(int[] nums) {
		double median=-1;
		int i;
		if(nums.length%2==0) {
			 i=nums.length/2;
			 median=(nums[i]+nums[i-1])/2.0;
		 }else {
			 i=nums.length/2;
			 median=nums[i];
		 }
		return median;
	}
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m=nums1.length,n=nums2.length;
		if(m>n) {
			int[] temp=nums1;
			nums1=nums2;nums2=temp;
			int tmp=m;m=n;n=tmp;
		}
		int imin=0,imax=m,halfLen=(m+n+1)/2;
		while(imin<=imax) {
			int i=(imin+imax)/2;
			int j=halfLen-i;
			if(i<imax&&nums2[j-1]>nums1[i])
				imin=i+1;//i太小了
			else if(i>imin&&nums1[i-1]>nums2[j])
				imax=i-1;//i太大了
			else {
				int maxLeft=0;
				if(i==0)
					maxLeft=nums2[j-1];
				else if(j==0)
					maxLeft=nums1[i-1];
				else 
					maxLeft=Math.max(nums1[i-1],nums2[j-1]);
				if((m+n)%2!=0)
					return maxLeft;
				int minRight=0;
				if(i==m)
					minRight=nums2[j];
				else if(j==n)
					minRight=nums1[i];
				else
					minRight=Math.min(nums1[i], nums2[j]);
				return (maxLeft+minRight)/2.0;
					
			}
		}
		return 0.0;
	}
	
	public static void main(String[] args) {
		
	}
}
