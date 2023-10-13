class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for(Integer num : nums){
            set.add(num);
        }

        int longestSequence = 0;

        for(Integer num : nums){
            //If it is the first number
            if(!set.contains(num-1)){
                int currNum = num;
                int currLongestPath = 0;

                while(set.contains(currNum)){
                    currNum ++; /*since num was teh 1st number for this sequence, 
                                        find teh rest of numbers for that sequence*/
                    currLongestPath ++;
                }

                longestSequence = Math.max(longestSequence, currLongestPath);
            }
        }

        return longestSequence;

    }
}