package String;

import java.util.Arrays;

public class checkAnagram {

	public static boolean anagram(String s1,String s2) {
		if(s1.length()!=s2.length())
			return false;                                              //Time-O(nlogN)
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		s1=new String(c1);
		s2=new String(c2);
		
		return s1.equals(s2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1="are you crazzy ";
         String s2="rea yuo cryazz      ";
         System.out.println(anagram(s1,s2));
         System.out.println(efficient(s1,s2));
	}
	public static boolean efficient(String s1, String s2) {
		// TODO Auto-generated method stub
		int[] count=new int[256];
		if(s1.length()!=s2.length())
			return false;
		for(int i=0;i<s1.length();i++) {                                              ///Time-O(N)
			                                                                          // O(char[] 256)
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		for(int i=0;i<256;i++)
		{
			if(count[i]!=0)
				return false;
		}
		return true;
	}

}
