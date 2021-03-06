package com.swarna.cj.basics;

import java.util.Scanner;

public class Bigoftwonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* accept two numbers from the user and determine bigger of the two. */

		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter  first integer number:");
		int n1 = sc.nextInt();

		System.out.println("\nEnter  second integer number:");
		int n2 = sc.nextInt();

		int big = (n1 > n2) ? n1 : n2;
		System.out.printf("The biggest of the two numbers entered (%d and %d) is: %d", n1, n2, big);
		sc.close();

	}

}
