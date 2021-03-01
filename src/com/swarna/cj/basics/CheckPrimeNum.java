package com.swarna.cj.basics;

import java.util.Scanner;

public class CheckPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** program to accept a number
		 *  and determine whether it is a prime number or not.
		 */
		
		boolean flag=false;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter any integer number:");
		int num=sc.nextInt();
		
		//Condition for not prime
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
				flag=true;
			break;
		}
		if(!flag)
			System.out.printf("\nThe entered number %d is a prime number",num);
		else
			System.out.printf("\nThe entered number %d is not a prime number",num);
				
		sc.close();
  
	}

}
