package Training;
import java.util.Scanner;
public class RotateMatrixInplaceBy90Degrees {
	
	public static void transpose(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(i != j) {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = temp;
				}else {
					break;
				}
			}
		}
	}
	
	public static void ReverseRows(int[][] matrix) {
		for(int i=0;i<matrix[0].length;i++) {
			int left = 0;
			int right = matrix[0].length - 1;
			while(left < right) {
				int temp = matrix[i][left];
				matrix[i][left] = matrix[i][right];
				matrix[i][right] = temp;
				left++;
				right--;
			}
		}
	}
	
	public static void RotateMatrixInplace(int[][] matrix) {
		transpose(matrix);
		ReverseRows(matrix);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		RotateMatrixInplace(matrix);
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j]);
			}
		}
	}
}
