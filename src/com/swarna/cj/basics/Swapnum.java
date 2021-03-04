package com.swarna.cj.basics;

import java.util.Scanner;

public class Swapnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Read two interger numbers from user & swap &display the numbers
		 **/

		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter first integer number:");
		int a = sc.nextInt();

		System.out.println("\nEnter second integer number:");
		int b = sc.nextInt();

		System.out.printf("Before swap, the values of num1=%d and num2=%d", a, b);
		/* Swapping of two numbers */

		int temp = a;
		a = b;
		b = temp;

		System.out.printf("\nAfter swap, the values of num1=%d and num2=%d", a, b);

		/* other logics for swapping numbers */
		/*
		 * a=a+b; b=a-b; a=a-b;
		 */

		/*
		 * a=a*b; b=a/b; a=a/b;
		 */

		sc.close();

	}

}
