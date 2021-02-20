package com.bs.patterns;

public class Star_pattern_reverse_side {

	public static void reverse_pattern() {
	
		for(int i=1;i<=7;i++) {
			
			for(int j=6;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
