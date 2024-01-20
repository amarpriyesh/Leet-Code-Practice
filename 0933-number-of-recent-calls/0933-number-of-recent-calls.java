class RecentCounter {
    
    Queue<Integer> lis;
    public RecentCounter() {
    lis = new LinkedList<>();
    }
    
    public int ping(int t) {
        lis.add(t);
       
        while (lis.peek() < t - 3000) {
            lis.poll();
        }
       
        
        return lis.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */