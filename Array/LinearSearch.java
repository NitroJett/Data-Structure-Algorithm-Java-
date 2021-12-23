package Array;
import java.util.*;
public class LinearSearch {

	static int LSearch(int[] a,int x) {
	    for(int i=0;i<a.length;i++) {
	    	if(a[i]==x)                                                 //O(N)
	    		return i;
	    }
	    return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int[] a=new int[n];
           for(int i=0;i<n;i++) {
        	   a[i]=sc.nextInt();
           }
           int x=sc.nextInt();
           System.out.println(LSearch(a,x));
           sc.close();
	}

}
