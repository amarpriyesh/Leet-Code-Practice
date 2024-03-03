class Solution {
    
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> st = new ArrayList();
        int k = groups[0];
        st.add(words[0]);
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] != k) {
                k = groups[i]; 
                st.add(words[i]);
            }
        }
        
        return st;
        
    }
    
  
}