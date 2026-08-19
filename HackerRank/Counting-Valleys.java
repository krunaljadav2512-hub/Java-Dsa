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

class Solution{
    public static int countingValleys(int steps, String path){
        int curr = 0;
        int valley = 0;

        for(int i = 0; i < steps; i++){
          if(path.charAt(i) == 'D'){
            curr--;
          }
          else{
            curr++;
            if(curr == 0){
              valley++;
            }
          }      
        }
        return valley;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int steps = sc.nextInt();
        String path = sc.next();
        
        int result = countingValleys(steps, path);
        System.out.print(result);
    }
}