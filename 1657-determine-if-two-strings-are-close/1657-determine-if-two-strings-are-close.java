class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length() ) {
            return false;
        }
        
    Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map1 = new HashMap<>();
        
        word1.chars().forEach(a -> map.put((char) a , map.getOrDefault((char) a, 0) + 1));
        word2.chars().forEach(a -> map1.put((char) a , map1.getOrDefault((char) a, 0) + 1));
                                                      
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
                              
        map.values().stream().forEach(a -> l1.add(a));
                              map1.values().stream().forEach(a -> l2.add(a));
        
       for(Character c: map.keySet()){
           if (!map1.keySet().contains(c)) {
               return false;
           }
       }
        
                              
       Collections.sort(l1);
       Collections.sort(l2);
       
      
        if(l1.size() != l2.size()){
            return false;
        }
                          
                              for (int i = 0; i < l1.size(); i++) {
                                  if (!l1.get(i).equals(l2.get(i))) {
                                        
                                      return false;
                                  }
                              }
                              
    
                              
                              
    return true;
                              
       
        
                            
        
        
                                                      
    
                                                      
                                                     
                              
        
    }
}