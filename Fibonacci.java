package arr;
       //Write a program which generates 30 terms of Fibonacci no in an array and then prints it.


import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
// FIBONACCI
int i,num,term1=0 ,term2=1,nt,s;
Scanner r=new Scanner(System.in);


	

System.out.println("Printed Array Elements  : ");
System.out.println("Enter the  N no. of Fibonacci : ");
Scanner o8=new Scanner(System.in);
num=o8.nextInt();
System.out.println("Value of the Fibonacci Series : ");
for(i=1;i<=num;++i) {
System.out.println(term1);
nt=term1+term2;
term1=term2;
term2=nt;
}
}
}
