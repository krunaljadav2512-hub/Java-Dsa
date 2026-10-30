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

    public static String caesarCipher(String s, int k) {
        
        StringBuilder rotated = new StringBuilder();
        k = k % 26;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(Character.isLowerCase(ch)){
                char newCh = (char)('a' + (ch - 'a' + k) % 26);
                
                rotated.append(newCh);
            }
            else if(Character.isUpperCase(ch)){
                char newCh = (char)('A' + (ch - 'A' + k) % 26);
                
                rotated.append(newCh);
            }
            else{
                rotated.append(ch);
            }
        }
        
        return rotated.toString();
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
