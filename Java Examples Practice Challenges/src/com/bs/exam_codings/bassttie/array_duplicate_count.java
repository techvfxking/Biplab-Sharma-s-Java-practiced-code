
package com.bs.exam_codings.bassttie;

public class array_duplicate_count {

	static int countDuplicate(int arr[], int n) {
		int result = 1;

		for (int i = 1; i < n; i++) {
			int j = 0;
			for (j = 0; j < i; j++)
				if (arr[i] == arr[j])
					break;

			if (i == j)
				result++;
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45 };
		int n = arr.length;
		System.out.println("So the Duplicate Counts are: "+countDuplicate(arr, n));
	}
}