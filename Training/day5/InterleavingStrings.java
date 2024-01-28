package Training;
import java.util.List;
import java.util.ArrayList;
public class InterleavingStrings {
	
	public static void helper(String str1, String str2, int i, int j,StringBuilder current, List<String> answer) {
		if(i == str1.length() && j == str2.length()){
			answer.add(current.toString());
			return;
		}
		if(i < str1.length()) {
			 helper(str1, str2,i+1,j,current.append(str1.charAt(i)), answer);
			 current.deleteCharAt(current.length() - 1);
		}
		if(j < str2.length()) {
			helper(str1,str2,i,j+1,current.append(str2.charAt(j)), answer);
			current.deleteCharAt(current.length() - 1);
		}
	}

	public static void main(String[] args) {
	   String str1 = "AB";
	   String str2 = "CD";
	   List<String> answer = new ArrayList<>();
	   helper(str1,str2,0,0,new StringBuilder(),answer);
	   for(String ans : answer) {
		   System.out.println(ans);
	   }
	}
}
