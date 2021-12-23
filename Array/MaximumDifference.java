package Array;

public class MaximumDifference {

	public static int minDiff(int[] a) {
		int m=Integer.MIN_VALUE;
		int n=a.length;
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
			{
				m=Math.max(m,a[j]-a[i]);
			}
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] a= {5,6,1,3,4,12,4,25,42,21};
         for(int i=0;i<a.length;i++)
       	  System.out.print(a[i]+" ");
         int res=minDiff(a);
         System.out.println();
         System.out.println(res);
	}

}
