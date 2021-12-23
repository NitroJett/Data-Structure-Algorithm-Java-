package Array;

public class SecondLargest {

	static int getLargest(int[] a,int n) {
		int max=0;
		for(int i=1;i<n;i++) {
			if(a[i]>a[max])
				max=i;
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] a= {5,4,2,12,3,1};
         int n=a.length;
         
         int l=getLargest(a,n);
         //second largest
         int sl=secondLargest(a,n,l);
         
         System.out.println("Largest is->"+ a[l]);
         System.out.println("second Largest is->"+a[sl]);
	}
	public static int secondLargest(int[] a, int n,int l) {
		// TODO Auto-generated method stub
		int res=-1;
        for(int i=0;i<n;i++) {
       	 if(a[i]!=a[l]) {
       		 if(res==-1)
       			 res=i;
       		 else if(a[i]>a[res])
       			 res=i;
       	 }
        }
		return res;
	}

}
