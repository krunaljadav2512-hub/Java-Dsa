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
    public static void divisibleSumPairs(int n, int k, int arr[]){
        int count = 0; 
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if((arr[i] + arr[j]) % k == 0){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        divisibleSumPairs(n,k,arr);
    }
}
