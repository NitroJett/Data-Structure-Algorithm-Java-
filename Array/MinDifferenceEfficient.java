package Array;

public class MinDifferenceEfficient {

	public static int minDif(int[] a) {
		int n=a.length;
		int res=Integer.MIN_VALUE;
		int min_value=a[0];
		for(int i=1;i<n;i++) {
			res=Math.max(a[i]-min_value,res);
			min_value=Math.min(a[i], min_value);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a= {5,1,24,234,4,31,32,213};
       for(int i=0;i<a.length;i++)
     	  System.out.print(a[i]+" ");
       System.out.println();
       System.out.println(minDif(a));
	}

}
