package com.swarna.cj.basics.arrays;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=ThreadLocalRandom.current().nextInt(1,51);
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
