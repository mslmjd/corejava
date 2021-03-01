package com.swarna.cj.basics.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[10];
		
		//generate 10 random elements within(1 to 50) and store to an array
		for(int i=0;i<10;i++)
			arr[i]=ThreadLocalRandom.current().nextInt(1,51);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Key element(1-50) to search in array:");
		int key=sc.nextInt();
		
		//Search for key element in an array(Linear search)
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			int ele=arr[i];
			if(key==ele) {
				index=i;
				break;
			}
			
		}
		System.out.println(Arrays.toString(arr));
		if(index!=-1)
			System.out.println(key+" is found at location: "+index);
		else
			System.out.println(key+"is not found");
		sc.close();
		

	}

}
