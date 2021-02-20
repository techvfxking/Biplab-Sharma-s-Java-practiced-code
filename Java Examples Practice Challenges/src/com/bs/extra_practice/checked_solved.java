package com.bs.extra_practice;

import java.io.*;

public class checked_solved {

	public static void main(String[] args) throws IOException{
		 FileReader file = new FileReader("C:\\Users\\Biplab Sharma\\Pictures\\mytest1.txt"); 
	        BufferedReader fileInput = new BufferedReader(file); 
	         
	        for (int i = 0; i <= 3; i++)  
	            System.out.println(fileInput.readLine()); 
	          
	        fileInput.close(); 
	    } 
	} 