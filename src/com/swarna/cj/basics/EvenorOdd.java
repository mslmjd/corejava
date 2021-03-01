package com.swarna.cj.basics;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* accept a number from the user and determine whether it is even or odd.*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter an integer number:");
		int n=sc.nextInt();
		
		if(n%2==0)
			System.out.printf("Number %d  is Even",n);
		else 
			System.out.printf("Number %d  is odd",n);

		sc.close();
	}

}
