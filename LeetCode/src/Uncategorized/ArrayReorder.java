package offer;
/*
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，
 * 偶数和偶数之间的相对位置不变。
 */
public class ArrayReorder {
	public void reOrderArray(int [] array) {
		int left=0;
		int index[]=new int[array.length];
		int val[]=new int[array.length];
		int i=0;
		while(left<array.length) {
			if(array[left]%2==0) {
				index[i]=left;
				val[i]=array[left];
				i++;	
			}else {
				if(i!=0) {//证明前面已经出现空位置待插入奇数
					array[index[0]]=array[left];
					int temp=left;
					int j=i;
					while(j>0) {
						array[temp]=val[j-1];
						index[j-1]=temp;
						temp--;j--;
					}
				}
			}
			left++;
		}
    }
}
