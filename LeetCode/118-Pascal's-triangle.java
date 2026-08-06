/*
    Time Complexity: O(n²)

    Space Complexity: O(n)
*/
import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> MainList = new ArrayList<>();
        ArrayList<Integer> Prev = new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            ArrayList<Integer> Row = new ArrayList<>();
            Row.add(1);

            for(int j = 1; j < Prev.size(); j++){
                int sum = Prev.get(j - 1) + Prev.get(j);
                Row.add(sum);
            }
            if(i > 0){
                Row.add(1);
            }
            MainList.add(Row);
            Prev = Row;
        }
        return MainList;
    }
}