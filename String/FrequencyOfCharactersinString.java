package String;

public class FrequencyOfCharactersinString {

	public static void frequency(String s) {
		int[] count=new int[26];
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				continue;
			else
			{
				count[s.charAt(i)-'a']++;
			}
		}
		for(int i=0;i<26;i++)
		{
			if(count[i]!=0)
			{
				System.out.println((char)(i+'a') +" has a frequency of "+count[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="ouokay";
        frequency(s);
	}

}
