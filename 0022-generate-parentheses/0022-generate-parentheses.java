class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> l = new ArrayList<>();
        
        calParan(n, l, 1,"");
        
        System.out.println(l);
        
    return l;
        
    }
    
    public int calParan(int n, List<String> l, int step, String s) {
        
        if (step > 2 * n) {
            
            if (checkRight(s)) {
                  l.add(s);
            }
          
            return 0;
        }
        
        String t = s + '(';
        
        calParan(n, l, step + 1 , t);
        
         String u = s + ')';
        
        calParan(n, l, step + 1, u);
        
        return 0;
    }
    
    public boolean checkRight(String s) {
        Stack<Character> l = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                l.push('(');
                
            }
            else {
                if (l.size() > 0) {
                    l.pop();
                }
                else {
                    return false;
                }
            }
        } 
        
        if (l.size() == 0) {
            return true;
        }
        
        return false;
    }
                        
    
    
}