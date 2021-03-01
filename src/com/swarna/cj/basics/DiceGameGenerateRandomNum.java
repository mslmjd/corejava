package com.swarna.cj.basics;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGameGenerateRandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// RandomIneter(1-6)
		int rnum = ThreadLocalRandom.current().nextInt(1, 7);
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {
			System.out.println("Guess Number(1-6) Enter your number:");
			int gnum = sc.nextInt();
			if (rnum == gnum) {
				System.out.println("Good! U Guessed Number in" + i + "attempts");
				break;
			} else {
				if (i == 3)
					System.out.println("Sorry! You have reached max number of attempts ,the number is:  "+rnum);
				else
					System.out.println("Sorry!try again");
			}

		}

		sc.close();

	}

}
