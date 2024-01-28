package Training;
import java.util.*;
public class NumberOfIslands {
	
	public static void dfs(String[][] matrix,int i, int j, int rows, int cols) {
		if(i<0 || i>=rows || j<0 || j>=cols || matrix[i][j] == "0") {
			return;
		}
		matrix[i][j] = "0";
		dfs(matrix,i+1,j,rows,cols);
		dfs(matrix,i-1,j,rows,cols);
		dfs(matrix,i,j+1,rows,cols);
		dfs(matrix,i,j-1,rows,cols);
	}
	
	public static int NumberIslands(String[][] matrix) {
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return 0;
		}
		int IslandCount = 0;
		int numRows = matrix.length;
		int numCols = matrix[0].length;
		for(int i=0;i<numRows;i++) {
			for(int j=0;j<numCols;j++) {
				if(matrix[i][j] == "1") {
					IslandCount++;
					dfs(matrix,i,j,numRows,numCols);
				}
			}
		}
		return IslandCount;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[][] matrix = {
				{"1","1","1","1","0"},
				{"1","1","0","1","0"},
		        {"1","1","0","0","0"},
	            {"0","0","0","0","0"}};
		int islands = NumberIslands(matrix);
		System.out.println(islands);

	}

}
