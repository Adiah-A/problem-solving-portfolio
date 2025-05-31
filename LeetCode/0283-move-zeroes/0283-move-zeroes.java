class Solution {
    public void moveZeroes(int[] nums) {
    
       //move left by one as long as it is less than right and not 0
       //if zero, use right to find next non-zero and exchange. then move left by one
       int n = nums.length;
       int left = 0;

       for(int right = 0; right < n; right ++){
        if(nums[left] == 0){
            if(nums[right] == 0){
                continue;
            }else{
                nums[left] = nums[right];
                nums[right] = 0;
                left ++;
                continue;
            }
        }else{
            left ++;
            continue;
        }
       }

    }
}