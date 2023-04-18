package com.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Test2ArrayInOne {

	static int[] arr1 = { 1, 5,3, 7};
	static int[] arr2 = { 2, 4, 6, 8, 10,11 };

	static List<Integer> newArr = null;
	

	public static void main(String[] args) {

		try {
			newArr = new ArrayList<>();
			for (int i = 0; i < arr1.length; i++) {
				newArr.add(arr1[i]);
				newArr.add(arr2[i]);
			}

			
			Collections.sort(newArr);
			for (Integer i : newArr) {
				System.out.print(i);
				System.out.print("->");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}