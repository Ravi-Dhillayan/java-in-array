     //Write a program which takes in 10 values and creates another array which has cubes of the values (or factorial) and prints it
package arr;

import java.util.Scanner;

public class cube_arr {
	public static void main(String ar[])
	{
		
		int f=1, s,i;
	Scanner r=new Scanner(System.in);
	System.out.println(" Enter the size of Array: ");
	s=r.nextInt();
	int a[]=new int[s];
	
	for(i=0;i<s;i++) {
		a[i]=r.nextInt();
		
	}
	System.out.println("Printed Array Elements  : ");
	for(i=0;i<s;i++) {
		System.out.println(a[i]+" ");
	}
	
	for(i=0;i<s;i++) {
//		for(int j=1;j<=s;j++) {
		f=f*a[i];
//	}
	
	
	}
	System.out.println(f);
	f=1;
	}
}
