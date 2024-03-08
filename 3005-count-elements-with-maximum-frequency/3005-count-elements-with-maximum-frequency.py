class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        customDict = {}
        for k in nums:
            customDict[k] = customDict.get(k, 0) + 1
        
        k = list(customDict.items())
            
        k.sort(key = lambda x: -x[1])
        val = k[0][1]
        res = 0
        i = 0
        while( i < len(k) and k[i][1] == val ):
            res +=  k[i][1]
            i += 1
        
        
        
      
        return res