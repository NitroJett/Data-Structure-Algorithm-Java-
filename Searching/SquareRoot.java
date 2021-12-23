package Searching;

public class SquareRoot {

	public static int squareRoot(int n) {
		int i=1;
		while(i*i<=n) {
			i++;
		}
		return i-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n=15;
          System.out.println(squareRoot(n));
	}

}
