class RecentCounter {
    
    List<Integer> lis;
    int start;
    int end;
    
    public RecentCounter() {
    lis = new LinkedList<>();
        start = 0;
        end = 0;
    }
    
    public int ping(int t) {
        lis.add(t);
        end++;
       
     while (lis.get(start) < (t - 3000)) {
         start++;
     }        
       
        
        return end - start;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */