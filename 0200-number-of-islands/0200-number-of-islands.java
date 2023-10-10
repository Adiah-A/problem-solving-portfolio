class Solution {
    public int numIslands(char[][] grid) {
        //Go through each cell in teh array and for each cell,
        //if the number is 1, you have found an island
        //Traverse all of it, altering the zeros to 1s 

        int totalIslands = 0;

        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                if(grid[row][col] == '1'){
                    totalIslands ++; 
                    dfs(grid, row, col);
                }
            }
        }

        return totalIslands;
    }

    private void dfs(char[][] grid, int row, int col){
        if(!isValid(grid, row, col)){
            return;
        }

        if(isValid(grid, row, col) && grid[row][col] == '0'){
            return;
        }

        grid[row][col] = '0';

        dfs(grid, row+1, col);
        dfs(grid, row, col+1);
        dfs(grid, row-1, col);
        dfs(grid, row, col-1);

    }


    private boolean isValid(char[][] grid, int row, int col){
        return (row >= 0 && col >= 0 && row < grid.length && col < grid[row].length);
    }
}