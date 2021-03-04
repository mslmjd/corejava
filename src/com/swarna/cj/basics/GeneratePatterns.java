package com.swarna.cj.basics;

public class GeneratePatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1 int count=0; for(int i=1;i<=3;i++) { for(int j=1;j<=3;j++) { count++;
		 * System.out.print(count+" "); } System.out.println();
		 * 
		 * }
		 * 
		 * }
		 */

		/*
		 * 2 for(int i=1;i<=6;i++) { for(int j=1;j<=i;j++) { System.out.print(j+" "); }
		 * System.out.println(); } }
		 */

		/*
		 * 3 for(int i=6;i>=1;i--) { for(int j=1;j<=i;j++) { System.out.print(j+" "); }
		 * System.out.println(); } }
		 * 
		 */

		/*
		 * 4 int ch=65; for(int i=1;i<=3;i++) { for(int j=1;j<=3;j++) {
		 * System.out.print((char)ch++ +" "); } System.out.println();
		 * 
		 * }
		 * 
		 */
		int n = 19;
		// for(int i=1;i<=3;i++) {
		for (int j = 1; j <= 3; j++) {
			for (int k = 1; k <= 10; k++) {
				System.out.print(" ");
				System.out.print(n * k + " ");
			}
		}
		System.out.println();
	}
	// }

}
