package com.bs.patterns;

public class Calling_class {

	public static void main(String[] args) {
		Star_pattern_front_side a = new Star_pattern_front_side();
		Star_pattern_reverse_side b = new Star_pattern_reverse_side();
		diamond_pattern c= new diamond_pattern();
		pyramid_pattern d = new pyramid_pattern();
		
		System.out.println("Front Side Star Pattern");
		System.out.println(" ");
		a.front_pattern();
		System.out.println(" ");
		System.out.println("New Line");
		System.out.println(" ");
		System.out.println("Reverse Side Star Pattern");
		System.out.println(" ");
		b.reverse_pattern();
		System.out.println(" ");
		System.out.println("New Line");
		System.out.println(" ");
		System.out.println("Diamond Star Pattern");
		System.out.println(" ");
		c.diamond();
		System.out.println(" ");
		System.out.println("New Line");
		System.out.println(" ");
		System.out.println("Pyramid Star Pattern");
		System.out.println(" ");
		d.pyramid();
		
		

	}

}
