package org.arrayclass;

public class OneDimensionalArray {
	public static void main(String[] args) {
		// Datatype variablename = value;
		int a[] = new int[8];
		a[0] = 5;
		a[1] = 10;
		a[2] = 20;
		a[3] = 30;
		a[4] = 40;
		a[5] = 50;
		a[6] = 60;
		a[6] = 80;
		a[7] = 90;

		// Iteration of the Array
		// For loop
		for (int c = 0; c < a.length; c++) {
			System.out.println(a[c]);
		}
		// Enhanced for loop
		for (int b : a) {
			System.out.println(b);
		}
		// or======================================
		int b[] = { 7, 10, 20, 30, 40, 50, 60 };
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}

	}
}