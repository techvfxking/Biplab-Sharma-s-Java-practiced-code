package com.bs.coding_challenges;

public class swap_numwiththird {
	public static void swapnum(int a, int b) {
		
		System.out.println("So before swap the valur of a is: "+a+" and the value of b is: "+b);
		//swapping
		b = b + a; // now b is sum of both the numbers
		a = b - a; // b - a = (b + a) - a = b (a is swapped)
		b = b - a; //(b + a) - b = a (b is swapped)
		System.out.println("So After swap the valur of a is: "+a+" and the value of b is: "+b);
	}

	public static void main(String[] args) {
		swapnum(20,30);

	}

}
