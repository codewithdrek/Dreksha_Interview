package com.drek;
//remove duplicate from array without using  any predefine class and method


public class Demo {

	static int[] arr = { 2, 5, 3, 6, 2, 5, 7 };
						//2, 5, 3, 6,7

	public static void main(String[] args) {
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length-1; j++) {
				if (arr[i] == arr[j]) {
					//System.out.println("Duplicate Emement" + arr[i]);
					arr[j]=0;
				}
			}
		}
		//System.out.println("Duplicate Element Removed");
		
		for (int i = 0; i < arr.length; i++) {
			//System.out.print(arr[i]);
			if (arr[i]==0) {
				System.out.print("Duplicate at index i=: "+i);
				System.out.println(" ");
				  
				i=i+1;
				System.out.println("Updated  index i"+i);
			}
		}
	}
}
