package Searching;

public class SearchInRotatedArray {

	public static int search(int[] a,int x) {
		 int n=a.length;
	        int l=0;
	        int r=n-1;
	        while(l<=r){
	            int mid=(l+r)/2;
	            if(a[mid]==x)
	                return mid;
	            if(a[l]<=a[mid]){
	                if(a[l]<=x &&  x<a[mid])
	                    r=mid-1;
	                else
	                    l=mid+1;
	            }
	            else if(a[mid]<=a[r]){
	                if(x>a[mid] && x<=a[r])
	                    l=mid+1;
	                else
	                    r=mid-1;
	            }
	        }
	     return -1;   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a= {3,0,1,5};
       int target=1;
       System.out.println(search(a,target));
	}

}
