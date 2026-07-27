/*
    Problem: 27 - Remove Element

    Time Complexity: O(n)

    Space Complexity: O(1);
*/
class Solution {
    public int removeElement(int[] nums, int val) {
        
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
               nums[i] = nums[j];
               i++;
            }
        }
        
        return i;
    }
}