package Array;

public class LeftRotateByReversealMethod {

	public static void leftRotate(int[] a,int n,int d) {
		reverse(a,0,d-1);
		reverse(a,d,n-1);
		reverse(a,0,n-1);
	}
	public static void reverse(int[] a,int low,int high) {
		while(low<high) {
			int t=a[low];
			a[low]=a[high];
			a[high]=t;
			low++;
			high--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] a= {1,2,3,4,5,6,7};
          int n=a.length;
          int d=4;
          System.out.println("Inital");
          for(int i=0;i<a.length;i++) {
          	System.out.print(a[i]+" ");
          }
          leftRotate(a,n,d);
          System.out.println("After Rotate");
          for(int i=0;i<a.length;i++) {
          	System.out.print(a[i]+" ");
          }
          
	}

}
