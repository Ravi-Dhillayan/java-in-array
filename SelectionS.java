package arr;

import java.util.Scanner;

public class SelectionS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,si=0,se=0,s,temp;
		Scanner r=new Scanner(System.in);
		System.out.println(" Enter the size of Array: ");
		s=r.nextInt();
		int a[]=new int[s];
		
		for(i=0;i<s;i++) {
			a[i]=r.nextInt();
		}
			for(i=0;i<s-1;i++) {
				si=i+1;
				se=a[i+1];
				for(j=i+2;j<s;j++) {
					if(se>a[j])
					{
					se=a[j];
					si=j;
					
					}
				}
			if(a[i]>a[si]) {
				temp=a[i];
				a[i]=a[si];
				a[si]=temp;
				
			}
				
			
		}
			for(i=0;i<s;i++) {
				System.out.println(a[i]);
			}
	}

}
