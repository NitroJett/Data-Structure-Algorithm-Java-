package Hashing;

import java.util.HashSet;

public class DistinctElement {

	
	public static void main(String[] args) {
          int[] a= {5,1,2,2,8,1,2,3,4,5};
          System.out.println(naive(a));
          System.out.println(distinct(a));
	}
	
	private static int distinct(int[] a) {
		HashSet<Integer> s=new HashSet<>();
		for(int i=0;i<a.length;i++)
			s.add(a[i]);
		
		return s.size();
		
	}
	
	private static int naive(int[] a) {
		int ct=0;
		for(int i=0;i<a.length;i++) {
			boolean b=false;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					b=true;
					break;
				}
			}
			if(b==false)
				ct++;
		}	
		return ct;
	}

}
