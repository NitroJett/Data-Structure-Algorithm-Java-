package Searching;

public class LastOccurenceIterative {

	
	public static void main(String[] args) {
		int[] a= {1,1,3,3,6,6,6,6,7};
		int n=a.length;
		int x=6;
		System.out.println(lastOcc(a,n,x));
	}
	public static int lastOcc(int[] a,int n,int x) {
		int l=0;
		int r=n-1;
		while(l<=r) {
			int mid=(l+r)/2;
			if(a[mid]>x)
				r=mid-1;
			else if(a[mid]<x)
				l=mid+1;
			else {
				if(mid==n-1 || a[mid]!=a[mid+1])
					return mid;
				else
					l=mid+1;
			}
		}
		return -1;
	}
}
