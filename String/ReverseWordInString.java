package String;

import java.util.Stack;

public class ReverseWordInString {

	public static void reverseWord(String s) {
		Stack<String> st=new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			String word="";
			while(i<s.length() && s.charAt(i)!=' ')
			{
				word+=s.charAt(i);
				i++;
			}
			st.push(word);
		}
		while(!st.isEmpty()) {
			System.out.print(st.peek()+" ");
			st.pop();
		}
System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Hey, how are you doing?";
        reverseWord(s);
        System.out.println(s);
	}

}
