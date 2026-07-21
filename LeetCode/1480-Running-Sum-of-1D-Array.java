/*
 Problem: 1480. Running Sum of 1D Array

 Time Complexity: O(n)
 Space Complexity: O(n)
*/
class Solution{
     public int[] runningSum(int[] nums) {
        int[] sumarr = new int[nums.length];
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            sumarr[i] = sum;
        }

        return sumarr;
    }
}
