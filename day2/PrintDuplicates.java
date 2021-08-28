package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] values = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		Set<Integer> val = new LinkedHashSet<Integer>();
		
		for (Integer eachData : values) {
			
			if(!val.add(eachData)) {
				System.out.println(eachData);
			}
		}
			
	}

}
