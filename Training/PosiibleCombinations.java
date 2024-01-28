package Training;

import java.util.Scanner;
import java.util.HashMap;
import java.util.List;

public class PosiibleCombinations {

	private HashMap<Character, char[]> mp; // Create a HashMap storing String as the the key and a character array as
											// value

	static {                              
		mp = new HashMap<>();                //Initialize the HashMap
		mp.put('1',new char[]{'Z','Y','A'});  //Declare Key Value pair in the HashMap
		mp.put('2',new char[]{'B','O'});
		mp.put('12',new char[]{'L'});
		mp.put('3',new char[]{'U','P'});
	}

	// Recursive function to calculate the number of possible combinations
	public static void helper(String str, int index, StringBuilder current, List<String> answer) {
		if (index == str.length()) { // Base Case: if Index equal to length of String
			answer.add(current.toString()); // Add the StringBuilder directly to the ArrayList
			return;
		}
		char digit = str.charAt(index); // Access the digit at given index in a String
		if (mp.containsKey(digit)) { // Check if the digit is present in the HashMap
			for (char c : mp.get(digit)) { // Traverse through the desired digit in the HashMap
				current.append(c);
				helper(str, index + 1, current, answer); // Recursively call the function for (i+1)th index
				current.deleteCharAt(current.length() - 1);
			}
		} else {
			helper(str, index + 1, current.append(c), answer); // Recursive call the
			current.deleteCharAt(current.length() - 1);
		}
	}

	public static void PossibleCombinations(String str) {
		List<String> answer = new ArrayList<>(); // Create an List of String type to store the combinations
		helper(str, 0, new StringBuilder(), answer); // Call the helper function for calculating all the possible
														// combinations

		System.out.println(answer);
	}

	public static void main(String[] args) {
		String str = "123";
		PossibleCombinations(str);
	}
}
