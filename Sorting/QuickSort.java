package Sorting;

public class QuickSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a= {1,4,2,0,5};
         System.out.println("Initial Array");
         int n=a.length;
         for(int i=0;i<n;i++)
      	   System.out.print(a[i]+" ");
         int l=0,r=n-1;
         quickSort(a,l,r);
         System.out.println();
         System.out.println("Final Array");
         for(int i=0;i<n;i++)
      	   System.out.print(a[i]+" ");

	}

	private static void quickSort(int[] a, int l,int r) {
		// TODO Auto-generated method stub
		if(l>=r)
			return;
		int p_idx=partition(a,l,r);
		quickSort(a,l,p_idx-1);
		quickSort(a,p_idx+1,r);
		
	}

	private static int partition(int[] a, int l, int r) {
		// TODO Auto-generated method stub
		int pivot=a[r];
		int i,j=l;
		for(i=l;i<=r;i++) {
			if(pivot>=a[i])
			{
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				j++;
			}
		}
		return j-1;
	}
}
