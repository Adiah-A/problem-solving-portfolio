class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0 || prices.length == 1){
            return 0;
        }

        int minStock = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for(int i = 0; i < prices.length; i ++){
            minStock = Math.min(minStock, prices[i]);
            
            maxProfit = Math.max(maxProfit, prices[i]- minStock);
        }

       /* int smallestIndex = 0;
        int biggestIndex = 1;

        int smallestValue = Integer.MAX_VALUE;
        int biggestValue = Integer.MIN_VALUE;

        int maxProfit = 0;

        while(biggestIndex < prices.length){
            if(prices[smallestIndex] < smallestValue){
                smallestValue = prices[smallestIndex];
                biggestValue = smallestValue;
            }

            if(prices[biggestIndex] > biggestValue){
                biggestValue = prices[biggestIndex];
            }

            if(biggestValue > smallestValue && (biggestValue - smallestValue) > maxProfit){
                maxProfit = biggestValue - smallestValue;
            }

            smallestIndex ++;
            biggestIndex ++;
        }*/

        return maxProfit;
    }
}