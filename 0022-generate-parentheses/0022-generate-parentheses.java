class Solution {
    public List<String> generateParenthesis(int n) {
     List<String> result = new ArrayList<>();
        backtrack("", n, n, result);
        return result;
    }

    private static void backtrack(String current, int leftCount, int rightCount, List<String> result) {
        if (leftCount == 0 && rightCount == 0) {
            result.add(current);
            return;
        }

        if (leftCount > 0) {
            backtrack(current + "(", leftCount - 1, rightCount, result);
        }
        
        if (rightCount > leftCount) {
            backtrack(current + ")", leftCount, rightCount - 1, result);
        }
    }
}