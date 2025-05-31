class Solution {
    public int largestAltitude(int[] gain) {
        
        int res = 0; //since original[0] is always 0
        int prev = 0;

        for(int i = 0; i < gain.length; i++){
            res = Math.max(res, (prev + gain[i]));
            prev += gain[i];
        }

        return res;
    }
}