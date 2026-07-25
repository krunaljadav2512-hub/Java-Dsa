/*
 Problem: 2011. Final Value of Variable After Performing Operations

 Time Complexity: O(n)
 Space Complexity: O(1)
*/

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;

        for(int i = 0; i < operations.length; i++){
            String op = operations[i];

            if(op.equals("X++") || op.equals("++X")){
                X++;
            }
            else if(op.equals("X--") || op.equals("--X")){
                X--;
            }
        }

        return X;
    }
}