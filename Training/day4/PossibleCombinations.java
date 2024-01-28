package Training;
import java.util.*;
import java.util.List;

public class PossibleCombinations {
	
	private static HashMap<String,char[]> mp = new HashMap<>();
	
	public static  void helper(String str, int i, StringBuilder current, List<String> answer) {
		if(i==str.length()) {
			answer.add(current.toString());
			return;
		}
		String key = String.valueOf(str.charAt(i));
		if(mp.containsKey(key)) {
			char[] chars = mp.get(key);
			for(char c : chars) {
				current.append(c);
				helper(str,i+1,current,answer);
				current.deleteCharAt(current.length()-1);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		mp.put("1", new char[] {'Z','Y','A'});
		mp.put("2", new char[] {'B','O'});
		mp.put("12", new char[] {'L'});
		mp.put("3", new char[] {'U','P'});
		List<String> answer = new ArrayList<>();
		String str = "123";
		helper(str,0,new StringBuilder(), answer);
		System.out.println(answer);
	}
}
