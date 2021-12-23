package Matrices;

public class PrintMatrixinSnakePattern {

	public static void snake(int[][] a) {
		System.out.println("Snake Pattern");
		for(int i=0;i<a.length;i++) {
				if(i%2==0)
				{
					for(int j=0;j<a[i].length;j++)
					{
						System.out.print(a[i][j]+" ");
					}
				}else {
					for(int j=a[i].length-1;j>=0;j--) {
						System.out.print(a[i][j]+" ");
					}
				}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int m=4;
         int[][] a=new int[n][m];
         for(int i=0;i<n;i++)
        	 for(int j=0;j<n;j++)
        		 a[i][j]=(int)Math.floor(Math.random()*10);
         
         System.out.println("Initially Array");
         for(int i=0;i<n;i++) {
        	 for(int j=0;j<n;j++)
        		 System.out.print(a[i][j]+" ");
        	 System.out.println();
         }
         System.out.println();
         
         snake(a);
        	 
	}

}
