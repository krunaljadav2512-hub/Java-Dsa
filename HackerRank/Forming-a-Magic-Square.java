import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static int formingMagicSquare(List<List<Integer>> s) {
        int[][][] magicSqrs = new int[8][3][3];
        magicSqrs[0] = new int[][] {
                    {8, 1, 6},
                    {3, 5, 7},
                    {4, 9, 2}
                };
        //Rotation       
        for(int i = 1; i < magicSqrs.length; i++){
            
            for(int row = 0; row < 3; row++){
                
                for(int col = 0; col < 3; col++){
                    
                    magicSqrs[i][col][2 - row] = magicSqrs[i - 1][row][col];
                }
            }
        }
        //flipping
        for(int k = 0; k < 4; k++){
            for(int row = 0; row < 3; row++){
                for(int col = 0; col < 3; col++){
                    magicSqrs[k + 4][row][2 - col] = magicSqrs[k][row][col];
                }
            }
        }
        
        //Mnimum cost
        int minCost = Integer.MAX_VALUE;
        
        for(int k = 0; k < 8; k++){
            int cost = 0;
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    cost += Math.abs(
                        s.get(i).get(j) - magicSqrs[k][i][j]
                    );
                }
            }
            
            minCost = Math.min(cost, minCost);
        }
        
        return minCost;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> s = new ArrayList<>();

        IntStream.range(0, 3).forEach(i -> {
            try {
                s.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
