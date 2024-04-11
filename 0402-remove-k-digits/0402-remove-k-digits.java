class Solution {
    public String removeKdigits(String num, int k) {
        
       int j = 0;
        if (num.length() == k) {
            return "0";
        }
        
        Stack<Character> st = new Stack<>();
        st.push(num.charAt(0));
        
        for (int i = 1; i < num.length(); i ++) {
            
            while (j < k && st.size() > 0 && num.charAt(i) < st.peek()) {
                  st.pop();
                j++;
                
            }
          st.push(num.charAt(i));
        }
        
        while (j < k) {
            st.pop();
            j++;
        }
        
        String res = "";
        boolean start = false;
        for (Character ch : st) {
            if (ch != '0') {
                start = true;
            }
            if ( start) {
                res += ch;
            }
            
        }
        
       //System.out.println(res);
        
      
        return  res.length() > 0 ? res : "0";
        
        
        
        
        
    }
}