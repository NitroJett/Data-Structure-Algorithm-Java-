package Sorting;

public class InsertionSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a= {1,4,2,0,5};
         System.out.println("Initial Array");
         int n=a.length;
         for(int i=0;i<n;i++)
      	   System.out.print(a[i]+" ");
         
         insertSort(a,n);
         System.out.println();
         System.out.println("Final Array");
         for(int i=0;i<n;i++)
      	   System.out.print(a[i]+" ");

	}

	private static void insertSort(int[] a, int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<n;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}

}
