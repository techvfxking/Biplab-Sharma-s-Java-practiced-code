package com.bs.coding_challenges;

public class fibtest_rec {
	static int a=0,b=1,c;
	
	public void fibnum(int i) {
		if(i>=1) {
			c = a+b;
			System.out.print(" "+c);
			
			a=b;
			b=c;
			fibnum(i-1);
		}
	}

	public static void main(String[] args) {
		System.out.println("So my Fibonacci Series are: ");
		System.out.print(a+" "+b);
		fibtest_rec obj = new fibtest_rec();
		obj.fibnum(10);

	}

}
