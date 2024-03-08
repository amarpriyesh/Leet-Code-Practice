class Solution:
    dp = []
    
    def helper(self, m, n, x, y, dp):
        if dp[x][y] != 0:
            return dp[x][y]
        if (x == m - 1) and (y == n -1):
             dp[x][y] = 1
             return dp[x][y]
        if (x < m - 1 and y < n - 1):
            dp[x][y] = (self.helper(m, n, x + 1, y, dp) + self.helper(m, n,x, y + 1, dp))
            return  dp[x][y]
        elif (x < m - 1 and y == n - 1):
            
            dp[x][y] = self.helper(m, n, x + 1, y, dp)
            return dp[x][y] 
        elif (x == m - 1 and y < n - 1):
            dp[x][y] = self.helper(m, n,x, y + 1, dp)
            return  dp[x][y]
        
    def uniquePaths(self, m: int, n: int) -> int:
        dp = [[0] * n for _ in range(m)]
        
        l = self.helper(m, n, 0, 0, dp)
        
        return l
        
        
        
        
        
    
        