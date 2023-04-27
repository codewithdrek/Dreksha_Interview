package com.anagram;

import java.util.Arrays;

public class Anagrams {

	String s[] = { "DADA" };
	String s1[] = { "ADAD" };

	public static boolean checkAnagramOrNot(char[] c1, char[] c2) {
		// Step1
		int length1 = c1.length;
		int length2 = c2.length;

		// Step2
		if (length1 != length2) {
			System.out.println("Not and Anagram");
		}

		// Step3
		Arrays.sort(c1);
		Arrays.sort(c2);
		// Collections.sort(null);

		// Step4
		for (int i = 0; i < c2.length; i++) {
			if (c1[i] != c2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		char[] c1 = { 'D', 'A', 'D', 'A' };
		char[] c2 = { 'D', 'A', 'D', 'A' };

		// call method
		boolean result = checkAnagramOrNot(c1, c2);
		System.out.println(result);
		// NOTE
		// In anagram we have to bring Every char at some index

		// when both array is of same length and no need of 2 for loop only one loop
		// will work
	}
}
