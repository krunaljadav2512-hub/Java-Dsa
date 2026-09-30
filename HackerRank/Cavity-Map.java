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

    public static List<String> cavityMap(List<String> grid) {
        
        for(int i = 1; i < grid.size() - 1; i++){
            
            for(int j = 1; j < grid.size() - 1; j++){
                
                int n = Integer.valueOf(grid.get(i).charAt(j));
                
                int up = Integer.valueOf(grid.get(i - 1).charAt(j));
                int right = Integer.valueOf(grid.get(i).charAt(j + 1));
                int down = Integer.valueOf(grid.get(i + 1).charAt(j));
                int left = Integer.valueOf(grid.get(i).charAt(j - 1));
                
                if(n > up && n > right && n > down && n > left){
                    
                    StringBuilder row = new StringBuilder(grid.get(i));
                    
                    row.setCharAt(j, 'X');
                    
                    grid.set(i, row.toString());
                }
            }
        }
        return grid;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> grid = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = Result.cavityMap(grid);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
