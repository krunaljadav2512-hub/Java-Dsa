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

    public static int minimumNumber(int n, String password) {
        int addChar = 0;
        boolean hasNum = false;
        boolean hasLower = false;
        boolean hasUper = false;
        boolean hasSpecial = false;
        
        for(int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);
            
            if(Character.isDigit(ch)){
                hasNum = true;
            }
            else if(Character.isLowerCase(ch)){
                hasLower = true;
            }
            else if(Character.isUpperCase(ch)){
                hasUper = true;
            }
            else if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)){
                hasSpecial = true;
            }
            
        }
        if(!hasLower) addChar++;
        if(!hasUper) addChar++;
        if(!hasNum) addChar++;
        if(!hasSpecial) addChar++;
        
        
        
        return Math.max(addChar, 6 - n);
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
