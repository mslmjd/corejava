package com.swarna.cj.basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class generateNPrimesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N Value(How many primes has to generate):");
		int N = sc.nextInt();

		int arr[] = new int[N];
		int count = 0;
		for (int i = 2;; i++) {
			if (isPrime(i))
				arr[count++] = i;
			if (count == N)
				break;
		}
		System.out.println("Prime Numbers  :" + Arrays.toString(arr));
		sc.close();
	}// End of main

	// Generate prime numbers

	public static boolean isPrime(int num) {

		if (num < 2)
			return false;
		else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % 2 == 0)
					return false;

			}
		}
		return true;
	}// End of isPrime() method

}// End of class
