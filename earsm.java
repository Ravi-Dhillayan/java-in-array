package arr;

import java.util.Scanner;

public class earsm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int i,n,sum=0,s=0;
  
 Scanner o=new Scanner(System.in);
  System.out.println("Enter the Array Element : ");
  n=o.nextInt();
  int a[]=new int[n];
  
  for(i=0;i<n;i++) {
	  a[i]=o.nextInt();
	  
  }
  for(i=0;i<n;i++) {
	  if(a[i]%2==0) {
		  sum+=a[i];
	  }
	
	  if(a[i]%2!=0) {
		  s+=a[i];
	  }
  }
  System.out.println("Even Number sum : "+sum);
  System.out.println("Odd Number sum : "+s);
  
	}

}
