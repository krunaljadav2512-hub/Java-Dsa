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

    public static String happyLadybugs(String b) {
        
        int[] count = new int[26];
        boolean hasEmpty = b.contains("_");
        
        for(int i = 0; i < b.length(); i++){
            char ch = b.charAt(i);
            
            if(ch != '_'){
                count[ch - 'A']++;
            }
        }
        
        if(!hasEmpty){
            
            for(int i = 0; i < b.length(); i++){
                char ch = b.charAt(i);
                
                boolean left = (i > 0 && b.charAt(i - 1) == ch);
                boolean right = (i < b.length() - 1 && b.charAt(i + 1) == ch);
                
                if(!left && !right){
                    return "NO";
                }
            }
            return "YES";
        }
        
        for(int i = 0; i < 26; i++){
            if(count[i] == 1){
                return "NO";
            }
        }
        return "YES";
    }
}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, g).forEach(gItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                String b = bufferedReader.readLine();

                String result = Result.happyLadybugs(b);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
