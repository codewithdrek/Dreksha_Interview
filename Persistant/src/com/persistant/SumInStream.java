package com.persistant;

import java.util.Arrays;
import java.util.List;

public class SumInStream {

	public static void main(String[] args) {
		
		//1 way
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		Integer sum = integers.stream()
		  .mapToInt(Integer::intValue)
		  .sum();
		
		//2 way
		Integer sum2 = integers.stream().filter(n->n>3).map(n->n*2)
				.reduce(0,  (a, b) -> a + b);
		
		//3 way
		Integer sum3 = integers.stream().filter(n  -> n>2).map(n-> n*2)
				.reduce(0,Integer::sum);
		
		System.out.println(""+sum);
		System.out.println(""+sum2);
		System.out.print(sum3);
		
		//Arrays.asList convert Array to List
	}

	
}

//SQL Notes
/*
 * @Native Query : only sql
 * 
 * @Query: all HQL , JPQL
 * 
 * @Named Query : we can give name to any query
 * 
 * @Typed Query
 * 
 * 
*/

//Java 8 
//Optional Class check and handle Null and absent value

//Spring Security 
//API GATE WAY : 
//Circuit breakup : Spring BOOT
//@Value
//@Transactional : query agar ek fail hoye to all query roll back
//Transit :that bank id will not flow over the streams  in small small packet

//deep Copy ,  no changes will come , becz completly new obj is created, copying obj one by one
//Shallow copy : object refrence is der , if any change in old one will reflect in new Object 
