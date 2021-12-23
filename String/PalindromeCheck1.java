package String;

public class PalindromeCheck1 {
//OPTIMISED
	public static boolean checkPalindrome(String s) {
		int l=0;
		int r=s.length()-1;
		while(l<r)
		{
			if(s.charAt(l)!=s.charAt(r))
				return false;
			l++;
			r--;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="dad";
		System.out.println(checkPalindrome(s)); 
		

	}

}
