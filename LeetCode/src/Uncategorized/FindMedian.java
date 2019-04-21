package LeetCode;

public class FindMedian {
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 double median=0.0;
		 int m=nums1.length,n=nums2.length;
		 if(m>n) {
			 int []temp=nums1;nums1=nums2;nums2=temp;
			 int tmp=m;m=n;n=tmp;
		 }
		 int imin=0,imax=m,halfLen=(m+n+1)/2;
		 while(imin<=imax) {
			 int i=(imin+imax)/2;
			 int j=halfLen-i;
			 
			 if(i>imin&&nums1[i-1]>nums2[j])// i too big
				 imax=i-1;
			 else if(i<imax&&nums2[j-1]>nums1[i])//i too small
				 imin=i+1;
			 else {
				 double maxLeft=0,minRight=0;
				 if(i==0) 
					 maxLeft=nums2[j-1];
				 else if(j==0) 
					 maxLeft=nums1[i-1];
				 else 
					 maxLeft=Math.max(nums1[i-1], nums2[j-1]);
				if((m+n)%2!=0)
					return maxLeft;
				if(i==m)
					minRight=nums2[j];
				else if(j==n)
					minRight=nums1[i];
				else 
					minRight=Math.min(nums1[i], nums2[j]);
				median=(maxLeft+minRight)/2.0;
				return median;
				}
			 }
		 
		 return median;
	 }
}
