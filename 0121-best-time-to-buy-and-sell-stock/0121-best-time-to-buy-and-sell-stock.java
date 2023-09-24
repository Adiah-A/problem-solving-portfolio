class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1){
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxDifference = Integer.MIN_VALUE;

        for(int i = 0; i < prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            maxDifference = Math.max(maxDifference, prices[i] - minPrice);
        }

        return maxDifference;

    }
}