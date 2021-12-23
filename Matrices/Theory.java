package Matrices;

public class Theory {

	public static void jaggedArray() {
		int m=4;
		int n=3;
		int[][] a=new int[m][];
		for(int i=0;i<m;i++) {
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=i;
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6}};
		System.out.println("Normal Array");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nJagged Array");
		jaggedArray();
	}
}
