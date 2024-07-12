//Write a program that creates integer array of 10 elements, accepts values 
        //   of arrays and Find Sum, Average, Min, Max.
package arr;

import java.util.Scanner;

public class asum1 {
	public static void main(String[] args) {

		int sum=0, s,i,min,max;
		Scanner r=new Scanner(System.in);
		System.out.println(" Enter the size of Array: ");
		s=r.nextInt();
		int a[]=new int[s];
		
		for(i=0;i<s;i++) {
			a[i]=r.nextInt();
			
		}
		System.out.println("Printed Array Elements  : ");
		min=max=a[0];
		for(i=0;i<s;i++) {
			System.out.println(a[i]+" ");
			sum=sum+a[i];
			if(min>a[i])
			{
				min=a[i];
				
			}
			if(max<a[i]) {
				max=a[i];
			}
			
			
		}
		int average = sum/a.length;
		System.out.println("Sum = "+sum);
		System.out.println("average "+average);
		System.out.println("min"+min);
		System.out.println("max"+max);
		}
}
