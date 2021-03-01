package com.swarna.cj.basics;

import java.util.Scanner;

public class Bigofthreenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/**accept 3 numbers from the user and find the biggest of them.*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter  first integer number:");
		int n1=sc.nextInt();
		
		System.out.println("\nEnter  second integer number:");
		int n2=sc.nextInt();
		
		System.out.println("\nEnter  third integer number:");
		int n3=sc.nextInt();
		
		int big=((n1>n2)&&(n1>n3))?n1:(n2>n3)?n2:n3;
		System.out.printf("The biggest of the three numbers entered (%d,%d and %d) is: %d",n1,n2,n3,big);
		
	}

}
