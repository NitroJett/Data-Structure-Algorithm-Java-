package Searching;

public class LastOccRecursive {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,3,5,5,5,5};
        int n=a.length;
        int x=5;
        System.out.println(lastRecOcc(a,x,0,n-1));
	}

	public static int lastRecOcc(int[] a, int x, int l, int r) {
		// TODO Auto-generated method stub
		if(l>r)
			return -1;
		int mid=(l+r)/2;
		if(a[mid]>x)
			return lastRecOcc(a,x,l,mid-1);
		else if(a[mid]<x) {
			return lastRecOcc(a,x,mid+1,r);
		}else {
			if(mid==a.length-1 || a[mid]!=a[mid+1])
				return mid;
			else
				return lastRecOcc(a,x,mid+1,r);
		}
	}

}
