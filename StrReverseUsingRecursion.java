package com.infinite.programs;

public class StrReverseUsingRecursion {
	public static void main(String[] args) {
		System.out.println(reverse("udnahcmerp"));
	}

	private static char[] reverse(String string) {
		char[] arr = string.toCharArray();
		rev(arr,0,arr.length-1);
		return arr;
	}

	private static void rev(char[] arr, int i, int j) {
		// base condition
		if (i >= j) {
			return;
		} else {
			System.out.println(i+" "+j);
			char t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			
			rev(arr, i+1, j-1);
		}
	}
}
