package arr;

import java.util.Scanner;

class serch{
	int i,j,n,se;
	public
	void lin()  // linear Search
	{
		System.out.println("Enter array Size");
	  Scanner so=new Scanner(System.in);
	  n=so.nextInt();
	  int a[]=new int[n];
	  
	  for(i=0;i<n;i++) {
		a[i]=so.nextInt();  
	  }
	  System.out.println("Enter the number you are Searching In this array : ");
	  se=so.nextInt();
	  for(i=0;i<n;i++) {
		if(a[i]==se) {
			System.out.println("Your  Index for "+i+1+" And number : "+a[i]);
		}
	  }
	}
	void bin() {  // Binary search
		int min=0,f=0;
		int mid=0;
		System.out.println("Enter the size of array : ");
		Scanner so=new Scanner(System.in);
		n=so.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the  array Element : ");
		for(i=0;i<n;i++)
		{
			a[i]=so.nextInt();
		}
		System.out.println("which number do you want to search : ");
		int n1=so.nextInt();
		int max=n-1;
	
	while(min<=max) {
			 mid=(min+max)/2;
			if(a[mid]==n1) {
				f=1;
				break;
			}
			else if(mid<n1)
			{
				min=mid+1;
			}
			else if(a[mid]>n1)
			{
				max=mid-1;
			}
			else
			{
				System.out.println("NOT FOUND ::");
			}
		}
	if(f==1) {
		System.out.println("The idex of  number you wanted to search is this : "+mid+1+" And That number is: "+a[mid]);
	}
	}
}

public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  serch os=new serch();
//  os.lin();
  os.bin();
	}

}
