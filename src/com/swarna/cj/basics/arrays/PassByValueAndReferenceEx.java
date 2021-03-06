package com.swarna.cj.basics.arrays;

import java.util.Arrays;

public class PassByValueAndReferenceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("a="+a+"b="+b);
		swap(a,b);//primitive data pass by value
		System.out.println("pass by value ,a,b values won't change in main()");
		System.out.println("a="+a+"b="+b);//pass by value ,values won't change
		
		
		//pass-by-reference
		int[] arr= {1,2,3,4};
		System.out.println(Arrays.toString(arr));
		increment(arr);//arrays will pass by reference
		System.out.println("arrays will pass by reference (memory location)");
		System.out.println(Arrays.toString(arr));
			
	}
	//pass by value
	public static void swap(int a,int b) {
		int t=a;
		a=b;
		b=t;
		//a,b values are local variables here,a,b values will persist till swap()
		System.out.println("a="+a+"b="+b);
	}
	
	//pass by reference
	//Arrays will pass by reference (memory location)
	public static void increment(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]+=1;//value at memory location will change
		}
		System.out.println(Arrays.toString(arr));
	}

}
