import java.io.*;
import java.util.stream.*;

class Result {

    public static String hackerrankInString(String s) {
        String target = "hackerrank";
        int j = 0; 
        int i = 0;
        
        while(j < target.length() && i < s.length()){
            char ch = s.charAt(i);
            
            if(target.charAt(j) == ch){
                j++;
            }
            i++;
        }
        if(j == target.length()){
            return "YES";
        }
        return "NO";
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.hackerrankInString(s);

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
