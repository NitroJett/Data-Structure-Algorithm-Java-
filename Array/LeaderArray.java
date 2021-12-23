package Array;

public class LeaderArray {

	public static void leaderArray(int[] a) {
		int n=a.length;
		int t=a[n-1];
		int[] temp=new int[n];
		temp[0]=a[n-1];
		int ct=1;
		System.out.println();
		for(int i=n-2;i>=0;i--) {
			if(a[i]>t) {
				t=a[i];
				temp[ct]=t;
				ct++;
			}
		}
		for(int i=0;i<ct;i++)
			System.out.print(temp[i]+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  int[] a= {7,6,1,4,11,4,5,1};
                  System.out.println("Initial array");
                  for(int i=0;i<a.length;i++)
                	  System.out.print(a[i]+" ");
                  leaderArray(a);
                  
                  
	}

}
