package com.careerit.cj.basics.conditional;

import java.util.Scanner;

public class MultiplicationOfTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num : ");
		int num = sc.nextInt();
		for (int i = 10; i >= 1; i--) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}

		sc.close();
	}
}
