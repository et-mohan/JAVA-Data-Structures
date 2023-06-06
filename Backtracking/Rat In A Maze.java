
public class Solution {

	public static boolean ratInAMaze(int maze[][]){

		int n = maze.length;
        int path[][] = new int[n][n];
         return solveMaze(maze, 0, 0, path);
	}
       public static boolean solveMaze(int[][] maze, int i, int j, int[][] path) {
//        Checking if the current cell which we are going to traverse is a valid cell or not?
        if (i < 0 || i >= maze.length || j < 0 || j >= maze.length || maze[i][j] == 0 || path[i][j] == 1) {
            return false;
        }
//        Including the current cell to be in path[i][j]
        path[i][j] = 1;
//        Checking if the current cell is destination cell or not
        if (i == maze.length - 1 && j == maze.length - 1) {
//            printing the path before returning
            return true;
        }
//        Explore further the maze in all direction
//        Top Direction
        if (solveMaze(maze, i - 1, j, path)) {
            return true;
        }
//        Right Direction
        if (solveMaze(maze, i, j + 1, path)) {
            return true;
        }
//        Bottom Direction
        if (solveMaze(maze, i + 1, j, path)) {
            return true;
        }
//        Left Direction
        if (solveMaze(maze, i, j - 1, path)) {
            return true;
        }
        return false;
    }
}
