package com.swarna.cj.basics.arrays;

public class MultiDimensionalArrayPatternprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Multidimensional Array with 4 rows and 5 columns declaration
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 1 }, { 1, 0, 0, 0, 1 } };
		// Printing elements in multidimensional array
		// i represents rows
		for (int i = 0; i < arr.length; i++) {
			// arr[i].length indicates till each row elements end
			// j represents columns
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		// printing A pattern
		int arr1[][] = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 1 }, { 1, 0, 0, 0, 1 } };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (arr1[i][j] == 1) {
					System.out.print("* ");
				} else {
					// give 2 spaces instead of 1 space
					System.out.print("  ");
				}

			}
			System.out.println();
		}

	}

}
