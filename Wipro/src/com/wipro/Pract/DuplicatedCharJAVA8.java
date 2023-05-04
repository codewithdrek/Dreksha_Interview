package com.wipro.Pract;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicatedCharJAVA8 {

	
	//bus rat lo
	public static void main(String[] args) {
		// given input string
		String input = "MADAM";
		
		//List<String> l=Arrays.asList("MADAM","BJS","MADAM");



   //  System.out.println(input.chars().count());
		System.out.println(input);
     System.out.println(input.chars().mapToObj(c -> (char)c).collect(Collectors.toList()));
	
	Map<Character, Long> map2 =input.chars().mapToObj(c->(char)c).collect(Collectors
			.groupingBy(c ->c,Collectors.counting()));

	//System.out.println(l.stream().distinct().collect(Collectors.toSet()));
	
	map2.forEach((k,v)->
	
	{ 
		if(v>1) {
		//	System.out.println(k+":"+v);
		}
		
	});
	
	}
	
}
	
	
	
/*
 * // convert string into stream 
 * 
 * System.out.println(input.chars().mapToObj(c -> (char) c)
 * .collect(Collectors.groupingBy(c -> c, Collectors.counting())));
 * 
 * 
 * result.forEach((k, v) -> { if (v > 1) { System.out.println(k + " : " + v); }
 * }); }
 */