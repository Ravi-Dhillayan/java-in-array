package arr;

import java.util.Scanner;

public class evensum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, s,i;
		Scanner r=new Scanner(System.in);
		System.out.println(" Enter the size of Array: ");
		s=r.nextInt();
		int a[]=new int[s];
		
		for(i=0;i<s;i++) {
			a[i]=r.nextInt();
			
		}
		//System.out.println("Even Elements   : ");
		for(i=0;i<s;i++) {
			if(a[i]%2==0) {
			sum=sum+a[i];
			}
			
		}
		System.out.println("even no. Sum = "+sum);
}
}
