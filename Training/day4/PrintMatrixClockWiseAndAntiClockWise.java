package Training;
import java.util.Scanner;
public class PrintMatrixClockWiseAndAntiClockWise {
	
	public static void printClockWise(int[][] matrix) {
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return;
		}
		int rows = matrix.length;
		int cols = matrix[0].length;
		int top = 0, bottom = rows - 1;
		int left = 0, right = cols - 1;
		while(top <= bottom && left <= right){
			for(int i=left;i<=right;i++) {
				System.out.print(matrix[top][i] + " ");
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				System.out.print(matrix[i][right] + " ");
			}
			right--;
			
			if(top <= bottom) {
				for(int i=right;i>=left;i--) {
					System.out.print(matrix[bottom][i] + " ");
				}
				bottom--;
			}
			if(left <= right) {
				for(int i=bottom;i>=top;i--) {
					System.out.print(matrix[i][left] + " ");
				}
				left++;
			}
		}
	}
	
	public static void printAntiClockWise(int[][] matrix) {
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return;
		}
		int rows = matrix.length;
		int cols = matrix[0].length;
		int top = 0, bottom = rows - 1;
		int left = 0, right = cols - 1;
		while(top <= bottom && left <= right) {
			for(int i = right;i>=left;i--) {
				System.out.print(matrix[top][i] + " ");
			}
			top++;
			for(int i = top;i<= bottom;i++) {
				System.out.print(matrix[i][left] + " ");
			}
			left++;
			if(left < right) {
				for(int i=left;i<=right;i++) {
					System.out.print(matrix[bottom][i] + " ");
				}
				bottom--;
			}
			if(top < bottom) {
				for(int i=bottom;i>=top;i--) {
					System.out.print(matrix[i][right] + " ");
				}
				right--;
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		printClockWise(matrix);
		System.out.println();
		printAntiClockWise(matrix);
	}

}
