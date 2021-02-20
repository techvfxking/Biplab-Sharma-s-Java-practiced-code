package com.bs.extra_practice;

public class string_example1 {
	public static void main(String args[]) {
		String a1="     JAVACODE ";//creating string by java string literal  
		char ch[]={'c','o','d','i','n','g'};  
		String a2=new String(ch);//converting char array to string  
		String a3=new String(" example");//creating java string by new keyword 
		String a4 = "language";
		String a5 = "LANGUAGE";
		
		
		System.out.println(a1);  
		System.out.println(a2);  
		System.out.println(a3);  
		System.out.println(a4.length());
		System.out.println(a1.charAt(2));
		System.out.println(a3.substring(2, 6));
		System.out.println(a2.contains("o"));
		System.out.println(a1.equals(a4));
		System.out.println(a4.equalsIgnoreCase(a5));
		System.out.println(a1.concat(" "+a4));
		System.out.println(a1.replace("A", "a"));
		System.out.println(a1.indexOf("O"));
		System.out.println(a1.lastIndexOf("E"));
		System.out.println(a1.toLowerCase());
		System.out.println(a4.toUpperCase());
		System.out.println(a1.trim()+a3);//with trim
		System.out.println(a1+a3);//without trim
		System.out.println(a1.startsWith("JA"));  
	}
}