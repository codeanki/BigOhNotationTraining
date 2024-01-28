package Training;
import java.util.*;
public class ValidNameString {
	
	public static boolean containsUniqueVowels(String name) {
		String UpperCasename = name.toUpperCase();
		String vowels = "AEIOU";
		for(char c : vowels.toCharArray()) {
			if(UpperCasename.indexOf(c) != UpperCasename.lastIndexOf(c)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean containsTwoConsecutiveS(String name) {
		return name.contains("SS");
	}
	public static boolean containsTBetweenTwoS(String name) {
		int FirstSIndex = name.indexOf("S");
		int secondSIndex = name.indexOf("S", FirstSIndex + 1);
		int TIndex = name.indexOf("T");
		
		return TIndex != -1 && secondSIndex != -1 && TIndex > FirstSIndex && TIndex < secondSIndex;>
	}
	
	public static boolean isNameValid(String name) {
		if(containsUniqueVowels(name)) {
			return false;
		}
		if(containsTwoConsecutiveS(name) && containsTBetweenTwoS(name)) {
			return false;
		}
		
		return true;
		
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		boolean answer = isNameValid(name);
		System.out.print(answer);
	}
}
