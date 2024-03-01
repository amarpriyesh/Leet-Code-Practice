class Solution:
    mem = {}
    def divisorGame(self, n: int) -> bool:
        
        if n in self.mem.keys():
            return self.mem[n]
        
        if n <= 1:
            return False
        if n == 2:
            return True
        
        for i in range(1, n):
            if (n % i) == 0:
                self.mem[n] = not self.divisorGame(n - i)
                return self.mem[n]
            
        
                
        