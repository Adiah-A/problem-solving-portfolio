class Solution {
    public boolean canJump(int[] nums) {
        //The idea is to go form teh back, and see if the next number 
        //can actually bring me to teh back
        

        //Have an integer totalNeeded repping teh total needed sum to get to [n-1]
        //Go through teh array form teh last number and see if the next (previous)
        //number at any step can bring me to teh back

        int totalNeeded = 1; //what you will need from [n-2] to get to [n-1]
        int n = nums.length;

        for(int i = n-2; i >= 0; i --){
            if(nums[i] >= totalNeeded){ // everything fits soo far
                totalNeeded = 1; //Since everything fits now, reset it for next iteration
            }else{
                totalNeeded ++; // you will need one more jump to make up
            }
        }

        return (totalNeeded == 1);
    }
}