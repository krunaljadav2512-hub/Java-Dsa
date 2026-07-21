/*
 Problem: 1672. Richest Customer Wealth

 Time Complexity: O(m × n)
 Space Complexity: O(1)
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for(int i = 0; i < accounts.length; i++){
            int sum = 0;

            for(int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }

            if(max < sum){
                max = sum;
            }
        }

        return max;
    }
}