import java.util.Scanner;
public class Main
{
    public static int binarySearchI(int[] a,int n,int find){
        int l=0;
        int r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]==find)
            return mid;
            else if(a[mid]>find)
            r=mid-1;
            else
            l=mid+1;
        }
        return -1;
    }
    public static int binarySearchR(int[] a,int n,int find,int l,int r){
        if(l>r)
        return -1;
        int mid=l+(r-l)/2;
        if(a[mid]==find)
        return mid;
        else if(a[mid]>find){
            return binarySearchR(a,n,find,l,mid-1);
        }else return binarySearchR(a,n,find,mid+1,r);
        
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int find=5;
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
		{
		    a[i]=i+1;
		}
		
		System.out.println(binarySearchI(a,n,find));
		System.out.println(binarySearchR(a,n,find,0,n-1));
	}
}
