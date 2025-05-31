class NumArray {
    int[] arr;

    // [-2,0,3,-5,2,-1]
    // [-2,-2,1,-4,-2,-3]

    public NumArray(int[] nums) {
        int n = nums.length;
        arr = new int[n];
        arr[0] = nums[0];

        for(int i = 1; i < n ; i++){
            arr[i] = nums[i] + arr[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return (left == 0) ? arr[right]: arr[right] - arr[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */