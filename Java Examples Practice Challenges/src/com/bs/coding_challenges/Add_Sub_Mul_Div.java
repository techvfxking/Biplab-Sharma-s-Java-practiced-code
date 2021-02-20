package com.bs.coding_challenges;

import java.util.*;

public class Add_Sub_Mul_Div {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    // read user input and assign to the 'num1' and 'num2' variable
	    
	    System.out.println("Enter Num1: ");
	    int num1 = input.nextInt();
	    System.out.println("Enter Num2");
	    int num2 = input.nextInt();
	    
	    // call the method we made and pass the num1 and num2 into it
	    
	    myMethod(num1, num2);
	    
	    //closing the Scanner Class with reference variable name input with " input.close(); " command
	    
	    input.close();
	  }
	  // here we define our method and give it one parameter, num1 and num2
	
	  public static void myMethod(int num1, int num2) {
		  
	    // Here we are calculating it
		  
	    System.out.println("Addition " + (num1+num2));
	    System.out.println("Multiplication " + (num1*num2));
	    System.out.println("Substraction " + (num1-num2));
	    System.out.println("Division " + (num1/num2));
	    System.out.println("Modulus " + (num1%num2));
	  }	 
	}
