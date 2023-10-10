class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        //You have an edge when you are at a border or you met water

        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col ++){
                if(grid[row][col] == 1 && !visited[row][col]){
                    perimeter += findPerimeter(grid, visited, row, col);
                }
                
            }
        }

        return perimeter;
    }

    private int findPerimeter(int[][] grid, boolean[][] visited, int row, int col){
        if(!isValid(grid, row, col)){
            return 1; //you have reached an edge through the grid border, return 1
        }

        if(grid[row][col] == 0){
            return 1; //you have reached an edge through a water border, return 1
        }

        if(visited[row][col]){
            return 0;
        }

        visited[row][col] = true;

        int edges = 0;
        
        edges += findPerimeter(grid, visited, row+1, col);
        edges += findPerimeter(grid,  visited, row, col+1);
        edges += findPerimeter(grid, visited, row-1, col);
        edges += findPerimeter(grid, visited, row, col-1);

        return edges;
    }

    private boolean isValid(int[][] grid, int row, int col){
        return (row >= 0 && col >= 0 && row < grid.length && col < grid[0].length);
    }
}