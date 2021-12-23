package Matrices;

import java.util.Arrays;

public class RotateMatrixBy90deg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
          rotateBy90(a);
          print(a);
	}

	private static void print(int[][] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
			
	}

	private static void rotateBy90(int[][] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) {
				if(i!=j)
				{
					int temp=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			int l=0;
			int r=a.length-1;
			while(l<r) {
				int temp=a[l][i];
				a[l][i]=a[r][i];
				a[r][i]=temp;
				l++;
				r--;
			}
		}
	}

}
