class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count = 0;
        int leftCount = 0;
        int rightCount = 0;
        
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'L'){
                leftCount--;
            }else if(moves.charAt(i) == 'R'){
                rightCount++;
            }
        }
        
        leftCount = Math.abs(leftCount);
        rightCount = Math.abs(rightCount);
        
        if(leftCount == rightCount){
            count = moves.length() - (leftCount + rightCount);
        }else if(leftCount > rightCount){
            leftCount = moves.length() - rightCount;
            count = leftCount - rightCount;
        }else{
            rightCount = moves.length() - leftCount;
            count = rightCount - leftCount;
        }
        
        return Math.abs(count);
    }
}