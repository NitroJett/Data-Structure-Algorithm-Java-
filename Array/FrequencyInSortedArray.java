package Array;

public class FrequencyInSortedArray {

	public static void frequency(int[] a) {
		int i=1,freq=1;
		int n=a.length;
		while(i<n) {
			while(i<n && a[i]==a[i-1]) {
				freq++;
				i++;
			}
			System.out.println(a[i-1]+" frequency="+freq);
			i++;
			freq=1;
		}
		if(n==1 || a[n-1]!=a[n-2])
			System.out.println(a[n-1]+" frequency=1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int[] a= {1,1,1,2,2,3,3,6};
		
		frequency(a);
	}

}
