class Solution {
   int[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        
        return helper(0, 0, obstacleGrid);
        
       
        
        
    }
    
    
    public int helper(int x, int y, int[][] grid ) {
        if (dp[x][y] != 0) {
            return dp[x][y];
        }
        if (x == grid.length - 1 && y == grid[0].length  - 1) {
            if ( grid[x][y] == 1) {
            return 0;
        }
            return 1;
        }
        else if ( grid[x][y] == 1) {
            return 0;
        }
        else if (x < grid.length - 1 && y < grid[0].length - 1) {
            dp[x][y] =  helper(x + 1, y, grid) +  helper(x , y + 1, grid);
            return  dp[x][y];
        }
         else if (x == grid.length - 1 && y < grid[0].length - 1) {
             dp[x][y] =  helper(x, y + 1, grid);
            return  dp[x][y];
        }
        else if (x < grid.length - 1 && y == grid[0].length - 1) {
            dp[x][y] =  helper(x + 1, y, grid);
             return  dp[x][y];
        }
        return 0;
     
    }
    
}