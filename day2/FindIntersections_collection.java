package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindIntersections_collection {
	public static void main(String[] args) {

		System.out.println("******************Using LIST find the intersection*********");
		Integer arr[] = {3,2,11,4,6,7,8,10 };
		
		Integer arr1[] = {1,2,8,4,9,7,9,10};
				
		List<Integer> intList = new ArrayList<Integer>((Arrays.asList(arr)));
		List<Integer> intList1 = new ArrayList<Integer>((Arrays.asList(arr1)));
		System.out.println("The first array  " + Arrays.asList(arr));
		System.out.println("The second array  " + Arrays.asList(arr1));
		
		intList1.retainAll(intList);
		System.out.println("Intersected elements  : " + intList1);
		
		
		

		
		
		
	   }
		
	}

	
	


