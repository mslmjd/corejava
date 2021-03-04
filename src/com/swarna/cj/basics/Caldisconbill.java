package com.swarna.cj.basics;

import java.util.Scanner;

public class Caldisconbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * accept the billing amount, if it is > 6000 then give a discount of 10% and
		 * display the net amount.
		 */
		int discount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter billing amount:");
		int billamt = sc.nextInt();

		if (billamt > 6000)
			discount = (billamt * 10) / 100;
		int namt = billamt - discount;
		System.out.println("net amount  : " + namt);
	}

}
