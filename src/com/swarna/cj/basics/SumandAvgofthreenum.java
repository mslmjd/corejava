package com.swarna.cj.basics;

import java.util.Scanner;

public class SumandAvgofthreenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** Read three floating point numbers from user 
		 * & calculate sum of three numbers
		 * & Average of three numbers**/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter a float number:");
		float n1=sc.nextFloat();
		
		System.out.println("\nEnter a float number:");
		float n2=sc.nextFloat();
		
		System.out.println("\nEnter a float number:");
		float n3=sc.nextFloat();
		
		/*calculate sum of three numbers*/
		float sum=n1+n2+n3;
		System.out.println("\nSum of three numbers is:"+sum);
		
		/*calculate average of three numbers*/
		float avg=sum/3;
		System.out.println("\n Average og three numbers is:"+avg);
		
		sc.close();

	}

}
