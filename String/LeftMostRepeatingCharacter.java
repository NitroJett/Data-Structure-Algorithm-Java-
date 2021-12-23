package String;

import java.util.Arrays;

public class LeftMostRepeatingCharacter {

	public static final int CHAR=256;
	public static int leftMostNaive(String s1) {
		
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<s1.length();j++) {
				if(s1.charAt(i)==s1.charAt(j))
					return i;
			}
		}
		return -1;
	}
	public static int leftMost(String s1) {
		int[] count=new int[CHAR];
		for(int i=0;i<s1.length();i++)
			count[s1.charAt(i)]++;
		                                                                                         //better approach
		for(int i=0;i<s1.length();i++)
		{
			if(count[s1.charAt(i)]>1)
				return i;
		}	
		return -1;
	}
	public static int leftMostEff1(String s1) {
		int res=Integer.MAX_VALUE;
		int[] findex=new int[CHAR];
		Arrays.fill(findex,-1);
		for(int i=0;i<s1.length();i++) {
			int f=findex[s1.charAt(i)];
			if(f==-1)
				findex[s1.charAt(i)]=i;
			else
				res=Math.min(res, f);
			
		}
		
		return res==Integer.MAX_VALUE?-1:res;
	}
	public static int leftMostEff2(String s2) {
		int res=-1;
		boolean[] ch=new boolean[CHAR];
		for(int i=s2.length()-1;i>=0;i--)
		{
			if(ch[s2.charAt(i)])
			{
				res=i;
			}
			else
				ch[s2.charAt(i)]=true;	
		}
		
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1="abcbc";
         System.out.println(leftMostNaive(s1));
         System.out.println(leftMost(s1));
         System.out.println(leftMostEff1(s1));       //traversing from left
         System.out.println(leftMostEff2(s1));       //traversing from right
	}

}
