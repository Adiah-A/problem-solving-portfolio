class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(dfsBacktrack(board, 0, i, j, word)){
                    return true;
                }
            }
        }

        return false;
    }

  private static boolean dfsBacktrack(char[][] board, int k, int row, int col, String word){
    if( !isValid(row, col, board) || board[row][col] != word.charAt(k)){
      return false;
    }

    if(k == word.length() -1){
      return true;
    }

    char temp = board[row][col];
    board[row][col] = '/';

    boolean isMatch = dfsBacktrack(board, k+1, row+1, col, word) || 
        dfsBacktrack(board, k+1, row, col+1,   word) || dfsBacktrack(board, k+1, row-1, col, word) 
        ||  dfsBacktrack(board, k+1, row, col-1, word);

    board[row][col] = temp;

    return isMatch;
  }

  private static boolean isValid(int row, int col, char[][] board){
    return (row >= 0 && col >= 0 && row < board.length && col < board[0].length);
  }
}