package arr;

import java.util.Scanner;

class A{
	int i,n,j,f=1;
	int isf=0;
	A(){
		System.out.println("*********YOUR WELCOME TO PROGRAM**********");
	}
	void show() {
		System.out.println("Enter the size of array : ");
		Scanner o=new Scanner(System.in);
		n=o.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the value of array : ");
		for(i=0;i<n;i++) {
			a[i]=o.nextInt();
		}
		for(i=0;i<n;i++) {
			f=f*a[i];
		}
		System.out.println("Multiple of array : "+f);
		
	}
}
class B extends A{
	    int i,j,n;
	    B(){
	    	super(); // It is used for the call to  class A constructor
//	    	super.show();
	    	System.out.println("It is a class constructor : ");
	    }
	    void show() {
	    	super.show();// It is called by class A function name show()
	    	System.out.println("Enter the size of the array : ");
	    	Scanner o=new Scanner(System.in);
	    	n=o.nextInt();
	    	int a[]=new int[n];
	    	System.out.println("Enter the value of the arrray : ");
	    	for(i=0;i<n;i++) {
	    		a[i]=o.nextInt();
	    	}
	    	System.out.println("Enter the search the value : ");
	    	int n1=o.nextInt();
	    	for(i=0;i<n;i++) {
	    		j=i+1;
	    		
	    		if(a[i]==n1) {
	    			
	    			System.out.println(" Index  & Your value : "+j+" "+a[i]);
	    			super.isf=1;// It is access for class A data member used for super Keyboard 
	    		}
	    		
	    		
	    	}
	    	if(super.isf==0) {
    			System.out.println("Your rong input and not found your value : ");
    		}
	    	
	    }
}
public class supperar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   B ao = new B();;
   ao.show();
	}

}
