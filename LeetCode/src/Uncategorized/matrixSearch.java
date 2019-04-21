package offer;
/*
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 */
public class matrixSearch {
	public boolean reBinSearch(int arr[],int target,int start,int end) {
		if(target<arr[start]||target>arr[end]||start>end)
			return false;
		int mid=(start+end)/2;
		if(arr[mid]==target)
			return true;
		else if(arr[mid]>target) {
			return reBinSearch(arr,target,start,mid-1);
		}else {
			return reBinSearch(arr,target,mid+1,end);
		}
	}
	public boolean dirBinSearch(int arr[],int target,int start,int end) {
		while(start<=end&&target>=arr[start]&&target<=arr[end]) {
			int mid=(start+end)/2;
			if(arr[mid]==target)
				return true;
			else if(arr[mid]>target)
				end=mid-1;
			else
				start=mid+1;
		}
		return false;
	}
	

	public static void main(String[] args) {
		int arr[][]= {{1,2},{2,3},{2,5},{4,6},{5,9},{6,9}};
		int target=6;
		matrixSearch ms=new matrixSearch();
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(ms.dirBinSearch(arr[i], target, 0, arr[i].length-1)) {
				flag=true;
				break;
			}
		}
		System.out.println(flag);
		
	}
}
