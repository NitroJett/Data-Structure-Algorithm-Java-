package Array;
import java.util.Scanner;
public class Insert {

	public static void insert(int[] a,int x,int pos) {
		int idx=pos-1;
		if(pos==a.length)
			return;
		for(int i=a.length-1;i>=idx;i--) {
			a[i]=a[i-1];
		}
		a[idx]=x;
	}
	public static void display(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int[] a=new int[n];
           int t=sc.nextInt();
           for(int i=0;i<t;i++)
           {
        	   a[i]=sc.nextInt();
           }
           int x=sc.nextInt();
           int pos=sc.nextInt();
           
           insert(a,x,pos);
           display(a);
           sc.close();
	}

}
