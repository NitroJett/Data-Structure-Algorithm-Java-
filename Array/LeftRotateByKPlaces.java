package Array;

public class LeftRotateByKPlaces {

	public static void leftRotate(int[] a,int n,int k) {
		int[] t=new int[k];
		for(int i=0;i<k;i++)
			t[i]=a[i];
		for(int i=k;i<n;i++)
			a[i-k]=a[i];
		for(int i=0;i<k;i++)
			a[n-k+i]=t[i];
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int[] a= {1,3,4,5,6,7,8,9};
            int n=a.length;
            int d=2%a.length;
            System.out.println("Inital");
            for(int i=0;i<a.length;i++) {
            	System.out.print(a[i]+" ");
            }
            System.out.println();
            System.out.println("rotating by d place left");
            
            leftRotate(a,n,d);
            for(int i=0;i<a.length;i++) {
            	System.out.print(a[i]+" ");
            }
	}

}
