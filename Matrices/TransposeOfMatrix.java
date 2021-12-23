package Matrices;

public class TransposeOfMatrix {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Initial Array");
        print(a);
        System.out.println("Naive Array");
        transpose(a);
        System.out.println("efficient");
        transposeEfficient(a);
	}

	private static void transposeEfficient(int[][] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(i!=j) {
					int temp=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;
				}
			}
		}
		print(a);
	}

	private static void transpose(int[][] a) {
		// TODO Auto-generated method stub
		int[][] temp=new int[a.length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				temp[i][j]=a[j][i];
			}
		}
		print(temp);
	}

	private static void print(int[][] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		
	}

}
