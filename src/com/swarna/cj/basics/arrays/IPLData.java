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
		
		int N=189;//no .of rows (players data) in ipl_2021.csv file
		String[] names=new String[N];
		double[] price=new double[N];
		
		//till end of rows traversing in ipl-data file
		int i=0;
		while(sc.hasNextLine()) {
			String data=sc.nextLine();
			String dataarr[]=data.split(",");
			//System.out.println(Arrays.toString(dataarr));
			//System.out.println(dataarr[0]+"-"+dataarr[4]);
			 names[i]=dataarr[0];
			 price[i]=Double.parseDouble(dataarr[4]);//converting String data to double
			 i++;
			
		}
		//Printing names array
		System.out.println(Arrays.toString(names));
		
		//printing price array
		System.out.println(Arrays.toString(price));
		
		
		
		double max=price[0],min=price[0];
		for(double p:price) {
			if(max<p) {
				max=p;	
			}
			if(min>p) {
				min=p;
			}
					
		}
		
		//Can u find max paid player(s) and display name(s)
		System.out.println("Max amount is:"+max+"and player(s)");
		for(int l=0;l<price.length;l++) {
			if(max==price[l])
				System.out.println(names[l]);
		}
		System.out.println();
		
		
		//Can u find min paid player(s) and display name(s)
		int count=0;
		System.out.println("Min amount is:"+min+"and player(s)");
		for(int l=0;l<price.length;l++) {
			if(min==price[l]) {
				System.out.println(names[l]);
			//to count no.of players getting same min ammount
			count++;
			}
		}
		
		System.out.println("\nBasic priced player count:"+count);

	}

}
