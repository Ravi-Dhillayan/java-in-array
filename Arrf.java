package arr;

import java.util.Scanner;

public class Arrf {
	public static void main(String []args) {
		int d,i,n,isf=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the array size :");
		d=ob.nextInt();
		int da[]=new int[d];
		for(i=0;i<d;i++) {
			da[i]=ob.nextInt();
			
		}
		System.out.println("Enter the search no:");
		n=ob.nextInt();
		isf=0;
		for(i=0;i<d;i++) {
			if(da[i]==n)
			{
				System.out.println(i+1);
				isf=1;
			}
			
		}
		if(isf==0) {
			System.out.println("no search");
		}
//		int a[]= {1,2,3,4,5,6,7,7,8};
//		System.out.println(a[6]);
//		int a[]=new int[6];
//		a[0]=10;
//		a[1]=2;
//		a[2]=430;
//		a[3]=50;
//		a[4]=60;
//
//		for(int i=0;i<5;i++) {
//			System.out.println(a[i]);
//			int size,i;
//		Scanner o=new Scanner(System.in);
//		System.out.println("Enter the size of Array : ");
//		size = o.nextInt();
//		int a[]=new int[size];
//		
//		for(i=0;i<size;i++) {
//			a[i]=o.nextInt();
//		}
//		System.out.println("Printed Array Elements :");
//		for(i=0;i<size;i++) {
//			System.out.println(a[i]+" ");
//		
//		}
	}

}
