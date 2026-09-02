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

public class Solution{
    public static int saveThePrisoner(int n, int m, int s){
        return ((s + m - 2) % n) + 1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
        sc.close();
    }
}
