package Array;

public class MoveZerosToEnd {
	public static void main(String[] args) {
		int[]a = {0,0,1,4,7};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				for(int j=i+1;j<a.length;j++) {
					if(a[j]!=0) {
						int temp=a[j];
						a[j]=a[i];
						a[i]=temp;
						break;
					}
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
