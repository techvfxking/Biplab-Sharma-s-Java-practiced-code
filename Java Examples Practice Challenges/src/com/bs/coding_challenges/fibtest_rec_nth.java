package com.bs.coding_challenges;

public class fibtest_rec_nth {
	public static int fibnum_nth(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return fibnum_nth(n-1) + fibnum_nth(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println("So the nth number is "+n+" and the fibonacci number of nth number will be: ");
		System.out.println(fibnum_nth(n));
	}

}
