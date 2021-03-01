package com.swarna.cj.basics;

import java.util.Scanner;

public class Naturalnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**generate the first 'N' natural numbers. Accept the value of 'N' from the user.*/
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number of natural numbers to be generated::");
		int n=sc.nextInt();
		
		System.out.printf("First %d natural numbers are : ",n);
		for(int i=1;i<=n;i++)
			System.out.print(i+" ");

System.out.printf("\nThe first %d natural numbers in descending order are: ",n);

for(int i=n;i>=1;i--)
	System.out.print(i+" ");

	}

}
