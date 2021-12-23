package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] a) {
		
		for(int i=0;i<a.length-1;i++)
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		   	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] a= {5,14,1};
          bubbleSort(a);
          System.out.println(Arrays.toString(a));
	}

}
