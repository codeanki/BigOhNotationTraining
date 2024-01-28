package Training;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromArray {
	
	public static Integer[] RemoveDuplicateElements(int[] arr) {
		ArrayList<Integer> unique = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		for(int num : arr) {
			if(!set.contains(num)) {
				unique.add(num);
			}
			set.add(num);
		}
		Integer[] result = new Integer[unique.size()];
		for(int i=0;i<unique.size();i++) {
			result[i] = unique.get(i);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,9,8,2};
		Integer[] result = RemoveDuplicateElements(arr);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i] + " ");
		}
	}
}
