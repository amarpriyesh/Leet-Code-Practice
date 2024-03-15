class Solution {
    public boolean isRobotBounded(String instructions) {
       int[] start = new int[]{0, 0};
       char[] direction = new char[]{'N', 'E', 'S', 'W'};
       int currentDirection = 0;
       
        int j = 0;
        
      
        for (int i = 0; i < instructions.length(); i++) {
               System.out.println(Arrays.toString(start));
            if (instructions.charAt(i) == 'L') {
                if (currentDirection == 0) {
                    currentDirection = direction.length - 1;
                    continue;
                }
                currentDirection--;
            }
            
             else if (instructions.charAt(i) == 'R') {
                if (currentDirection == direction.length - 1) {
                    currentDirection = 0;
                     continue;
                }
                currentDirection++;
            }
            
            else if (instructions.charAt(i) == 'G') {
                
                 switch (direction[currentDirection]) {
                    
                case 'N': ++start[1];
                    break;
                case 'E': ++start[0];
                    break;
                case 'S': --start[1];
                    break;
                case 'W': --start[0];
                    break;
                default:
                    break;
            }
                
            }
            
        
            
         
        }
            
           if (start[0] == 0 && start[1] == 0) {
                return true;
            }
        if (currentDirection == 0) {
            return false;
        }
        
        
        return true;
        
    }
}