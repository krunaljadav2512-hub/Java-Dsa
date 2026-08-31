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
    public static long taumBday(int b, int w, int bc, int wc, int z){
        long min_b = (long)Math.min(bc, wc + z) * b;
        
        long min_w = (long)Math.min(wc, bc + z) * w;
        
        return min_b + min_w;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++){
            
            int b = sc.nextInt();
            int w = sc.nextInt();
            
            int bc = sc.nextInt();
            int wc = sc.nextInt();
            
            int z = sc.nextInt();
            
            long result = taumBday(b,w,bc,wc,z);
            
            System.out.println(result);
        }
    }
}
