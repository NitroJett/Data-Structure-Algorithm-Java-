package Array;

public class IsSorted {

	public static boolean isSorted(int[] a) {
		for(int i=1;i<a.length;i++)
			if(a[i-1]>a[i])
		return false;
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] a= {1,5,6,11};
           
           if(isSorted(a)) {
        	   System.out.println("Sorted");
           }else
        	   System.out.println("Not Sorted");
	}

}
