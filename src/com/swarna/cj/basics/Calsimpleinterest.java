package com.swarna.cj.basics;

import java.util.*;

public class Calsimpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** accept the principal amount, 
		 * rate of interest, time 
		 * and calculate the simple interest.**/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Principal amount:");
		int p=sc.nextInt();
		
		System.out.println("\nEnter rate of Interest:");
		float r=sc.nextFloat();
		
		System.out.println("\nEnter time (years):");
		float t=sc.nextFloat();
		
		
		/*calculate simple interest using (p*t*r)/100 */
		
		float si=(p*t*r)/100;
		System.out.printf("\nSimple interest is %f",si);
		
		sc.close();
		

	}

}
