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
    public static void breakingRecords(int n, int score[]){
        int high = score[0];
        int low = score[0];
        int high_brack = 0, low_brack = 0;
        
        for(int i = 1; i < n; i++){
            if(high < score[i]){
                high = score[i];
                high_brack++;
            }
            if(low > score[i]){
                low = score[i];
                low_brack++;
            }
        }
        System.out.print(high_brack+" "+low_brack);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int score[] = new int[n];
        
        for(int i = 0; i < n; i++){
            score[i] = sc.nextInt();
        }
        breakingRecords(n, score);
    }
}
