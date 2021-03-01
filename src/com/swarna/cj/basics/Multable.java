package com.swarna.cj.basics;

import java.util.Scanner;

public class Multable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** accept a number from the user and print its multiplication table (upto “times 10”).*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number to generate its multiplication table:");
		int n=sc.nextInt();
		
		System.out.printf("Multiplication table for %d is :",n);
		for(int i=1;i<=10;i++)
			System.out.printf("\n%d * %d =%d",n,i,(n*i));
			
			

	}

}
