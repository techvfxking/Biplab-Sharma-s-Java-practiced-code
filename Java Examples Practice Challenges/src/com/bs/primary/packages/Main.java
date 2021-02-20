package com.bs.primary.packages;
public class Main {
	public static void main(String[] args) {
		int result = biswajit(1, 5);
		System.out.println(result);
	}

	public static int biswajit(int start, int end) {
		if (end > start) {
			return end + biswajit(start, end - 1);// here when the value of end is less than start then else
			//called
		} else {
			return end;
		}
	}
}