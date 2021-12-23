package Array;

public class SecondLargestEfficient {

	public static int secondLarge(int[] a,int n) {
		
		int sl=-1;
		int l=0;
		for(int i=1;i<n;i++) {
			if(a[i]>a[l])
			{
				sl=l;
				l=i;
			}
			else if(a[i]!=a[l]) {
				if(sl==-1 ||a[i]<a[l] )
					sl=i;
			}
		}
		return sl;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] a= {5,8,11,2,1,55};
         int n=a.length;
         
         System.out.println("Second Largest ->"+ a[secondLarge(a,n)]);
	}

}
