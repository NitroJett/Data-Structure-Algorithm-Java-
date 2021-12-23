package Sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a= {5,6,7,8,0,1,2,3,4};
         System.out.println("Initial Array");
         int n=a.length;
         for(int i=0;i<n;i++)
      	   System.out.print(a[i]+" ");
         int l=0;
         int r=a.length-1;
         int mid=3;
         mergeSort(a,l,r,mid);
         System.out.println();
         System.out.println("Final Array");
         for(int i=0;i<n;i++)
      	   System.out.print(a[i]+" ");
         
	}

	private static void mergeSort(int[] a, int l, int r, int mid) {
		// TODO Auto-generated method stub
		int n1=mid-l+1;
		int n2=r-mid;
		int[] left=new int[n1];
		int[] right=new int[n2];
		for(int i=0;i<n1;i++)
			left[i]=a[i+l];
		for(int i=0;i<n2;i++)
			right[i]=a[mid+i+1];
		int i=0,j=0,k=0;
		while(i<n1 && j<n2) {
			if(left[i]<=right[j]) {
				a[k]=left[i];
				i++;
				k++;
			}else {
				a[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<n1) {
			a[k]=left[i];
		    i++;
			k++;
		}
		while(j<n2) {
			a[k]=right[j];
			j++;
			k++;
		}
		
	}

}
