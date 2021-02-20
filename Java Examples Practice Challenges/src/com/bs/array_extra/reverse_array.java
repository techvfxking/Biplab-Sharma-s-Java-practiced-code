package com.bs.array_extra;

public class reverse_array {

	public static void main(String[] args) {
		String a = new String("hello");
		System.out.println(a);
		int[] arr = new int[] {1,2,3,4,5,6,7,8};
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
