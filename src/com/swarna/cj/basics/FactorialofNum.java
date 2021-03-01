package com.swarna.cj.basics;

import java.util.Scanner;

public class FactorialofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** program to accept a number and find its factorial.*/

		int f=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\nEnter any integer number:::");
		int n=sc.nextInt();
		
		System.out.printf("Factorial of %d!=:",n);
		for(int i=n;i>=1;i--) {
			if(i==1)//i==n if for(int i=1;i<=n;i++)
				System.out.print(i);
			else {
				
				System.out.print(i+"*");
			}
			f*=i;
			}//End of for loop
		System.out.print("="+f);
		sc.close();
		
	}
	

}
