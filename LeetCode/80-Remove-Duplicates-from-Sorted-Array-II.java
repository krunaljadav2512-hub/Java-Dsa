/*
    Problem: 80 - Remove Duplicates from Sorted Array II

    Time Complexity: O(n)

    Space Complexity: O(1)
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        for(int j = 2; j < nums.length; j++){
            if(nums[j] != nums[k - 2]){
                nums[k] = nums[j];
                k++;
            }
        }
        return k;
    }
}