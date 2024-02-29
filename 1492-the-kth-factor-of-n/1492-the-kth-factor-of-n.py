class Solution:
    
    def kthFactor(self, n: int, k: int) -> int:
        i = 0
        div = 1
        res = 0
        fac = []
        rev = []
        if n == 1:
            return 1
        
        while i <= k and ( div ** 2 <= n):
            if n % div == 0:
                i += 1
                fac.append(div)
                if n // div != div:
                    rev.append(n // div)
                if i == k:
                    break
            div += 1
            
        
        
            
        
        
        if i == k:
            return  div
        rev.sort()
        fac.extend(rev)
        print(fac)
        
        if (len(fac)) >= k:
           
            return fac[k - 1]
        
        print(fac)
            
            
            
        return -1
        