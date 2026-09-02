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
    public static int viralAdvertising(int n){
        int total = 0;
        int share = 5;
        for(int i = 0; i < n; i++){
            int like = share/2;
            
            total += like;
            
            share = like * 3;
        }
        return total;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int result = viralAdvertising(n);
        System.out.print(result);
    }
}
