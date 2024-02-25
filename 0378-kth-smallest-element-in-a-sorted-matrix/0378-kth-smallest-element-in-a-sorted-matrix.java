class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        Queue<Integer> q = new PriorityQueue<>(k);
        
        for (int i = 0; i < matrix.length; i++) {
            
            for (int j = 0; j < matrix[0].length; j++) {
            
                q.add(matrix[i][j]);
            }
        }
        
        System.out.println(q);
        
        
        
        
        while (q.size() > (matrix.length * matrix.length) - k + 1) {
           q.poll();
        }
        
        return q.peek();
        
        
    }
}