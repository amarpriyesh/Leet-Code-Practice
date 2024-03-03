class Solution {
    Set<String> set;
    int[] arr;
    public boolean wordBreak(String s, List<String> wordDict) {
        set = new HashSet<>();
        arr = new int[s.length()];
        
        for (String st : wordDict) {
            set.add(st);
        }
      
        
        return helper(s, 0);
        
        
        
    }
    
    public boolean helper(String s, int start) {
        boolean isTrue = false;
       
       
        if (start == s.length()) {
            return true;
        }
        if (arr[start] == 1) {
           
            return true;
        }
           if (arr[start] == 2) {
           
            return false;
        }
        
        
        
        for(int i = start; i <= s.length(); i++) {
            if (set.contains(s.substring(start, i))) {
               isTrue = helper(s, i);
                if(isTrue) {
                    arr[start] = 1;
                    break;
                }
            }
        }
        if(isTrue) {
            return true;
        }
        arr[start] = 2;
        return false;
    }
}