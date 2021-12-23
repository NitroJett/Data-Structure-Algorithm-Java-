package Searching;

public class BinarySearchIterative {

	public static int bSearch(int[] a,int n,int e) {
		int l=0;
		int r=n-1;
		while(l<=r) {
			int mid=(l+r)/2;
			if(a[mid]==e)
				return mid;
			else if(a[mid]>e)
				r=mid-1;
			else
				l=mid+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {10,15,20,30,45,67};
        int n=a.length;
        int element=16;
        System.out.println("ELement present at index "+bSearch(a,n,element));
	}

}
