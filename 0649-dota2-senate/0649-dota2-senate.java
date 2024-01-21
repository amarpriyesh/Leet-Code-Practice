class Solution {
    
    
    public String predictPartyVictory(String senate) {
        
       
         Queue<Integer> rQ = new LinkedList<>();
        Queue<Integer> dQ = new LinkedList<>();
        
        IntStream.range(0, senate.length()).forEach(a -> {char c = senate.charAt(a);
                                                         
    if (c == 'R') {
        rQ.add(a);
    } else {
        dQ.add(a);
    } });
        
        int count = senate.length();
        
        
        while (rQ.size() > 0 && dQ.size() > 0) {
            if (rQ.peek() < dQ.peek()) {
                dQ.poll();
                rQ.poll();
                rQ.add(count);
                count++;
            }
            else {
                rQ.poll();
                dQ.poll();
               dQ.add(count);
                count++;
            }
        }
        

      
      

      

        // Process the queues based on the rules (not provided in the code)
        // Modify curr accordingly

        return rQ.size() > 0  ? "Radiant" : "Dire";
    }
}