package Training;
import java.util.*;
import java.util.Scanner;

public class TicTacToe{
	int Player1;         //Player1 demonstrates the User
	int Player2;         //Player2 demonstrates the Computer/AI
	String UserMove;     //Input Move given by User in the board
	String AIMove;       //Input Move given by AI/computer in the board
}

public class AssignmentTicTacToeGame {
	
	
	
	
	public static String TicTacToe(String[] matrix) {
		for(int i=0;i<8;i++) {
			String ans = null;
			switch(i) {
				case 0:
					ans = matrix[0] + matrix[1] + matrix[2];
					break;
				case 1: 
					ans = matrix[3] + matrix[4] + matrix[5];
					break;
				case 1:
					ans = matrix[6] + matrix[7] + matrix[8];
					break;
				case 3:
					ans = matrix[0] + matrix[3] + matrix[6];
					break;
				case 4:
					ans = matrix[1] + matrix[4] + matrix[7];
					break;
				case 5:
					ans = matrix[2] + matrix[5] + matrix[8];
					break;
				case 6:
					ans = matrix[0] + matrix[4] + matrix[8];
					break;
				case 7:
					ans = matrix[2] + matrix[4] + matrix[6];
					break;
			}
			if(ans.equals("XXX")) {
				return "X";
			}else if(ans.equals("OOO")) {
				return "O";
			}
		}
		for(int i=0;i<9;i++) {
			Arrays.asList(matrix).contains(String.valueOf(i+1)));
		}else if(i == 8) {
			return "Draw";
		}
	}
	

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String[][] matrix = new String[3][3];
		
		//if(PlayerInput == "0") {
		//	System.out.println("Invalid Input");
		//}
		//if(AIInput == "X") {
		//	System.out.println("Invalid Input");
		//}
		String answer = TicTacToe(matrix);
		System.out.println(answer);
	}
}
