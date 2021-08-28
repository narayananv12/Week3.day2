package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateUsingSET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		//output: we laearn java basics as part of session in week1
		
		String[] word = text.split(" ");
		
		Set<String> uniqueWords = new LinkedHashSet<String>();
		
		for(String eachWord : word) {
			uniqueWords.add(eachWord);
		}
		
		for(String wd: uniqueWords) {
			System.out.print(wd+ " ");
		}
		
		
		
		
		

	}

}
