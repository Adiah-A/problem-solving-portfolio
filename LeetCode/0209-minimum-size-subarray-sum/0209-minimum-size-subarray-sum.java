class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //might need prefix sum array or not. actually, not. 
        //when sum is greater, move left
        //when sum is less, move right

        int left = 0, right = -1;
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        int sum = 0;

        while(right < n){
            if(sum < target){
                right ++;

                if(right >= n){
                    continue;
                }

                sum += nums[right];
            }else{
                
                res = Math.min(res, (right - left + 1));
                sum -= nums[left];
                left ++;
            }

        }

        return (res == Integer.MAX_VALUE) ? 0 : res;
    }
}