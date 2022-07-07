package algoritmos;

public class RobotsChallenge {
    public static void main(String[] args) {
        int[][] grid = {{1, 0, 0, 1}, {1, 0, 1, 0}};
        boolean result = RobotsChallenge.solution(grid, 2);
        System.out.println(result);
    }
    public static boolean solution(int[][] grid, int countRobots) {
        for (var row = 1; row < grid.length; row++) {
            int rowRobots = 0, lastUsedIndex = -1;
            for ( var col = 0; col < grid[0].length; col++ ) {
                if (grid[row][col] == 1) {
                    rowRobots++;
                    if (lastUsedIndex < col - 1 && col > 0 && grid[row-1][col-1] == 1) {
                        lastUsedIndex = col - 1;
                    } else if ( lastUsedIndex < col && grid[row-1][col] == 1) {
                        lastUsedIndex = col;
                    } else if (lastUsedIndex < col+1 && col < grid[0].length-1 && grid[row-1][col+1] == 1) {
                        lastUsedIndex = col+1;
                    } else {
                        return false;
                    }
                }
            }
            if ( countRobots != rowRobots) {
                return false;
            }
        }
        return true;
    }
}
