class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();
        

        

        
        boolean isValid = true;

        int x = 0;
        int y = 0;

        int top = 0;
        int bottom = matrix.length;
        int left = 0;
        int right = matrix[0].length;
        

        while (top < bottom || left < right) {
           
        
            if (x >= right) {
                break;
            }
            while (x < right) {
              
                list.add(matrix[y][x]);
                x += 1;
            }
            top += 1;
            y += 1;
            x -= 1;

            if (y >= bottom) {
                break;
            }

            while (y < bottom) {
                
                 list.add(matrix[y][x]);
                y += 1;

            }

            right -= 1;
            x -= 1;
            y -= 1;

            if (x < left) {
                break;
            }

            while (x >= left) {
              

                list.add(matrix[y][x]);
                x -= 1;

            }

            bottom -= 1;
            y -= 1;
            x += 1;

             if (y < top) {
                break;
            }

            while (y >= top) {
                list.add(matrix[y][x]);
                y -= 1;

            }

            left += 1;
            x += 1;
            y += 1;

            
        }

        return list;
        
    }
}