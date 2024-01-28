package Training;
import java.util.*;
import java.util.HashSet;

public class ValodSudoku {
	
	public static boolean isValid(char[][] sudoku,int startRow, int endRow, int startCol, int endCol) {
		HashSet<Character> set = new HashSet<>();
		for(int i=startRow;i<=endRow;i++) {
			for(int j=startCol;j<=endCol;j++) {
				char current = sudoku[i][j];
				if(current != '.'){
					if(!set.add(current)) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static boolean isValidSudoku(char[][] sudoku) {
		for(int i=0;i<9;i++) {
			if(!isValid(sudoku,i,i,0,8)) {
				return false;
			}
		}
		for(int j=0;j<9;j++) {
			if(!isValid(sudoku,0,8,j,j)) {
				return false;
			}
		}
		for(int i=0;i<9;i=i+3) {
			for(int j=0;j<9;j=j+3) {
				if(!isValid(sudoku,i,i+2,j,j+2)) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[][] sudoku = {{'5','3','.','.','7','.','.','.','.'}
				,{'6','.','.','1','9','5','.','.','.'}
				,{'.','9','8','.','.','.','.','6','.'}
				,{'8','.','.','.','6','.','.','.','3'}
				,{'4','.','.','8','.','3','.','.','1'}
				,{'7','.','.','.','2','.','.','.','6'}
				,{'.','6','.','.','.','.','2','8','.'}
				,{'.','.','.','4','1','9','.','.','5'}
				,{'.','.','.','.','8','.','.','7','9'}};
		boolean answer = isValidSudoku(sudoku);
		System.out.println(answer);
	}
}
