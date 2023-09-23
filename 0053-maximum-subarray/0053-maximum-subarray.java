class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        //Initialize a currentsum and a maximum to teh 1st numebr in the array
        //Have an for loop starting at index 1 taht goes over evry number
        //teh current sum will store teh max between teh sum soo far + teh current number versus teh current number
        //the maxSum will only update to teh max you've encoutered soo far by comparing itself to currentSum
        //This works since we are dividing arrays with teh currentSum var

        //Return maxSum

        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++){
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    
    }
}