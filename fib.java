package arr;

import java.util.Scanner;

public class fib {
	public static void main(String[] args) {
		// FIBONACCI
		long num,term1=0 ,term2=1,nt,s;
		int i;
		Scanner r=new Scanner(System.in);
  long arr[]=new long[30];

			

		System.out.println("Printed Array Elements  : ");
		System.out.println("Enter the  N no. of Fibonacci : ");
		Scanner o8=new Scanner(System.in);
		num=o8.nextLong();
		System.out.println("Value of the Fibonacci Series : ");
		for(i=1;i<num;++i) {
			arr[i]=term1;
		//System.out.println(arr[i]);
		
		nt=term1+term2;
		term1=term2;
		term2=nt;
		System.out.println(arr[i]);
		}
		}

}
