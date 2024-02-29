class Solution:
    
    def kthFactor(self, n: int, k: int) -> int:
        i = 0
        div = 1
        res = 0
        
        while i <= k and ( div <= n):
            if n % div == 0:
                i += 1
                if i == k:
                    break
            div += 1
            
        
        
            
        
        
        if i == k:
            return  div
        return -1
        