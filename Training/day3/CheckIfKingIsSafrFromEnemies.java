package Training;
import java.util.Scanner;
public class CheckIfKingIsSafrFromEnemies {
	
	public static boolean isKingSafe(int[][] chessBoard) {
		int kingRow = -1;
		int kingCol = -1;
		for(int i=0;i<chessBoard.length;i++) {
			for(int j=0;j<chessBoard[i].length;j++) {
				if(chessBoard[i][j] == 6) {
					kingRow = i;
					kingCol = j;
					break;
				}
			}
		}
		if(HorseAttack(chessBoard,kingRow-2,kingCol-1) ||
		   HorseAttack(chessBoard,kingRow-2,kingCol+1) || 
		   HorseAttack(chessBoard,kingRow-1,kingCol+2) || 
		   HorseAttack(chessBoard,kingRow-1,kingCol-2) || 
		   HorseAttack(chessBoard,kingRow+1,kingCol-2) || 
		   HorseAttack(chessBoard,kingRow+1,kingCol+2) || 
		   HorseAttack(chessBoard,kingRow+2,kingCol+1) || 
		   HorseAttack(chessBoard,kingRow+2,kingCol-1)) {
			return false;
		}
		return true;
	}
	
	public static boolean HorseAttack(int[][] chessBoard, int kingRow, int kingCol) {
		return row >= 0 && row < chessBoard.length && col >= 0 && col < chessBoard[row].length && chessBoard[row][col] == 2;
	}
	
	public static boolean ElephantAttack(int[][] chessBoard, int kingRow, int kingCol) {
		 for (int i = 1; kingRow + i < chessBoard.length && kingCol + i < chessBoard[kingRow].length; i++) {
	            if (chessBoard[kingRow + i][kingCol + i] == 5) {  // Assuming 5 represents an elephant
	                return true;
	            }
	        }
	        for (int i = 1; kingRow - i >= 0 && kingCol - i >= 0; i++) {
	            if (chessBoard[kingRow - i][kingCol - i] == 5) {
	                return true;
	            }
	        }
	        for (int i = 1; kingRow - i >= 0 && kingCol + i < chessBoard[kingRow].length; i++) {
	            if (chessBoard[kingRow - i][kingCol + i] == 5) {
	                return true;
	            }
	        }
	        for (int i = 1; kingRow + i < chessBoard.length && kingCol - i >= 0; i++) {
	            if (chessBoard[kingRow + i][kingCol - i] == 5) {
	                return true;
	            }
	        }
	     return false;
	}
	
	public static boolean CamelAttack(int[][] chessBoard, int kingRow, int kingCol) {
		for (int i = 0; i < chessBoard[kingRow].length; i++) {
            if (chessBoard[kingRow][i] == 4 && i != kingCol) {  // Assuming 4 represents a camel
                return true;
            }
        }

        // Check vertically
        for (int i = 0; i < chessBoard.length; i++) {
            if (chessBoard[i][kingCol] == 4 && i != kingRow) {
                return true;
            }
        }

        // Check diagonally
        for (int i = 1; kingRow + i < chessBoard.length && kingCol + i < chessBoard[kingRow].length; i++) {
            if (chessBoard[kingRow + i][kingCol + i] == 4) {
                return true;
            }
        }
        for (int i = 1; kingRow - i >= 0 && kingCol - i >= 0; i++) {
            if (chessBoard[kingRow - i][kingCol - i] == 4) {
                return true;
            }
        }
        for (int i = 1; kingRow - i >= 0 && kingCol + i < chessBoard[kingRow].length; i++) {
            if (chessBoard[kingRow - i][kingCol + i] == 4) {
                return true;
            }
        }
        for (int i = 1; kingRow + i < chessBoard.length && kingCol - i >= 0; i++) {
            if (chessBoard[kingRow + i][kingCol - i] == 4) {
                return true;
            }
        }
        return false;
	}
	
	public static boolean QueenAttack(chessBoard,kingRow,kingCol) {
		return ElephantAttack(chessBoard,kingRow,kingCol) || CamelAttack(chessBoard,kingRow,kingCol);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] chessBoard = {{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,2,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,4,0,0,0,0,0},
				{0,0,0,6,0,0,0,0},
				{0,0,0,0,0,0,0,5},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0}};
		}
	 boolean SafeCondition = isKingSafe(chessBoard);
	 System.out.print(SafeCondition);
	}
}
