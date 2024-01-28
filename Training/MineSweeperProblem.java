package Training;
import java.util.*;
public class MineSweeperProblem {
	
	public static void exit() {
		return;
	}
		
	public static void InitialiseBombs(char[][] matrix) {  /*Function to place the Bombs in the Matrix*/
		int rows = matrix.length;
		int cols = matrix[0].length;
		for(int i=0;i<matrix.length;i++) {
			int row = (int)(Math.random()*rows);
			int col = (int)(Math.random()*cols);
			if(matrix[row][col] == 'M') {
				matrix[row][col] = 'B';
			}else {
				i--;
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Input given by the User:");
		int n = s.nextInt();
			
		char[][] matrix = new char[n][n];
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				matrix[i][j] = '1';
			}
		}
		System.out.println("Enter the number of mines:");
		int mines = s.nextInt();
		InitialiseBombs(matrix);
		
		if(mines > ((n*n) - n)){
			System.out.println();
			for(int i=0;i<matrix.length;i++) {
				for(int j=0;j<matrix[0].length;j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
		}else {
			int num = 0;
			for(int i=0;i<n;i++) {
				System.out.println("Enter the value of x coordinate:");
				int xCoordinate = s.nextInt();
				System.out.println("Enter the value of y coordinate:");
				int yCoordinate = s.nextInt();
				if(matrix[xCoordinate][yCoordinate] == 'B') {
					num++;
					break;
				}	
			}		
		}
		for(int i=0;i<matrix.length;i++){
		   for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j] + " ");
		   }
		  System.out.println();
	    }
		System.out.println("You Won the Game:");
	  
		exit();
	}
}
