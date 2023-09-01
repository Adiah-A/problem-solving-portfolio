class Solution {
    public void rotate(int[][] matrix) {
         int n = matrix.length;
        
        for(int i = 0; i < n ; i++){
            int firstRow = 0;
            int lastRow = n-1;

            while(firstRow < lastRow){
                int temp = matrix[firstRow][i];
                matrix[firstRow][i] = matrix[lastRow][i];
                matrix[lastRow][i] = temp;

                firstRow ++;
                lastRow --;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}