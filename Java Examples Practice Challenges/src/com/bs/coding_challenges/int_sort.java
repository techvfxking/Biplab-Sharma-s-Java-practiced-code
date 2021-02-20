package com.bs.coding_challenges;

public class int_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {12,89,4,3,9,0};
		int min, temp=0;
		for(int i=0;i<a.length;i++) {
			min = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min = j;
				}
				
			}
			temp =a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			
		}
		
	}

}
