package com.swarna.cj.basics;

import java.util.*;

public class Sumoftwonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** Read two interger numbers from user 
		 * & calculate sum of two numbers**/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter an Integer number:");
		int n1=sc.nextInt();
		
		System.out.println("\nEnter an Integer number:");
		int n2=sc.nextInt();
		
		/*calculate sum of two numbers*/
		int sum=n1+n2;
		System.out.println("\nSum of two numbers is:"+sum);
		
		sc.close();
		

	}

}
