package arr;

import java.util.Scanner;

public class sma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int i,si,se,n;
   Scanner o=new Scanner(System.in);
   System.out.println("Enter the NO of Element : ");
   
   n=o.nextInt();
   int a[]=new int[n];
   for(i=0;i<n;i++) {
	   a[i]=o.nextInt();
   }
   int min=a[0];
   for(i=0;i<a.length;i++) {
//	   si=i;
//	   se=a[i];
//	   for(int j=i+2;j<n;j++) {
//		   if(si>a[j]) {
//			   
//		   }
//	   }
	   if(a[i]<min) {
		  min=a[i];
	   }
	   
   }
   System.out.println("smallest Element Found :"+min);

	}
   

}
