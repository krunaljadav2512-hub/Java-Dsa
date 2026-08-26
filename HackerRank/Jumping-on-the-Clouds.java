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
    public static int jumpingOnClouds(int c[]){
        int jumps = 0;
        int i = 0; 
        while(i < c.length-1){
            if(i + 2 < c.length && c[i+2] == 0){
                i += 2;
            }
            else{
                i += 1;
            }
            jumps++;
        }
        return jumps;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c[] = new int[n];
        
        for(int i = 0; i < n; i++){
            c[i] = sc.nextInt();
        }
        int result = jumpingOnClouds(c);
        System.out.print(result);
    }
}