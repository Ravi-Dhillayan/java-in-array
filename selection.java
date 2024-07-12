package arr;

import java.util.Scanner;

public class selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i,j,n,t,min;
     
      System.out.println("Enter the array Size : ");
      Scanner o=new Scanner(System.in);
      n=o.nextInt();
     
      int a[]=new int[n];
      for(i=0;i<n;i++) {
      a[i]=o.nextInt();
	}
      System.out.println("printed UnSorted array : ");
      for(i=0;i<n;i++) {
System.out.println(a[i]);
    	}
      
      for(i=0;i<n;i++) {
          min=i;
          for(j=i+1;j<n;j++) {
              if(a[min]>a[j])
              {
            	  min =j;
              }
        	}
          if(min!=i)
          {
        	  t=a[i];
        	  a[i]=a[min];
        	  a[min]=t;
        	  
          }
          
    	}
      System.out.println("printed Sorted array : ");
      for(i=0;i<n;i++) {
    	  System.out.println(a[i]);
    	      	}
    	      
	}
}
