package com.swarna.cj.basics.arrays;

public class BasicArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[] { "Java", ".Net", "Python", "PHP", "Angular", "ReactJS" };

     //printing array elements
		System.out.println("printing array elements:");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+" ");
		}

      //printing array elements in reverse order
		System.out.println("\n\nprinting array elements in reverse order");
		for (int i = names.length - 1; i >= 0; i--) {
			System.out.print(names[i]+" ");
		}
	}

}
