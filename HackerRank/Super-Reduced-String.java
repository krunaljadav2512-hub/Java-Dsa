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

    public static String superReducedString(String s) {
        
        StringBuilder superString = new StringBuilder(s);
        
        
        int i = 0;
        while(i < superString.length() - 1){
            if(superString.charAt(i) == superString.charAt(i + 1)){
                
                superString.delete(i, i + 2);
                
                if(i > 0){
                    i--;
                }
            }
            
            else{
                i++;
            }
        }
        
        if(superString.length() == 0){
            return "Empty String";
        }
        
        return superString.toString();
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
