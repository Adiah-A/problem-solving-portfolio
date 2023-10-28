class Solution {
    public int[] productExceptSelf(int[] nums) {
        //store the product of teh product before each number to teh product after each number
        int[] res = new int[nums.length];

        int productSoFar = 1;

        for(int i = 0; i < nums.length; i++){
            res[i] = productSoFar;
            productSoFar *= nums[i];
        }

        int productAfter = 1;

        for(int i = nums.length - 2; i >= 0; i--){
            productAfter *= nums[i+1];
           res[i] = res[i] * productAfter;
        }

        return res;

    }
}