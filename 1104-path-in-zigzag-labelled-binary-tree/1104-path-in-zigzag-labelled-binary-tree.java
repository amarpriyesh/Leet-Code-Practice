class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        
       
        
        List<Integer> in = new ArrayList<>();
        
       
        int level = level(label);
        int pos;
        if(level % 2 != 0) {
            pos = label;
        }
        else {
            pos = (int)Math.pow(2, level - 1) * 3 - label - 1 ;
        }
        
        while (pos != 1) {
            in.add(label);
            int child = (int) pos / 2;
            level --;
             if(level % 2 != 0) {
            label = child;
        }
        else {
            label = (int)Math.pow(2, level - 1) * 3 - child - 1 ;
        }
           pos = child;
          
            
            
            
        }
        in.add(1);
        Collections.sort(in);
        
        return in;
        
        
    }
    
    public int level(int k) {
        int j = 1;
         while(Math.pow(2,j) <= k) {
            j++;
        }
        
        return j;
    }
}