package com.swarna.cj.basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumAndAvgofArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Students:");
		int count = sc.nextInt();

		int arr_age[] = new int[count];

		// Accept Elements and store into arr_age

		for (int i = 0; i < arr_age.length; i++) {
			System.out.println("Enter student " + (i + 1) + " age:");
			arr_age[i] = sc.nextInt();
		}
		// Display array elements
		// System.out.println(arrToString(arr_age));
		System.out.println(Arrays.toString(arr_age));

		// Sum of array elements
		int sum = 0;
		for (int i = 0; i < arr_age.length; i++) {
			sum += arr_age[i];
		}
		System.out.println("Sum of all student ages(all array elemts:)" + sum);

		// Average of array elements
		float avg = 0;
		avg = sum / (float) count;
		System.out.println("Average of all student ages(all array elemts:)" + avg);
		
		sc.close();

		/*
		 * // Display Array Elements System.out.println("Array Elements are:");
		 * System.out.print("["); for (int i = 0; i < arr_age.length; i++) { if (i ==
		 * arr_age.length-1) System.out.print(arr_age[i]); else
		 * System.out.print(arr_age[i] + ","); }
		 * 
		 * System.out.print("]");
		 * 
		 */
	}// End of main

	// display ArrayElements
	public static String arrToString(int[] arr) {
		String str = "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1)
				str += arr[i];
			else
				str += arr[i] + ",";
		}
		str += "]";
		return str;
	}

}// End of class
