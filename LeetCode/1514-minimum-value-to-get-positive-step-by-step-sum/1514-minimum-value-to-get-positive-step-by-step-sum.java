class Solution {
    public int minStartValue(int[] nums) {
        int minSubArraySum = Integer.MAX_VALUE, sum = 0;
        
        for(int num : nums){
            sum += num;
            minSubArraySum = Math.min(minSubArraySum, sum);
        }
        
        if(minSubArraySum >= 1){
            return 1;
        }
        
        //1 = x + minSubArraySum, x = 1 - minSubArraySum. 
        //if x = 0,x = 1. else x = Math.abs(x)
        
        int res = Math.abs(1 - minSubArraySum);
        res = (res == 0)? 1 : res;
        
        return res;
    }
}