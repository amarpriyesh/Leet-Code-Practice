class Solution {
    
    int[] dp = new int[10001];
    public int coinChange(int[] coins, int amount) {
        
        
        if (amount > 0 && dp[amount] != 0) {
            return dp[amount];
        }
        
        
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        
        int min = Integer.MAX_VALUE;
        
        for (Integer k :  coins) {
            
            int val = coinChange(coins, amount - k);
            if (val == -1) {
                continue;
            }
          
            min = Math.min(min, val);
            
            
        }
        
        if (min == Integer.MAX_VALUE) {
            dp[amount] = -1;
            return -1;
        }
        
        dp[amount] = min + 1;
        
        
        return dp[amount];
        
    
    }
}