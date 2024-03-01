class Solution:
    def divisorGame(self, n: int) -> bool:
        
        if n <= 1:
            return False
        if n == 2:
            return True
        
        for i in range(1, n):
            if (n % i) == 0:
                return not self.divisorGame(n - i)
            
        
                
        