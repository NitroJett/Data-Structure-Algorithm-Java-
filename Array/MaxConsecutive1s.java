package Array;

public class MaxConsecutive1s {

	static int maxCons1(int[] a) {
		int res=0;
		int curr=0;
		int n=a.length;
		for(int i=0;i<n;i++) {
			if(a[i]==0)
				curr=0;
			else {
				curr++;
				res=Math.max(curr, res);
			}
		}
		
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] a= {1,1,1,0,0,1,1,1,1,0,0,1,0};
        int ct= maxCons1(a);
        System.out.println(ct);
	}

}
