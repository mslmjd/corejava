package com.swarna.cj.basics.arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class IPLData {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new File("data/ipl_2021.csv"));
		sc.nextLine();
		while(sc.hasNextLine()) {
			String data=sc.nextLine();
			String dataarr[]=data.split(",");
			System.out.println(Arrays.toString(dataarr));
		}

	}

}
