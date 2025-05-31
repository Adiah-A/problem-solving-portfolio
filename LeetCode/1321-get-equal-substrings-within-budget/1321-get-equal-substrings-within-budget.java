class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        //left and right pointer in one of them
        //check correspondance and cost each time to updte window as you go

        int left = 0;
        int res = Integer.MIN_VALUE;
        int cost = 0;
        int n = s.length();

        for(int right = 0; right < n; right ++){
            cost += (Math.abs(s.charAt(right) - (t.charAt(right))));

            if(cost <= maxCost){
                res = Math.max(res, (right - left + 1));
            }else{
                cost -= (Math.abs(s.charAt(left) - (t.charAt(left))));
                left ++;
            }
        }

        return (res == Integer.MIN_VALUE)? 0 : res;
    }
}