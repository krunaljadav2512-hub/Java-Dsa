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
    public static long repeatedString(String s, long n){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        long l = n / s.length();
        
        long freq = l * count;
        
        long j = n % s.length();
        
        for(int i = 0; i < j; i++){
            if(s.charAt(i) == 'a'){
                freq++;
            }
        }
        return freq;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        long n = sc.nextLong();
        long result = repeatedString(s, n);
        
        System.out.print(result);
        
    }
}
