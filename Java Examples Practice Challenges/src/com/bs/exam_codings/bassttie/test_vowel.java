package com.bs.exam_codings.bassttie;

import java.util.Scanner;

public class test_vowel {
	public static void main(String[] args) {
		Scanner str_input = new Scanner(System.in); 
		int a_vow = 0;
			System.out.println("This is a Vowel Counting Program");
			System.out.println(" ");
			System.out.println("----------------------------------------------------");
			System.out.println("Enter Any Text or Sentences or Names or String Type");
			String str = str_input.nextLine();
			str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'|| str.charAt(i) == 'u') {
				a_vow++;
			}
		}
	
		System.out.println("So you have Enterd: " + str +" :Which has been lowerd by toLowerCase Method, to reduce complexity");
		System.out.println("Number of vowels: " + a_vow);
		str_input.close();
	}

}
