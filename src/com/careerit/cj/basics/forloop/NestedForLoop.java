package com.careerit.cj.basics.forloop;

import java.util.Scanner;

public class NestedForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value : ");
		int N = sc.nextInt();
		
		for(int i=N;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}
}
