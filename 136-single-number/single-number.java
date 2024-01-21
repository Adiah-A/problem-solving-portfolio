class Solution {
    public int singleNumber(int[] nums) {

        int res = nums[0];

        //not very necessary precaustions
        if(nums.length == 1){
            return res;
        }

        //XOR of each resulting number with teh next one.
        for(int i = 1; i < nums.length; i++){
            res ^= nums[i];
        }
        
        return res;
    }
}