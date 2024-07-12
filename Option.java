package arr;

import java.util.Scanner;

class AR{
	int x,b,i,j,n,k,temp;
	public
	AR() {
		System.out.println("Enter the Size of array : ");
		Scanner o=new Scanner(System.in);
		n=o.nextInt();
		int[] a=new int[n];
		System.out.println("You insert an element into the array :: ");
		for(i=0;i<n;i++)
		{
			a[i]=o.nextInt();
		}	
		System.out.println("You Enter the numbers to place the first element at the first position\n and the second call the last position : ");
	    x=o.nextInt();
	     b=o.nextInt(); 
		for(i=0;i<n;i++) {
			if(a[i]==x || a[i]==b) {
			for(j=0;j<n;j++) {
				if(x==a[j]) {
				temp=a[j];
				a[j]=a[0];
				a[0]=temp;
				
				}
                else if(b==a[j]) {
					int temp1=a[j];
					a[j]=a[n-1];
					a[n-1]=temp1;
				}
			}
		  } 
		}
		System.out.println("Printed just the way You wanted it : ");
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}
	
}
public class Option {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AR obj=new AR();
	

	}

}
