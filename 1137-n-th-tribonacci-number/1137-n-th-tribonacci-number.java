class Solution {
    int[] dp = new int[38];
    public int tribonacci(int n) {
        if (dp[n] != 0) {
            return dp[n];
        }
     switch(n) {
         case 0:
             return 0;
            
         case 1:
             return 1;
           
         case 2:
             return 1;
            
         default:
             break;
             
     }
        dp[n] = tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1);
        return dp[n];
        
    }
}