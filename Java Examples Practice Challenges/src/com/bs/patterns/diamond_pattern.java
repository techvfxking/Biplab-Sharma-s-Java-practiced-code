package com.bs.patterns;

public class diamond_pattern {

	public static void diamond() {
		
		for(int i=1;i<=6;i++) {
			
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

		for(int i=5;i>=1;i--) {
			
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}

