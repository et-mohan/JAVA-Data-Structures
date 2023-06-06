public class NQueens {
public static void placeNQueens(int n) {
int board[][] = new int[n][n];
placeQueens(n,0);
}
private static void placeQueens(int n, int row) {
if(row == n) {
// valid board configuration
}
// check for all columns
// check if its safe to place Queen
// if it’s safe -> then place the queen and move to next row
}
}

///////////////////////////////////N Queens/////////////////////////////

 
public class Solution {

	public static void placeNQueens(int N) {

		int[][] board = new int[N][N];
		placeQueens(board, 0, N);

	}

	private static void placeQueens(int[][] board, int row, int N) {
		// valid board configuration
		if (N == row) {
			print2dArray(board);
			System.out.println();
		}
		// check for all columns
		for (int j = 0; j < N; j++) {
			// check if it is safe to place Queen
			if (isBoardSafe(board, row, j)) {
				board[row][j] = 1;
				// if it is safe -> then place the queen & move to next row
				placeQueens(board, row + 1, N);
				board[row][j] = 0;
			}
		}
	}

	private static boolean isBoardSafe(int[][] board, int row, int column) {
		int N = board.length;
		// for each i and j you need to check in 6 directions, top down, 4 diagonals

		for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		for (int i = row + 1, j = column + 1; i < N && j < N; i++, j++) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		for (int i = row - 1, j = column + 1; i >= 0 && j < N; i--, j++) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		for (int i = row + 1, j = column - 1; i < N && j >= 0; i++, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		for (int i = row - 1; i >= 0; i--) {
			if (board[i][column] == 1) {
				return false;
			}
		}

		for (int i = row + 1; i < N; i++) {
			if (board[i][column] == 1) {
				return false;
			}
		}

		return true;
	}

	public static void print2dArray(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[i][j] + " ");
			}

		}
		System.out.println();
	}

}
