package Array;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {1,1,1,2,2,4,4,5,7,7}; 
       int res=removeDuplicate(a);
       for(int i=0;i<res;i++) {
    	   System.out.print(a[i]+" ");
       }
	}

	public static int removeDuplicate(int[] a) {
		// TODO Auto-generated method stub
		int res=1;
		for(int i=1;i<a.length;i++) {
			if(a[i]!=a[res-1]) {
				a[res]=a[i];
				res++;
			}
		}
		return res;
	}

}
