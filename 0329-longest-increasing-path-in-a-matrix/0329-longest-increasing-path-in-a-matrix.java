class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int maxPath = 0;
        int[][] memoize = new int[matrix.length][matrix[0].length];
        int prev = Integer.MIN_VALUE;

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col ++){
                maxPath = Math.max(maxPath, dfs(matrix , memoize, row,  col, prev));
            }
        }

        return maxPath;
    }

    private int dfs(int[][] matrix , int[][] memoize, int row,  int col, int prev){
        if(!isValid(matrix, row, col) || matrix[row][col] <= prev){
            return 0;
        }

        if(memoize[row][col] != 0){
            return memoize[row][col];
        }

        int longest = 0;

        longest = Math.max(longest, dfs(matrix , memoize, row+1,  col, matrix[row][col]));
        longest = Math.max(longest, dfs(matrix , memoize, row-1,  col, matrix[row][col]));
        longest = Math.max(longest, dfs(matrix , memoize, row,  col+1, matrix[row][col]));
        longest = Math.max(longest, dfs(matrix , memoize, row,  col-1, matrix[row][col]));

        longest ++;

        memoize[row][col] = longest;

        return longest;
    }

    private boolean isValid(int[][] grid, int row, int col){
        return (row >= 0 && col >= 0 && row < grid.length && col < grid[0].length);
    }
}