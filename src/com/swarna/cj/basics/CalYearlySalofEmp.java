package com.swarna.cj.basics;

import java.util.Scanner;

public class CalYearlySalofEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** Read employee id 
		 * &employee name & Monthly Salary from keyboard
		 * & calculate yearly salary of an employee
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter an Employee id:");
		int eid=sc.nextInt();
		
		System.out.println("\nEnter an Employee name:");
		String ename=sc.next();
		
		System.out.println("\nEnter monthly salary of an employee:");
		int sal=sc.nextInt();
		
		/*calculate yearly salary of an employee*/
		int ysal=sal*12;
		System.out.printf("\nHi %s! Your employee id is:\t%d monthly salary is Rs %d and yearly salary is Rs %d",ename,eid,sal,ysal);
		
		sc.close();
		

	}

}
