class RecentCounter {
    
    List<Integer> lis;
    public RecentCounter() {
    lis = new ArrayList<>();
    }
    
    public int ping(int t) {
        lis.add(t);
        int counter = 0;
        for (int i = lis.size() - 1; i >= 0; i--) {
            if (lis.get(i) >= (t - 3000) ) {
                counter++;
            }
            else {
                break;
            }
        }
        
        return counter;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */