package org.arrayclass;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int a[][] = new int[3][3];// [0,0,0,][0,0,0][0.0.0]
		a[0][0] = 10; // [10,0,0][0,0,0][0,0,0]
		a[0][1] = 20; // [10,20,0][0,0,0]0,0,0]
		a[0][2] = 30; // [10,20,30][0,0,0][0,0,0]
		a[1][0] = 40; // [10,20,30][50,0,0][0,0,0]
		a[1][1] = 50; // [10,20,30][50,60,0][0,0,0]
		a[1][2] = 60; // [10,20,30][50,60,70][0,0,0]
		a[2][0] = 70; // [10,20,30][50,60,70][80,0,0]
		a[2][1] = 80; // [10,20,30][50,60,70][80,90,0]
		a[2][2] = 90; // [10,20,30][50,60,70][80,90,100]

		// To iterate the 2D array & print all the value(nested for loop)
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++)
				System.out.println(a[i][j]);
		}
		// To iterate the 2D array & print all the value(nested enhanced for loop)
		for (int[] b : a) {
			for (int c : b)
				System.out.println(c);
		}

		// or
		int b[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println("b[" + i + "][" + j + "] = " + b[i][j]);
			}
		}
	}

}
