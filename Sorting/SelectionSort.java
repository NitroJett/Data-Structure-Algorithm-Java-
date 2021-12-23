package Sorting;

import java.util.Arrays;
//Time-O(N^2)
public class SelectionSort {

	public static void selectionSort(int[] a) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			int min_idx=i;
			for(int j=i+1;j<n;j++) {
				if(a[min_idx]>a[j])
					min_idx=j;
			}
			int temp=a[min_idx];
			a[min_idx]=a[i];
			a[i]=temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {5,1,3,6,1,0,-2,0};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
	}

}
