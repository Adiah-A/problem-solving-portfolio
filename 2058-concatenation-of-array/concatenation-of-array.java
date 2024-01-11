class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] concatenated = new int[2 * nums.length];
        
        System.arraycopy(nums, 0, concatenated, 0, nums.length);
        System.arraycopy(nums, 0, concatenated, nums.length, nums.length);

        return concatenated;
    }
}