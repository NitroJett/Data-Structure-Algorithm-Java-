package Array;



//Kadane's Algorithm
public class MaximumSubarraySum {

	public static int maximumSubarraySum(int[] a) {
		int maxEnd=a[0]; 
		int res=a[0];
		for(int i=1;i<a.length;i++) {
			maxEnd=Math.max(maxEnd+a[i], a[i]);
			res=Math.max(res, maxEnd);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] a= {-2,-1};
         System.out.println(maximumSubarraySum(a));
	}

}
