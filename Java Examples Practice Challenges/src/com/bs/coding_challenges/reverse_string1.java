package com.bs.coding_challenges;

public class reverse_string1 {
	public static void rev_string(String name) {
		String rev ="";
		int leng =name.length();
		for(int i=leng-1;i>=0;i--) {
			rev=rev+name.charAt(i); 
		}
		System.out.println(rev);
		
		
	}

	public static void main(String[] args) {
		rev_string("Biplab is my name");
	}

}
