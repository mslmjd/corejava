package com.swarna.cj.basics;

import java.util.Scanner;

public class GenerateFirstNPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/** program to generate N prime numbers */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value(How many Prime numbers has to generate)::");
		int N = sc.nextInt();
		int count = 0;

		// printing prime numbers
		for (int i = 2;; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
			if (count == N)
				break;

		}
		sc.close();
	}// End of main()

	public static boolean isPrime(int num) {

		// if num is 0 or 1 flag set false
		boolean flag = (num <= 1) ? false : true;

		// logic to generate prime numbers
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;

	}

}// End of class
