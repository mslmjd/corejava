package com.swarna.cj.basics.arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArraySplitMethod {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("data/names.txt"));
		String data = sc.nextLine();

		// printing file data without using split method
		System.out.println(data);

		// printing file data after using split method
		String[] names = data.split(",");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
