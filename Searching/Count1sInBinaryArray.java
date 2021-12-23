package Searching;

public class Count1sInBinaryArray {
//O(N)->O(logN)
	public static int firstOcc(int[] a) {
		int n=a.length;
		int l=0;
		int r=n-1;
		while(l<=r) {
			int mid=(l+r)/2;
			if(a[mid]>1)
				r=mid-1;
			else if(a[mid]<1)
				l=mid+1;
			else {
				if(mid==0 || a[mid]!=a[mid-1])
					return mid;
				else
					r=mid-1;
			}
		}
		return -1;
	}
	public static int count1s(int[] a) {
		
		return firstOcc(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {0,0,0,1,1,1,1,1,1,1};
        int n=a.length;
        int c1=count1s(a);
        if(c1==-1)
        	System.out.println("0");
        else
        	System.out.println(n-c1);
	}

}
