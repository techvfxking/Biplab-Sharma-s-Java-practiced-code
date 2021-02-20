package com.bs.exam_codings.bassttie;

public class middle_String {
	public static void print_mid_Char(String str) {
		int len = str.length();
		int middle = len / 2;
		System.out.println(str.charAt(middle));
	}

	public static void main(String args[]) {
		String str = "BiplabSharma";
		print_mid_Char(str);
	}
}