package com.swarna.cj.basics;

import java.util.Scanner;

public class Convertnegnumtopos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Accept an interger number from keyboard 
		 * if it's negative 
		 * convert it into positive
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter an integer number:");
		int num=sc.nextInt();
		
		if(num<=0) { 
			num=-num;
		}
		System.out.println("positive number: "+num);
		sc.close();
		
	}

}
