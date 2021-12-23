package Array;

public class DeleteElement {

	public static int deleteEle(int[] a,int n,int delete) {
		int i;
		for(i=0;i<n;i++) {
			if(a[i]==delete)
				break;
		}
		if(i==n)
			return i;
		for(int j=i;j<n-1;j++)
		{
			a[j]=a[j+1];
		}
		
		return n-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] a= {1,2,3,4,5,6};
           int n=6;
           int delete=5;
           
           System.out.println("BEfore Deletion");
           for(int i=0;i<n;i++) {
        	   System.out.print(a[i]+" ");
           }
           System.out.println();
           n=deleteEle(a,n,delete);
           System.out.println("After Deletion");
           for(int i=0;i<n;i++) {
        	   System.out.print(a[i]+" ");
           }
	}

}
