package Hashing;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] a= {10,20,30,20,10};
          int[] b= {20,30,10};
          System.out.println(naive(a,b));
	}

	private static int naive(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int res=0;
				for(int i=0;i<a.length;i++) {
					boolean is=false;
					for(int j=0;j<i;j++) {
						if(a[i]==a[j])
						{
							is=true;
							break;
						}
					}
					if(is==true)
						continue;
					
					for(int j=0;j<b.length;j++) {
						if(a[i]==a[j])
						{
							res++;
							break;
						}
					}
					
				}
				return res;
	}

}
