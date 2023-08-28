class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        dfsBactrack(nums, 0, result, new ArrayList<Integer>());
        return result;
    }

    private void dfsBactrack(int[] nums, int index, List<List<Integer>> result, List<Integer> currList){
        result.add(new ArrayList<Integer>(currList));

        for(int i = index; i < nums.length; i++){
            currList.add(nums[i]);
            dfsBactrack(nums, i+1, result, currList);
            currList.remove(currList.size()-1);
        }
    }
}