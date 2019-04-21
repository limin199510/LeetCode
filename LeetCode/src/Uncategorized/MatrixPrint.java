package offer;

import java.util.ArrayList;

/*
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class MatrixPrint {
	public ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> al=new ArrayList<>();
		int l=matrix[0].length,w=matrix.length;
		int count=(int)Math.ceil(Math.min(l, w)/2.0);
		for(int i=0;i<count;i++) {
			for(int j=i;j<l-i;j++)
				al.add(matrix[i][j]);
			for(int j=i+1;j<w-i;j++)
				al.add(matrix[j][l-i-1]);
			for(int j=l-i-2;j>=i&&w-i-1!=i;j--)
				al.add(matrix[w-i-1][j]);
			for(int j=w-i-2;j>i&&l-i-1!=i;j--)
				al.add(matrix[j][i]);
		}
		return al;

    }
	public static void main(String[] args) {
		int [][]a= {{1}};
		MatrixPrint mp=new MatrixPrint();
		ArrayList<Integer> al=mp.printMatrix(a);
		System.out.println(al.size());
		
	}
}
