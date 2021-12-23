package Matrices;

import java.util.ArrayList;

public class SearchInRowWiseAndColumnWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] a= {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int x=25;
        search(a,x);
	}

	private static void search(int[][] a, int x) {
		// TODO Auto-generated method stub
		int l=0;
		int r=a.length-1;
		while(l<a.length && r>=0) {
			if(a[l][r]==x)
			{
				System.out.println(l+" found "+r);
				return;
			}
			else if(a[l][r]>x)
				r--;
			else
				l++;
		}
		System.out.println("Not Found");
		
	}

}
