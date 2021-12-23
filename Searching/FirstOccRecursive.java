package Searching;

public class FirstOccRecursive {
	public static int firstRecOcc(int[] a,int x,int l,int r) {
		if(l>r)
			return -1;
		int mid=(l+r)/2;
		if(a[mid]>x)
	      return firstRecOcc(a,x,l,mid-1);
		else if(a[mid]<x)
			return firstRecOcc(a,x,mid+1,r);
		else {
			if(mid==0 || a[mid-1]!=a[mid])
				return mid;
			else
				return firstRecOcc(a,x,mid-1,r);
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] a= {1,3,3,5,5,5,5};
          int n=a.length;
          int x=5;
          System.out.println(firstRecOcc(a,x,0,n-1));
	}

}
