package Training;


	import java.util.Scanner;
	import java.util.Random;

	public class Minesweeper {
	    private char[][] board;
	    private int boardLength;
	    private int numMines;

	    public Minesweeper(int boardLength, int numMines) {
	        this.boardLength = boardLength;
	        this.numMines = numMines;
	        this.board = new char[boardLength][boardLength];
	        initializeBoard();
	        placeMines();
	    }

	    private void initializeBoard() {
	        for (int i = 0; i < boardLength; i++) {
	            for (int j = 0; j < boardLength; j++) {
	                board[i][j] = '-';
	            }
	        }
	    }

	    private void placeMines() {
	        Random random = new Random();
	        int minesPlaced = 0;

	        while (minesPlaced < numMines) {
	            int x = random.nextInt(boardLength);
	            int y = random.nextInt(boardLength);

	            if (board[x][y] != 'M') {
	                board[x][y] = 'M';
	                minesPlaced++;
	            }
	        }
	    }

	    private void displayBoard() {
	        for (int i = 0; i < boardLength; i++) {
	            for (int j = 0; j < boardLength; j++) {
	                System.out.print(board[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    private boolean isValidMove(int x, int y) {
	        return x >= 0 && x < boardLength && y >= 0 && y < boardLength && board[x][y] != 'X';
	    }

	    private boolean isMine(int x, int y) {
	        return board[x][y] == 'M';
	    }

	    private int countAdjacentMines(int x, int y) {
	        int count = 0;

	        for (int i = x - 1; i <= x + 1; i++) {
	            for (int j = y - 1; j <= y + 1; j++) {
	                if (isValidMove(i, j) && isMine(i, j)) {
	                    count++;
	                }
	            }
	        }

	        return count;
	    }

	    private void revealBoard() {
	        for (int i = 0; i < boardLength; i++) {
	            for (int j = 0; j < boardLength; j++) {
	                if (board[i][j] == 'M') {
	                    board[i][j] = 'X';
	                }
	            }
	        }
	    }

	    public void playGame() {
	        Scanner scanner = new Scanner(System.in);
	        int remainingCells = boardLength * boardLength - numMines;

	        while (remainingCells > 0) {
	            
	            System.out.print("Enter row and column ");
	            int x = scanner.nextInt();
	            int y = scanner.nextInt();

	            if (!isValidMove(x, y)) {
	                System.out.println("Invalid move");
	                continue;
	            }

	            if (isMine(x, y)) {
	                System.out.println("Game over! You hit a mine.");
	                revealBoard();
	                displayBoard();
	                break;
	            } else {
	                int adjacentMines = countAdjacentMines(x, y);
	                board[x][y] = (char) (adjacentMines + '0');
	                remainingCells--;

	                if (remainingCells == 0) {
	                    System.out.println("Congratulations! You won!");
	                    displayBoard();
	                }
	            }
	        }

	        scanner.close();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the board length: ");
	        int boardLength = scanner.nextInt();

	        System.out.print("Enter the number of mines: ");
	        int numMines = scanner.nextInt();

	        Minesweeper 1 = new Minesweeper(boardLength, numMines);
	        minesweeper.playGame();

	        scanner.close();
	    }
	}

