class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        customDict = {}
        freq  = 0
        for k in nums:
            curr = customDict.get(k, 0) + 1
            freq = max(freq, curr)
            customDict[k] =  curr
        
        res = 0
        for j in customDict.keys():
            if customDict[j] == freq:
                res += freq
            
      
        
        
        
      
        return res