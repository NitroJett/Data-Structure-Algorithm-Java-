package Array;

public class MoveZeroEfficient {

	public static void moveZero(int[] a) {
		int n=a.length;
		int ct=0;
		for(int i=0;i<n;i++) {
			if(a[i]!=0) {
				int temp=a[i];
				a[i]=a[ct];
				a[ct]=temp;		
				ct++;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {5,2,0,1,0,0,3,5,1,0};
        System.out.println("initial array");
        for(int i=0;i<a.length;i++)
        	System.out.print(a[i]+" ");
        moveZero(a);
        System.out.println();
        for(int i=0;i<a.length;i++)
        	System.out.print(a[i]+" ");
        
	}

}
