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
    public static int chocolateFeast(int n, int c, int m){
        int chocolates = n / c;
        int wrappers = chocolates;
        
        while(wrappers >= m){
            int newChocolates = wrappers/m;
            wrappers = wrappers % m + newChocolates;
            chocolates += newChocolates;
        }
        
        return chocolates;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();
            
            int result = chocolateFeast(n, c, m);
            
            System.out.println(result);
        }
    }
}
