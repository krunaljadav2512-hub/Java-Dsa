/*
    Problem: 1470 - Shuffle the Array

    Time Complexity: O(n)

    Space Complexity: O(n)
*/
class Solution{
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int x = 0;
        int y = n;
        for(int i = 0; i < ans.length; i++){
            if(i % 2 == 0){
                ans[i] = nums[x++];
            }
            else{
                ans[i] = nums[y++];
            }
        }
        return ans;
    }
}