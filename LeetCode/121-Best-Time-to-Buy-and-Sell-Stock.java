/*
    Time Complexity: O(n)

    Space Complexity: O(1)
*/
class Solution {
    public int maxProfit(int[] prices) {
        int MaxProfit = 0;
        int minPrice = prices[0];
    
        for(int i = 1; i < prices.length; i++){
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }
            else{
                int  profit = prices[i] - minPrice;
                if(profit > MaxProfit){
                    MaxProfit = profit;
                }
            }
            
        }
        return MaxProfit;
    }
}