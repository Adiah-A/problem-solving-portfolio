class Solution {
    public int pivotIndex(int[] nums) {
        //[1,7,3,6,5,6]
        //[1,8,11,17,22,28]
        //Go through prefix sum array and see what teh sum on each side excluding teh current pivot is
        int n = nums.length;
        int res = -1;
        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for(int i = 1; i < n; i ++){
            prefix[i] = nums[i] + prefix[i-1];
        }

        for(int pivot = 0; pivot < n ; pivot ++){
            int leftSum = (pivot > 0) ? prefix[pivot - 1] : 0;
            int rightSum = (pivot < n-1) ? prefix[n-1] -  prefix[pivot]: 0;

            if(leftSum == rightSum){
                return pivot;
            }
        }

        return res;
    }

}