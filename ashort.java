package arr;

import java.util.Scanner;

public class ashort {

	public static void main(String[] args) {
		int n,i,j,t;
		System.out.println("Enter the NO :");
		Scanner o=new Scanner(System.in);
		n=o.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Unshorted array: ");
		for(i=0;i<n;i++) {
			a[i]=o.nextInt();
		}
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
			}
		}
		System.out.println();
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
			
		}


		// TODO Auto-generated method stub
		int temp;
		System.out.println("Enter the No. :");
//		Scanner o=new Scanner(System.in);
		n=o.nextInt();
//		int a[]=new int[n];
		System.out.println("Enter the Unshorted array :");
		for(i=0;i<n;i++) {
			a[i]=o.nextInt();
			}
		
	    for(i=0;i<n;i++) {
	    	
	    		for(j=i+1;j<n;j++) {
	    			if(a[i]>a[i+1]) {
	    			temp=a[i];
	    			a[i]=a[j];
	    			a[j]=temp;
	    		}
	    	}
	    }
	
		System.out.println("Printed Shorted array :");
		for(i=0;i<n;i++) {
			System.out.print(" "+a[i]);
	}
	}
}
