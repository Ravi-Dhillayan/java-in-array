package arr;


//Write a program that creates integer array of 10 elements, accepts values of arrays and Find sum of all odd numbers
import java.util.Scanner;

public class oddar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, s,i,min,max;
		Scanner r=new Scanner(System.in);
		System.out.println(" Enter the size of Array: ");
		s=r.nextInt();
		int a[]=new int[s];
		
		for(i=0;i<s;i++) {
			a[i]=r.nextInt();
			
		}
		//System.out.println("Even Elements   : ");
		for(i=0;i<s;i++) {
			if(a[i]%2!=0) {
			sum=sum+a[i];
			}
			
		}
		System.out.println("Odd no. Sum = "+sum);

}
}
