package arr;

import java.util.Scanner;

class thi{
	int i,n,s=0,su=0;
	int a;
//	thi(int a){
//		this.a=a;
//	}
//	void show() {
//		System.out.println(a);
//	}
	thi() {
	
		System.out.println("*******This Program use for THIS Keyword !!!**********");
		Scanner o=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		n=o.nextInt();
		int a[]=new int[n];
		System.out.println("Please Enter the value of array Element : ");
		for(i=0;i<n;i++) {
			a[i]=o.nextInt();
		}
		for(i=0;i<n;i++) {
			if(a[i]%2==0) {
				s=s+a[i];
	
			}
			if(a[i]%2!=0) {
				su+=a[i];
			}
			
		}
		System.out.println("Sum of odd Number : "+su);
		System.out.println("Sum of even Number : "+s);
	}
	thi(int a){
//		this();
	  a=a;
//		System.out.println(a);
		System.out.println("_______________________------------Hii Your Welcome to program------------________________");
		
	}
	void fun() {
	System.out.println("program is a GooD ::");
		System.out.println(a);
	}
	thi(int a ,int b) {
		this();
		this.fun();
		
	}
}

public class THIs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		thi obj=new thi(100,12);
//		thi ob=new thi(100);
//		obj.fun();
		thi o=new thi(100);
//		o.fun();
		thi ob=new thi(12,11);
	
		
		

	}
	

}
