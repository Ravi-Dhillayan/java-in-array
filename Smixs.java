package arr;

import java.util.Scanner;

public class Smixs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d,i,n,j;
		int csum=0,fsum=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the array of size : ");
		n=ob.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++) {
			a[i]=ob.nextInt();
		}
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				csum+=a[j];
//				if(i<csum) {
//					fsum=csum;
//				}
			}
		}
		
			System.out.println(csum);
		
	}

}
