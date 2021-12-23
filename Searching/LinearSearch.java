package Searching;

public class LinearSearch {

	public static int lSearch(int[] a,int n,int x) {
		for(int i=0;i<n;i++) {
			if(a[i]==x)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] a= {1,41,24,12,3,21,2,31,1};
         int n=a.length;
         for(int i=0;i<n;i++) {
        	 System.out.print(a[i]+" ");
         }
         int x=3;
         System.out.println();
         System.out.println("element present at index->"+ lSearch(a,n,x));
	}

}
