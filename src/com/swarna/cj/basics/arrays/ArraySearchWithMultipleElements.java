package com.swarna.cj.basics.arrays;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArraySearchWithMultipleElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 12;
		int num2 = 16;
		int num3 = 34;

		// calling method to generate random elements &store into array
		int arr[] = getStudentIdFromServer();

		// printing array elements
		System.out.println(Arrays.toString(arr));

		// search 3 elements in an array
		if (search(arr, num1) && search(arr, num2) && search(arr, num3)) {
			System.out.println("Successs");
		} else
			System.out.println("Fail");

	}// End of main
		// search an element in an array

	private static boolean search(int[] arr, int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (ele == arr[i])
				return true;
		}
		return false;
	}

	// generate random elements & store in an array
	private static int[] getStudentIdFromServer() {
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = ThreadLocalRandom.current().nextInt(1, 51);
		}
		return arr;
	}

}
