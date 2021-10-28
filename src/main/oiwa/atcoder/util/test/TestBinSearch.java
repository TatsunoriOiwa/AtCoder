package oiwa.atcoder.util.test;

import java.util.Arrays;

import oiwa.atcoder.util.template.Main;

public class TestBinSearch {

	public static void main(String[] args) {
							//  0  1  2  3  4  5  6
		int[] arr = new int[] { 1, 2, 3, 4, 4, 4, 6 };
		
		test(arr, 0);
		test(arr, 1);
		test(arr, 2);
		test(arr, 4);
		test(arr, 5);
		test(arr, 6);
		test(arr, 7);
		
							//   0  1  2  3  4  5
		int[] arr2 = new int[] { 3, 3, 4, 4, 4, 6 };
		testUpperBound(arr2, 2, 0);
		testUpperBound(arr2, 3, 2);
		testUpperBound(arr2, 4, 5);
		testUpperBound(arr2, 5, 5);
		testUpperBound(arr2, 6, 6);
		testUpperBound(arr2, 7, 6);
		
		
		testLowerBound(arr2, 2, 0);
		testLowerBound(arr2, 3, 0);
		testLowerBound(arr2, 4, 2);
		testLowerBound(arr2, 5, 5);
		testLowerBound(arr2, 6, 5);
		testLowerBound(arr2, 7, 6);
	}
	
	private static void test(int[] arr, int key) {
		
		int indx = Arrays.binarySearch(arr, key);
		int res = indx;
		if (res < -1) res = -res +1;
		System.out.println("key=" + key + " indx=" + indx + " res=" + res);
		
		
	}
	
	private static void testUpperBound(int[] arr, int key, int exp) {
		System.out.println("expected " + exp + ", got " + Main.AtMath.binarySearchUpperBound(0, arr.length-1, key, i -> arr[(int) i]));
	}
	
	private static void testLowerBound(int[] arr, int key, int exp) {
		System.out.println("expected " + exp + ", got " + Main.AtMath.binarySearchLowerBound(0, arr.length-1, key, i -> arr[(int) i]));
	}
}
