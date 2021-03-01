package com.swarna.cj.basics;

import java.util.Scanner;
public class GeneratePrimeNumbwLBandUB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**program to accept the lower bound number
		 *  and the upper bound number from the user 
		 *  and print the prime numbers between them.
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Lowerbound value:");
		int lb=sc.nextInt();
		
		
		System.out.println("\nEnter an Upperbound value:");
		int ub=sc.nextInt();
		int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";

	       for (i = lb; i <= ub; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.printf("The prime numbers between %d and %d are::",lb,ub);
	       System.out.print(primeNumbers);
	   }
}
