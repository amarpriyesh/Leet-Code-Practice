class Solution {

	public void solve (char[][] board) {

		List<Integer> tmp = new LinkedList<>();
		Queue<Integer> processingQ = new LinkedList<>();
		int row = board.length;
		int col = board[0].length;
		boolean mark = false;

		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mark = false;

				if (board[i][j] == 'O') {
                    
                    
					processingQ.add(i * col + j);
					tmp.add(i * col + j);
					board[i][j] = 'e';
					while (!processingQ.isEmpty()) {
						int cr = processingQ.poll();
						int r = cr / col;
						int c = cr % col;
						if (r == 0 || r == row - 1 || c == 0 || c == col - 1) {
						mark = true;
						}
						
						if (r > 0 &&  (board[r - 1][c] != 'e' && board[r - 1][c] != 'X')) {
							board[r - 1][c] = 'e';
							processingQ.add((r - 1) * col + c);
							tmp.add((r - 1) * col + c);
							
						}
						if (r < row - 1 &&  (board[r + 1][c] != 'e' && board[r + 1][c] != 'X')) {
							board[r + 1][c] = 'e';
							processingQ.add((r + 1) * col + c);
							tmp.add((r + 1) * col + c);
							
						}
						if (c > 0 &&  (board[r][c - 1] != 'e' && board[r][c - 1] != 'X')) {
							board[r][c - 1] = 'e';
							processingQ.add(r * col + c - 1);
							tmp.add(r * col + c - 1);
							
						}
						if (c < col - 1 &&  (board[r][c + 1] != 'e' && board[r][c + 1] != 'X')) {
							board[r][c + 1] = 'e';
							processingQ.add(r * col + c + 1);
							tmp.add(r * col + c + 1);
							
						}
						
						
						
					
					}
                 

					if (mark) {
						for (Integer k : tmp ) {
							int r = k / col;
							int c = k % col;
							board[r][c] = 'O';
					
						}
					}
					else {
							for (Integer k : tmp ) {
							int r = k / col;
							int c = k % col;
							board[r][c] = 'X';
					
						}
						
					}
                    tmp = new LinkedList<>();
				}

				
			
			}
		}
		

	}

}