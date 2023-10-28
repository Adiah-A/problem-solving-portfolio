
import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        //Have a map for teh rows, one for the columns and one for a 3x3 square
        //the index for each map will be maped to a set
        //if you find a number in these three groups within their respective boundaries that has 
        //already been encountered, retunr false

        HashMap<Integer, HashSet<Character>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Character>> cols = new HashMap<>();
        HashMap<Map.Entry<Integer, Integer>, HashSet<Character>> square = new HashMap<>();

        //Go through the whole board
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                char value = board[i][j];

                //ignore an empty space
                if(value == '.'){
                    continue;
                }

                Map.Entry<Integer, Integer> squareCoord = new AbstractMap.SimpleEntry<Integer, Integer>(i/3,j/3);

                //Return false if this value is already is already in teh row, column or square
                if((rows.containsKey(i) && rows.get(i).contains(value)) || 
                    ( cols.containsKey(j) && cols.get(j).contains(value))){
                    return false;
                }else if(square.containsKey(squareCoord) && square.get(squareCoord).contains(value)){
                    return false;
                }
                
                //Update rows
                rows.putIfAbsent(i, new HashSet<>());
                rows.get(i).add(value);
                
                //Update columns
                cols.putIfAbsent(j, new HashSet<>());
                cols.get(j).add(value);
                
                //Update square
                square.putIfAbsent(squareCoord, new HashSet<>());
                square.get(squareCoord).add(value);
            }
        }

        return true;
        
    }
}