package Array;

public class LeftRotateByOne {

	public static void leftRotateByOne(int[] a) {
		int t=a[0];
		int n=a.length;
		for(int i=1;i<n;i++) {
			a[i-1]=a[i];
		}
		a[n-1]=t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int[] a= {1,2,3,4,5,6,7};
             
             int n=a.length;
             System.out.println("Inital array");
             for(int i=0;i<n;i++) {
            	 System.out.print(a[i]+" ");
             }
             leftRotateByOne(a);
             System.out.println();
             for(int i=0;i<n;i++) {
            	 System.out.print(a[i]+" ");
             }
	}

}
