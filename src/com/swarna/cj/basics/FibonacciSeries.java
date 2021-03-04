package com.swarna.cj.basics;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter any integer number:::");
		int n = sc.nextInt();

		System.out.println("Fibonacci Series :");
		int a = 0;
		int b = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}

	}

}
