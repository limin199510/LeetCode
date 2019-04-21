package Heap;
/*
 * 在未排序的数组中找到第 k 个最大的元素。
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 * 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度
 */
public class HeapBuild {
	public void buildBigHeap(int []num) {
		int mid=num.length/2;
		for(int i=mid;i>0;i--) 
			heapAdjust(num,i,num.length);
		for(int i=num.length;i>1;i--) {
			int temp=num[i-1];
			num[i-1]=num[0];
			num[0]=temp;
			heapAdjust(num,1,i-1);
		}
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
		HeapBuild hb=new HeapBuild();
		int []num= {50,10,10,90,30,30,70,70,40,40,80,60,20};
		hb.buildBigHeap(num);
		for(int i=0;i<num.length;i++)
			System.out.println(num[i]);
	}
	

}
