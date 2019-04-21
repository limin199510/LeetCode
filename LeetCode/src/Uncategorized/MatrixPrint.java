package offer;

import java.util.ArrayList;

/*
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬�����������4 X 4���� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
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
