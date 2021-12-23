package Array;

public class ReverseArray {

	public static int[] reverseArray(int[] a) {

		int l=0;
		int h=a.length-1;
		while(l<h) {
			int temp=a[h];
			a[h]=a[l];
			a[l]=temp;
			l++;
			h--;
		}
		
		
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int[] a= {5,2,1,8,9,11};
            
            reverseArray(a);
            for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
	}

}
