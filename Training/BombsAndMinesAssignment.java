package Training;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class BombsAndMinesAssignment {
	
	
	public static void placedMines() {
		int minesPlaced = 0;
		while(minesPlaced > MINES) {
			int row = (int)(Math.random() * rows);
			int col = (int)(Math.random(0 * cols));
			if
		}
	
	
	public static void MineGame(int[][] matrix, int n, int x,int y) {
	    
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
		int EmptyPlaces = (n*n) - n;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] matrix = new int[n][n];
	    int User_Input = s.nextInt();
		int numberOfEmptySpaces = (n*n) - n;
		int x = s.nextInt();
		int y = s.nextInt();
		MineGame(matrix,n,x,y);
		if((x+y) > numberOfEmptySpaces) {
			System.out.println("Invalid Input");
		}
	}
}
