package arr;

import java.util.Scanner;

public class std {
	public static void main(String[] args) {

		int sum=0, i,min=0,max;
		Scanner r=new Scanner(System.in);
		System.out.println(" Enter no. of Student : ");
		//s=r.nextInt();
		int s[]=new int[10];
		int sub[]=new int[3];
		int ta[]=new int[10];
		max=r.nextInt();
		for(i=0;i<max;i++) {
			System.out.println("Enter your roll no.");
			s[i]=r.nextInt();
			
			System.out.println("Enter subject 1st number : ");
			sub[0]=r.nextInt();
			
			System.out.println("Enter subject 2nd number : ");
			sub[1]=r.nextInt();
			
			System.out.println("Enter subject 3");
			sub[2]=r.nextInt();
			for(int j=0;j<3;j++) {
				sum=sum+sub[j];
				
			}
			System.out.println("total no =  "+sum);
			System.out.println(" Avarage : "+sum/3);
			min=(sum/3)+ta[i];
			sum=0;
		}
		if(max>1)
			System.out.println("total avarage : "+min/max);
		}
 
		
}
