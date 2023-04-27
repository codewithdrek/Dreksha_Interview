package com.higestNum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JAVA8 {

	int[] a= {3,5,7,8,9};
	
	public static void main(String[] args) {
		ArrayList<Integer>  arrayList = new ArrayList<>(Arrays.asList(1,2,4,0,7,7,8,9));
		ArrayList<Integer>  arrayList2  = new ArrayList<>(Arrays.asList(1,2,4,0,7,9));
	    
		
		//CONVERT ARRAY TO LIST
	//	Arrays.asList(1,2,4,0,7,8,9)
		System.out.println(arrayList); //[1,2,4,5,7,8,9)] [LIST of Integer]
		
		//OPEARTION TO SORT AN ARRAY
		System.out.println("SORT"+ arrayList.stream().sorted().collect(Collectors.toList()));
	    //not an Even
		System.out.println("NOT EVEN"+arrayList.stream().filter(n->n%2 !=0).collect(Collectors.toList()));
		
		//Sum of num which are not even
		System.out.println("SUM"+arrayList.stream().filter(n-> n % 2 != 0).reduce(Integer::sum));
		
		//REVERSE ORDER
		System.out.println("REVERSE ORDER"+arrayList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		
		//FindLargestNum
		System.out.println("FindLargestNum"+arrayList.stream().sorted(Comparator.reverseOrder()).findFirst().get());
		
		//FindSecondLargestNum
		System.out.println("FindSecondLargestNum"+arrayList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
		
		//distinct
		System.out.println("distinct"+arrayList.stream().distinct().collect(Collectors.toList()));
	}
	
}