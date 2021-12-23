package String;

public class PalindromeCheck2 {
	public static boolean checkPalindrome(String s) {
		StringBuilder s1=new StringBuilder(s);
		s1.reverse();
		return s.equals(s1.toString());
		
	}
	public static boolean checkPalindrom(String s) {
		String str="";
		for(int i=s.length()-1;i>=0;i--)
		{
			str+=s.charAt(i);
		}
		return s.equals(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="dad";
		System.out.println(checkPalindrome(s)); 
		System.out.println(checkPalindrom(s));
		
	}
}
