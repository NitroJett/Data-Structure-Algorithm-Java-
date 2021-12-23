package String;

public class PatternSearching {

	public static void Naive(String txt,String pat) {
		//Sliding Window
		int n=txt.length();
		int m=pat.length();
		for(int i=0;i<=n-m;i++)
		{
			int j;
			for(j=0;j<m;j++) 
			{
				if(pat.charAt(j)!=txt.charAt(i+j)) 
				{
					break;
				}
			}
			if(j==m)
				System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String txt="ABCABCDABCD";
         String pat="ABCD";
         Naive(txt,pat);
	}

}
