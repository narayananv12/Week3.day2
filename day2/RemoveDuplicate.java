package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		String text = "PayPal India";
		String text1 = text.toLowerCase(); 
		String retext = text1.replaceAll("\\s", " ");
		
		//convert it into a character array
		char[] charArray = text1.toCharArray();
		
		//Declare a set a s charset for character
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		
		for(char c : charArray) {
			boolean add = charSet.add(c);
			
			//if the character is already in the charSet then, add it to the dupCharSet
			
			if(add == false) {
				
				dupCharSet.add(c);
				
			}
		}
		
		System.out.println("The Duplicate Characters  :" + dupCharSet);
		charSet.removeAll(dupCharSet);
		System.out.println("The Character Set after removing Duplicates  :" + charSet);
	}
	

}
