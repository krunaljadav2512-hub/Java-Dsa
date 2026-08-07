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
    public static void countApplesandOranges(int s, int t, int a, int b, int m, int n, int apples[], int oranges[]){
        int app_count = 0;
        int ora_count = 0;
        
        for(int i = 0; i < m; i++){
            int dis = apples[i] + a;
            if(dis >= s && dis <= t){
                app_count++;
            }
        }
        for(int i = 0; i < n; i++){
            int dis = oranges[i] + b;
            if(dis >= s && dis <= t){
                ora_count++;
            }
        }
        System.out.println(app_count);
        System.out.println(ora_count);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int apples[] = new int[m];
        int oranges[] = new int [n];
        
        for(int i = 0; i < m; i++){
            apples[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            oranges[i] = sc.nextInt();
        }
        countApplesandOranges(s, t, a, b, m, n, apples, oranges);
    }
}
