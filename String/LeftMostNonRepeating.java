package String;

import java.util.Arrays;

public class LeftMostNonRepeating {

	public static int naive(String s) {
		for(int i=0;i<s.length();i++) {
			boolean flag=true;
			for(int j=0;j<s.length();j++)
			{
				if(i!=j && s.charAt(i)==s.charAt(j))
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="yourDadyHornyu";
		System.out.println(naive(s));
		System.out.println(efficient(s));

	}
	private static int efficient(String s) {
		// TODO Auto-generated method stub
		int[] findex=new int[256];
		Arrays.fill(findex, -1);
		for(int i=0;i<s.length();i++) {
			if(findex[s.charAt(i)]==-1)
				findex[s.charAt(i)]=i;
			else
				findex[s.charAt(i)]=-2;	
		}
		int res=Integer.MAX_VALUE;
		for(int i=0;i<256;i++)
		{
			if(findex[i]>=0)
			{
				res=Math.min(res,findex[i]);
			}
		}
		return res==Integer.MAX_VALUE?-1:res;
	}

}
