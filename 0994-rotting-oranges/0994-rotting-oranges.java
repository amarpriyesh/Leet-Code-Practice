class Solution {
    private static final int[][] DIRECTIONS = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int orangesRotting(int[][] grid) {
        
        Queue<Integer[]> coor = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    coor.add(new Integer[]{i, j});
                }
                if (grid[i][j] == 1) {
                    set.add(i * grid[0].length + j);
                }
            }
        }
        
        if (set.size() == 0) {
            return 0;
        }
        
        int min = -1;
        Queue<Integer[]> queue = new LinkedList<>();
        
        while (!coor.isEmpty()) {
            Integer[] curr = coor.poll();
            for (int[] in : DIRECTIONS) {
                int row = curr[0] + in[0];
                int col = curr[1] + in[1];
                if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
                    continue;
                }
                else if (grid[row][col] != 2 && grid[row][col] == 1) {
                     queue.add(new Integer[]{row, col});
                    grid[row][col] = 2;
                    set.remove(row * grid[0].length + col);
                }
               
                
            }
            if (coor.isEmpty()) {
                min += 1;
                coor.addAll(queue);
                queue.clear();
            }
            
        }
        
        if (set.size() > 0) {
            return -1;
        }
            
          return min;  
    }
    
    
}