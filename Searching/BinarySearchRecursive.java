package Searching;

public class BinarySearchRecursive {

	public static int RbSearch(int[] a,int x,int l,int r) {
		
		if(l>r)
			return -1;
		int mid=(l+r)/2;
		if(a[mid]==x)
			return mid;
		else if(a[mid]>x)
			return RbSearch(a,x,l,mid-1);
		else
			return RbSearch(a,x,mid+1,r);
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a= {1,2,3,4,5,6};
       int n=a.length;
       int x=6;
       System.out.println("Element present at");
       System.out.print(" "+ RbSearch(a,x,0,n-1));
	}

}
