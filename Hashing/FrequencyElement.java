package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {10,20,20,10,30};
        naive(a);
        System.out.println("Efficient");
        efficient(a);
	}

	private static void efficient(int[] a) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		for(int x:a)
			h.put(x,h.getOrDefault(x, 0)+1);
		for(Map.Entry<Integer,Integer> e: h.entrySet())
			System.out.println(e.getKey()+" "+e.getValue());
		
	}

	private static void naive(int[] a) {
		// TODO Auto-generated method stub
		int ct=0;
		for(int i=0;i<a.length;i++)
		{
			boolean is=false;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					is=true;
					break;
				}
			}
			if(is==true)
				continue;
			
			 ct=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					ct++;
			}
			
			System.out.print(a[i]+" "+ct);
			System.out.println();
		}
	}

}
