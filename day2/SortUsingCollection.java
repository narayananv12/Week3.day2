package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class SortUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] companies = {"Google","Microsoft","TestLeaf","Maverick", "Wipro", "HCL" , "CTS", "Aspire Systems"};
		Set<String> strComp = new TreeSet<String>();
		
		for(String string : companies) {
			strComp.add(string);
		}
		System.out.println(strComp);

	}

}
