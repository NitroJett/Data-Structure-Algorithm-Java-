package Searching;

public class CountOccurencesinArray {
//O(N)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] a= {2,2,2,2,2};
          int n=a.length;
          int x=2;
          int fo=fOcc(a,n,x,0,n-1);
          int lo=lOcc(a,n,x,0,n-1);
          System.out.println(fo +" "+ lo);
          int ct=count(fo,lo);
          System.out.println(ct);
	}
     public static int count(int fo,int lo) {
    	 if(fo==-1)
    		 return 0;
    	 return lo-fo+1;
     }
	public static int fOcc(int[] a, int n, int x,int l,int r) {
		// TODO Auto-generated method stub
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

	public static int lOcc(int[] a, int n, int x,int l,int r) {
		// TODO Auto-generated method stub
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
