package com.swarna.cj.basics.whileloop;

import java.util.Scanner;

public class SumofdigitsinaNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter any integer number:::");
		int num = sc.nextInt();

		int sum = 0;
		int temp = num;
		while (temp != 0) {
			int r = temp % 10;
			sum += r;
			temp = temp / 10;
		}
		System.out.println("sum of digits in a given number is::" + sum);

	}

}
