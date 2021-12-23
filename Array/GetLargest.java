package Array;

public class GetLargest {

	public static int largestE1(int[] a) {
		int max=a[0];
		for(int i=1;i<a.length;i++) {                                        //efficient approach
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}
	public static int largestE2(int[] a) {
		for(int i=0;i<a.length;i++) {
			boolean flag=true;
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j])
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
				return a[i];
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,6,10,13,24,3,1};
		
		System.out.println(largestE1(a));           //efficient
		
		System.out.println(largestE2(a));           //naive

	}

}
