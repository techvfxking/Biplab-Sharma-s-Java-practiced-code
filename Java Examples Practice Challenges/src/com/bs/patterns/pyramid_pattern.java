package com.bs.patterns;

public class pyramid_pattern {

	public static void pyramid() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j >= i; j--) {
				System.out.print(" ");

			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}
}
