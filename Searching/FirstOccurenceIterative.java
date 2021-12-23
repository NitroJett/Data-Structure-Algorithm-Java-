package Searching;

public class FirstOccurenceIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] a= {0,0,0,3,3};
         int n=a.length;
         int x=3;
         System.out.println(firstOcc(a,n,x));
	}
	public static int firstOcc(int[] a,int n,int x) {
	
		int l=0;
		int r=n-1;
		while(l<=r) {
			int mid=(l+r)/2;
			
			if(a[mid]>x)
				r=mid-1;
			else if(a[mid]<x)
				l=mid+1;
			else {
				if(mid==0 || a[mid-1]!=a[mid])
					return mid;
				else
					r=mid-1;
			}
		}
		return -1;
	}

}
