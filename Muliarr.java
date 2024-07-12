package arr;
import java.util.Scanner;
//import java.lang.Math;
//public class HelloWorld{

public class Muliarr {
	
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
			System.out.print(a[i]+" ");
		}
	int anew[]=new int[s];
		for(i=0;i<s;i++) {
		    if(i==0)
		    f=1;
		    else
		    f=anew[i-1];
			anew[i]=a[i]*f;
		}
	System.out.println("\nPrinted new Array Elements  : ");
		for(i=0;i<s;i++) {
			System.out.print(anew[i]+" ");
		}
		}
	}
