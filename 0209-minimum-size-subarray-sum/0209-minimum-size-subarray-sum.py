class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        
       
        size = float("infinity")
        if len(nums) == 1:
            if nums[0] >= target:
                return 1
            else: return 0
        start = 0
        end = 1
        sum1 = nums[start] +  nums[end]
        
        
        while (start < end) :
            if (nums[start] >= target or nums[end] >= target):
                return 1
            if sum1 >= target:
                size =  min(size, end - start + 1)
                sum1 -= nums[start]
                start += 1
            else:
                if end == len(nums) - 1 and size == float("infinity"):
                    return 0
                elif end == len(nums) - 1:
                    return size
                
                end += 1
                sum1 += nums[end]
                
        return size
                
                
                    
            
            
            
                
                
            
            
            
  
                
                    
                
                    
                    
                
        