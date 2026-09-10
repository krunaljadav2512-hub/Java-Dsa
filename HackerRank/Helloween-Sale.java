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
    public static int howManyGames(int p, int d, int m, int s){
        int games = 0;
        int totalCost = 0;
        
        while(totalCost + p <= s){
            
            totalCost += p;
            games++;
            
            if(p - d >= m){   
                p = p - d; 
            }
            
            else{
                p = m;
            }
            
        }
        return games;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int p = sc.nextInt();
        int d = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        
        int result = howManyGames(p,d,m,s);
        
        System.out.print(result);
    }
}
