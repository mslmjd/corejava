package com.swarna.cj.basics.arrays;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class BinarySearchinArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ThreadLocalRandom.current().nextInt(1, 21);
		}
		System.out.println(Arrays.toString(arr));

		// sort elements in an array
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// binarysearch in array
		int key = 16;
		int isfound = binarysearch(arr, key);
		/*predefined method for binarysearch in arrays
		  int isfound=Arrays.binarySearch(arr, key);
		 */

		if (isfound!=-1)
			System.out.println(key + "is found at location"+isfound);
		else
			System.out.println(key + "is not found");

	}

	private static int binarysearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		int index = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				index = mid;
				break;
			} else if (key > arr[mid]) {
				low = mid + 1;
			} else
				high = mid - 1;
		}
		return index;
	}
}
