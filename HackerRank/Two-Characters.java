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

    public static int alternate(String s) {
        ArrayList<Character> list = new ArrayList<>();


        for (char ch : s.toCharArray()) {
            if (!list.contains(ch)) {
                list.add(ch);
            }
        }

        int max = 0;


        for (int i = 0; i < list.size() - 1; i++) {

            for (int j = i + 1; j < list.size(); j++) {

                char first = list.get(i);
                char second = list.get(j);

                char previous = '\0';
                int length = 0;
                boolean isValid = true;

            
                for (char ch : s.toCharArray()) {

                    if (ch == first || ch == second) {

                        if (ch == previous) {
                            isValid = false;
                            break;
                        }

                        previous = ch;
                        length++;
                    }
                }

                if (isValid && length > max) {
                    max = length;
                }
            }
        }

        return max;
    }    
}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = Result.alternate(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
