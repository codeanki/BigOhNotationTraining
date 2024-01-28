package Training;
import java.util.Scanner;
public class SearachInMatrix {
	
	public static boolean SearchInSortedMatrix(int[][] matrix, int target) {
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
		int rows = matrix.length;
		int cols = matrix[0].length;
		int row = 0, col = cols - 1;
		while(row < rows && col >= 0) {
			int current = matrix[row][col];
			if(current == target) {
				return true;
			}else if(current < target) {
				row++;
			}else {
				col--;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target = 3;
		boolean result = SearchInSortedMatrix(matrix,target);
		System.out.println(result);
	}
}
